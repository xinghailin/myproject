/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.service.AuthCodeService
 * Created By: Jonathan 
 * Created on: 2014年11月21日 下午2:53:54
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.ufa.log.Logger;
import org.ufa.log.LoggerFactory;

import com.yyq.car.portal.common.constant.AuthCodeType;
import com.yyq.car.portal.common.constant.Constants;
import com.yyq.car.portal.common.constant.ExceptionCode;
import com.yyq.car.portal.common.constant.SmsStatus;
import com.yyq.car.portal.common.exception.PortalBizCheckedException;
import com.yyq.car.portal.common.mapper.comm.AuthCodeMapper;
import com.yyq.car.portal.common.mapper.comm.ShortMessageMapper;
import com.yyq.car.portal.common.model.comm.AuthCode;
import com.yyq.car.portal.common.model.comm.ShortMessage;
import com.yyq.car.portal.common.service.async.sms.SmsDelegateService;
import com.yyq.car.portal.common.util.DateUtils;
import com.yyq.car.portal.common.util.PasswordUtils;


/**
 * <P>验证码服务</P>
 * @author Jonathan
 */
@Service
public class AuthCodeService {

	final private Logger logger = LoggerFactory.getLogger(AuthCodeService.class);

	/**
	 * 验证码超时时间
	 */
	final private Integer EXPIRE_DURATION = 600;

	/**
	 * 短信验证码参数
	 */
	final private String PARAM_AUTH_CODE = "authCode";

	@Autowired
	private AuthCodeMapper authCodeMapper;

	@Autowired
	private ShortMessageService shortMessageService;

	@Autowired
	private SmsDelegateService smsDelegateService;

	@Autowired
	private ShortMessageMapper shortMessageMapper;

	/**
	 * <p>发送验证码</p>
	 * @param mobile
	 * @param authCodeType
	 * @return
	 * @author Jonathan
	 */
	@Transactional(isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class, timeout = 3, propagation = Propagation.REQUIRED)
	public AuthCode sendAuthCode(String mobile, AuthCodeType authCodeType) {
		logger.debug("Begin AuthCodeService.sendAuthCode, 入参 - 手机号:{}, 模版号:{}", mobile, authCodeType.getTemplateId());
		// 产生随机验证码
		String code = generateAuthCode();
		// 创建验证码对象
		AuthCode authCode = new AuthCode();
		authCode.setMobile(mobile);
		authCode.setCreateTime(new Date());
		authCode.setType(authCodeType.getValue().toString());
		authCode.setCode(code);
		authCode.setDuration(EXPIRE_DURATION);// 失效时间默认为600秒
		authCode.setStatus(Constants.AUTHCODE_STATUS_Y);// 状态为有效
		// 保存验证码
		addAuthCode(authCode);
		// 开始发送验证码
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put(PARAM_AUTH_CODE, code);
		smsDelegateService.process(mobile, authCodeType.getTemplateId(), parameters, authCode.getId());
		// SmsDeliveryResult result=shortMessageService.sendShortMessage(parameters, mobile, ?);
		return authCode;
	}

	/**
	 * <p>检查验证码是否有效</p>
	 * @param authCodeId
	 * @param authCode
	 * @param mobile
	 * @author Jonathan
	 */
	@Transactional(isolation = Isolation.READ_COMMITTED, timeout = 3, propagation = Propagation.REQUIRED)
	public void validate(Integer authCodeId, String authCode, String mobile) throws PortalBizCheckedException {
		// 检查验证码ID是否有效
		AuthCode storedAuthCode = authCodeMapper.selectByPrimaryKey(authCodeId);
		if (storedAuthCode == null) {
			// throw new PortalBizCheckedException(ExceptionCode.AUTH_CODE_INCORRECT);
			throw new PortalBizCheckedException("验证码不正确");
		}
		int valid = DateUtils.getCurrentTime().compareTo(DateUtils.addSeconds(storedAuthCode.getCreateTime(), storedAuthCode.getDuration()));
		if (valid <= 0) {
			// 检查发送验证码的手机号与注册的手机号是否一致
			if (!mobile.equals(storedAuthCode.getMobile())) {
				// throw new PortalBizCheckedException(ExceptionCode.AUTH_MOBILE_NOT_MATCH);
				throw new PortalBizCheckedException("验证码手机不匹配");
			}
			if (!authCode.equals(storedAuthCode.getCode())) {
				// throw new PortalBizCheckedException(ExceptionCode.AUTH_CODE_INCORRECT);
				throw new PortalBizCheckedException("验证码不正确");
			}
			// ShortMessage querySample = new ShortMessage();
			// querySample.setBizObjectId(authCodeId);
			// List<ShortMessage> list = shortMessageMapper.selectByCriteria(querySample);
			// if (list != null && list.size() > 0) {
			// ShortMessage shortMessage = list.get(0);
			// logger.debug("找到该验证码发送的短信:{}", shortMessage);
			// if (SmsStatus.FAILED.getValue() == shortMessage.getStatus()) {
			// logger.debug("短信没有发送成功, 应该验证拒绝验证");
			// // 抛异常
			// }
			// } else {
			// logger.debug("未找到该验证码发送的短信, 拒绝此次验证");
			// // 抛异常
			// }

			// 更新验证码状态
			int result = authCodeMapper.updateAuthCodeStatus(authCodeId);
			if (result == 0) {
				// throw new PortalBizCheckedException(ExceptionCode.AUTH_CODE_EXPIRED);
				// throw new PortalBizCheckedException("验证码过期");
				logger.debug("验证码更新{}", result);
			}
		} else {
			// throw new PortalBizCheckedException(ExceptionCode.AUTH_CODE_EXPIRED);
			throw new PortalBizCheckedException("验证码过期");
		}
	}

	/**
	 * 
	 * <p>短信验证码校验 注册前校验 </p>
	 * @param authCodeId
	 * @param authCode
	 * @param mobile
	 * @throws PortalBizCheckedException
	 * @author lidongfu
	 */
	@Transactional(isolation = Isolation.READ_COMMITTED, timeout = 3, propagation = Propagation.REQUIRED)
	public void validateSmsAuthCode(Integer authCodeId, String authCode, String mobile) throws PortalBizCheckedException {
		// 检查验证码ID是否有效
		AuthCode storedAuthCode = authCodeMapper.selectByPrimaryKey(authCodeId);
		if (storedAuthCode == null) {
			throw new PortalBizCheckedException(ExceptionCode.AUTH_CODE_INCORRECT);
		}
		int valid = DateUtils.getCurrentTime().compareTo(DateUtils.addSeconds(storedAuthCode.getCreateTime(), storedAuthCode.getDuration()));
		if (valid <= 0) {
			// 检查发送验证码的手机号与注册的手机号是否一致
			if (!mobile.equals(storedAuthCode.getMobile())) {
				throw new PortalBizCheckedException(ExceptionCode.AUTH_MOBILE_NOT_MATCH);
			}
			if (!authCode.equals(storedAuthCode.getCode())) {
				throw new PortalBizCheckedException(ExceptionCode.AUTH_CODE_INCORRECT);
			}
			ShortMessage querySample = new ShortMessage();
			querySample.setBizObjectId(authCodeId);
			List<ShortMessage> list = shortMessageMapper.selectByCriteria(querySample);
			if (list != null && list.size() > 0) {
				ShortMessage shortMessage = list.get(0);
				logger.debug("找到该验证码发送的短信:{}", shortMessage);
				if (SmsStatus.FAILED.getValue() == shortMessage.getStatus()) {
					logger.debug("短信没有发送成功, 应该验证拒绝验证");
					// 抛异常
				}
			} else {
				logger.debug("未找到该验证码发送的短信, 拒绝此次验证");
				// 抛异常
			}
		} else {
			throw new PortalBizCheckedException(ExceptionCode.AUTH_CODE_EXPIRED);
		}
	}

	/**
	 * <p>新增验证码</p>
	 * @param code
	 * @return
	 * @author Jonathan
	 */

	private int addAuthCode(AuthCode code) {
		return authCodeMapper.insertSelective(code);
	}

	/**
	 * <p>产生随机验证码</p>
	 * @return
	 * @author Jonathan
	 */
	private String generateAuthCode() {
		return PasswordUtils.generateRandomPwd(4, PasswordUtils.PwdGeneratorType.NUMBER);
	}

	/**
	 * @return the shortMessageService
	 */
	public ShortMessageService getShortMessageService() {
		return shortMessageService;
	}

	/**
	 * @param shortMessageService the shortMessageService to set
	 */
	public void setShortMessageService(ShortMessageService shortMessageService) {
		this.shortMessageService = shortMessageService;
	}
}
