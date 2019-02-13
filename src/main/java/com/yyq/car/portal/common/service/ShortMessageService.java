package com.yyq.car.portal.common.service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.ufa.core.annotation.PropertyValue;
import org.ufa.core.service.BaseService;

import com.yyq.car.portal.common.constant.ExceptionCode;
import com.yyq.car.portal.common.constant.MessageTemplateStatus;
import com.yyq.car.portal.common.constant.SmsStatus;
import com.yyq.car.portal.common.dto.SmsDeliveryResult;
import com.yyq.car.portal.common.dto.SmsStatusReport;
import com.yyq.car.portal.common.exception.PortalAppCheckedException;
import com.yyq.car.portal.common.mapper.comm.MessageTemplateMapper;
import com.yyq.car.portal.common.mapper.comm.ShortMessageMapper;
import com.yyq.car.portal.common.model.comm.MessageTemplate;
import com.yyq.car.portal.common.model.comm.ShortMessage;
import com.yyq.car.portal.common.service.sms.provider.ISmsProvider;


/**
 * <P>TODO</P>
 * @author Jonathan
 */
// @Service("shortMessageService")
@Service
public class ShortMessageService extends BaseService {

	@Autowired
	private MessageTemplateMapper messageTemplateMapper;

	@Autowired
	private ShortMessageMapper shortMessageMapper;

	@PropertyValue("sms.repeatTimes")
	private int repeatTimes;

	@Autowired
	private ISmsProvider smsProvider;

	/**
	 * <p>发送短消息</p>
	 * @param parameters
	 * @param mobileNo
	 * @param templateId
	 * @return
	 * @author Jonathan
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, timeout = 3)
	public SmsDeliveryResult sendShortMessage(Map<String, String> parameters, String mobileNo, Integer templateId, Integer bizObjectId) {
		logger.info("发送短信入参：变量值{}，手机号{}，模板号{}", parameters, mobileNo, templateId);
		if (mobileNo != null && mobileNo.trim().length() == 0) {
			mobileNo = null;
		}
		Assert.notNull(mobileNo, "目标手机号码不能为空!!");

		SmsDeliveryResult smsDeliveryResult = new SmsDeliveryResult();
		smsDeliveryResult.setStatus(SmsStatus.FAILED.getValue());
		smsDeliveryResult.setResultMessage("发送失败");

		try {
			MessageTemplate messageTemplate = createMessageByTemplateId(templateId, parameters);
			List<String> mobileNoList = new ArrayList<String>();
			mobileNoList.add(mobileNo);
			List<SmsDeliveryResult> results = sendShortMessageByProvider(mobileNoList, messageTemplate, bizObjectId);
			if (results != null) {
				smsDeliveryResult = results.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
			smsDeliveryResult.setStatus(SmsStatus.FAILED.getValue());
			smsDeliveryResult.setResultMessage(e.getMessage());
			logger.error(e.getMessage());
		}
		logger.info("返回结果{}", smsDeliveryResult);
		return smsDeliveryResult;
	}

	/**
	 * <p>群发短消息</p>
	 * 
	 * @param parameters
	 * @param mobileNoList
	 * @param templateId
	 * @return
	 * @author Jonathan
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, timeout = 3)
	public List<SmsDeliveryResult> sendShortMessage(Map<String, String> parameters, List<String> mobileNoList, Integer templateId, Integer bizObjectId) {
		logger.info("发送短信入参：变量值{}，手机号{}，模板号{}", parameters, mobileNoList, templateId);
		if (mobileNoList != null && mobileNoList.size() == 0) {
			mobileNoList = null;
		}
		Assert.notNull(mobileNoList, "目标手机号码不能为空!!");
		Assert.notEmpty(parameters, "初始化参数不能为空!!");
		List<SmsDeliveryResult> results = Collections.emptyList();
		try {
			MessageTemplate contentTemplate = createMessageByTemplateId(templateId, parameters);
			results = sendShortMessageByProvider(mobileNoList, contentTemplate, bizObjectId);
		} catch (PortalAppCheckedException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return results;
	}

	/**
	 * <p>批量发送短信消息 根据不同的手机号码定制不同的模板内容</p>
	 * 
	 * @param mobileMap
	 * @param templateId
	 * @return
	 * @author lidongfu_2005@sina.com
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, timeout = 3)
	public List<SmsDeliveryResult> sendShortMessage(Map<String, Map<String, String>> mobileMap, Integer templateId, Integer bizObjectId) {
		logger.info("发送短信入参：变量值{}，模板号{}", mobileMap, templateId);
		Assert.notEmpty(mobileMap, "初始化参数不能为空!!");
		List<SmsDeliveryResult> results = new ArrayList<SmsDeliveryResult>();
		List<String> mobileNoList = Collections.emptyList();
		try {
			Map<String, MessageTemplate> _mobileMap = new HashMap<String, MessageTemplate>();
			for (Map.Entry<String, Map<String, String>> entry : mobileMap.entrySet()) {
				mobileNoList = new ArrayList();
				Map parameters = entry.getValue();
				MessageTemplate contentTemplate = createMessageByTemplateId(templateId, parameters);
				mobileNoList.add(entry.getKey());
				List<SmsDeliveryResult> resultsTmp = sendShortMessageByProvider(mobileNoList, contentTemplate, bizObjectId);
				results.add(resultsTmp.get(0));
			}
		} catch (PortalAppCheckedException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return results;
	}
	
	/**
	 * <p>批量发送短信，无需模板</p>
	 * @param mobileList :手机号集合
	 * @param content:短信内容
	 * @return
	 * @author nj
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, timeout = 3)
	public List<SmsDeliveryResult> sendShortMessage(List<String> mobileList,String content) {
		List<SmsDeliveryResult> results = new ArrayList<SmsDeliveryResult>();
		try {
			MessageTemplate contentTemplate = new MessageTemplate();
			contentTemplate.setContent(content);
			List<String> mobileNoList = Collections.emptyList();
			for(String mobile : mobileList){
				mobileNoList = new ArrayList();
				mobileNoList.add(mobile);
				List<SmsDeliveryResult> resultsTmp = sendShortMessageByProvider(mobileNoList, contentTemplate, null);
				results.add(resultsTmp.get(0));
			}
            
		} catch (PortalAppCheckedException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return results;
	}

	/**
	 * <p>调用短信网关发送短信</p>
	 * @param mobileNoList
	 * @param messageTemplate
	 * @return
	 * @author Jonathan
	 */
	private synchronized List<SmsDeliveryResult> sendShortMessageByProvider(List<String> mobileNoList, MessageTemplate messageTemplate, Integer bizObjectId) {
		logger.info("开始调用短信网关");
		// int repeatTimes = 1;
		// int maxRepeatTimesInt = Integer.parseInt(maxRepeatTimes);
		List<ShortMessage> shortMessages = new ArrayList<ShortMessage>();
		// 存入待发送短信内容
		for (String mobileNo : mobileNoList) {
			ShortMessage shortMessage = saveShortMessage(messageTemplate.getId(), messageTemplate.getContent(), mobileNo, bizObjectId);
			shortMessage.setStatus(SmsStatus.FAILED.getValue());
			shortMessages.add(shortMessage);
		}

		List<SmsDeliveryResult> results = Collections.emptyList();
		// for (int i = 1; i <= maxRepeatTimesInt; i++) {
		// repeatTimes = i;
		try {
			if (mobileNoList.size() == 1) {
				SmsDeliveryResult result = smsProvider.send(messageTemplate.getContent(), mobileNoList.get(0));
				results = new ArrayList<SmsDeliveryResult>();
				results.add(result);
			} else {
				results = smsProvider.send(messageTemplate.getContent(), mobileNoList);
			}

		} catch (Throwable e) {
			logger.error(e.getMessage());
			SmsDeliveryResult smsDeliveryResult = new SmsDeliveryResult();
			smsDeliveryResult.setStatus(SmsStatus.FAILED.getValue());
			smsDeliveryResult.setResultMessage(e.getMessage());
			results.add(smsDeliveryResult);
			e.printStackTrace();
		}
		// }
		// 回写发送结果
		logger.info("开始更新短信发送结果");
		int index = 0;
		for (int i = 0; i < results.size(); i++) {
			SmsDeliveryResult result = results.get(index);
			for (ShortMessage shortMessage : shortMessages) {
				shortMessage.setStatus(result.getStatus());
				// if (result.getStatus() == SmsStatus.SUCCESS.getValue())
				// shortMessage.setStatus(SmsStatus.SUCCESS.getValue());
				// else
				// shortMessage.setStatus(SmsStatus.FAILED.getValue());
				shortMessage.setResultCode(result.getResultCode());
				shortMessage.setSendTime(new Date());
				shortMessageMapper.updateByPrimaryKey(shortMessage);
			}
		}
		logger.info("调用移动网关返回结果{}", results);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
			logger.error("调用短信休眠出现异常{}", e1);
		}
		return results;
	}

	/**
	 * 
	 * <p>通过模板id来短信初始化</p>
	 * 
	 * @param templateId
	 * @param parameters
	 * @return 短信内容
	 * @throws PortalAppCheckedException
	 */

	private MessageTemplate createMessageByTemplateId(Integer templateId, Map<String, String> parameters) throws PortalAppCheckedException {
		logger.info("初始化短信入参:模板编号{}，模板参数{}", templateId, parameters);
		MessageTemplate messageTemplate = messageTemplateMapper.selectByPrimaryKey(templateId);
		logger.info("获取模板{}", messageTemplate);
		if (MessageTemplateStatus.ENABLE.getTemplateState() != messageTemplate.getStatus()) {
			logger.info("模板为不可用状态{}", messageTemplate.getStatus());
			messageTemplate = null;
		}

		if (messageTemplate != null) {
			String smsTemplateContent = configParameters(messageTemplate.getContent(), parameters);
			logger.info("根据模板{}生成短信内容为【{}】", templateId, smsTemplateContent);
			try {
				if (smsTemplateContent.equals(new String(smsTemplateContent.getBytes("ISO8859-1"), "ISO8859-1"))) {
					smsTemplateContent = new String(smsTemplateContent.getBytes("ISO8859-1"), "UTF-8");
				}
				messageTemplate.setContent(smsTemplateContent);
				return messageTemplate;
			} catch (UnsupportedEncodingException e) {
				logger.error("短信内容编码转换错误{}", templateId);
				throw new PortalAppCheckedException(ExceptionCode.TEMPLATE_ENCODING_ERROR, "短信内容编码转换错误");
			}

		} else {
			logger.error("没有查询到可用的短信模板{}", templateId);
			throw new PortalAppCheckedException(ExceptionCode.TEMPLATE_NOT_TO_FIND, "没有查询到可用的短信模板");
		}

	}

	private ShortMessage saveShortMessage(Integer templateId, String smsTemplateContent, String mobile, Integer bizObjectId) {
		ShortMessage shortMessage = new ShortMessage();
		shortMessage.setContent(smsTemplateContent);
		shortMessage.setCreateTime(new Date());
		shortMessage.setSendTime(new Date());
		shortMessage.setMobile(mobile);
		shortMessage.setStatus(SmsStatus.WAITING.getValue());
		shortMessage.setTemplateId(templateId);
		shortMessage.setBizObjectId(bizObjectId);
		try {
			shortMessageMapper.insertSelective(shortMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("短信信息待发送入库{}", shortMessage);
		return shortMessage;
	}

	/**
	 * 
	 * <p>将短信模板中的占位符替换成MAP中的参数值</p>
	 * 
	 * @param smsTemplateContent
	 * @param msgParameters
	 * @return
	 * @author 
	 */
	private String configParameters(String smsTemplateContent, Map<String, String> msgParameters) throws PortalAppCheckedException {
		StringBuffer content = new StringBuffer();
		if (smsTemplateContent != null && smsTemplateContent.trim().length() > 0) {
			StringBuffer key = null;

			for (int i = 0; i < smsTemplateContent.length(); i++) {

				char charItem = smsTemplateContent.charAt(i);
				if ('{' == charItem) {
					if (key != null) {
						throw new PortalAppCheckedException(ExceptionCode.TEMPIATE_FAILED_TO_INIT, "模板初始化参数有误");
					}
					key = new StringBuffer();
					key = key.append(charItem);
				} else if ('}' == charItem) {
					if (key == null) {
						throw new PortalAppCheckedException(ExceptionCode.TEMPIATE_FAILED_TO_INIT, "模板初始化参数有误");
					}
					String keyValue = key.toString().replace("{", "");
					if (keyValue == null || keyValue.trim().length() == 0) {
						throw new PortalAppCheckedException(ExceptionCode.TEMPIATE_FAILED_TO_INIT, "模板初始化参数有误");
					}
					String initValue = msgParameters.get(keyValue);
					if (initValue == null || initValue.trim().length() == 0) {
						logger.error("模板初始化参数有误，未找到{}对应的值", keyValue);
						throw new PortalAppCheckedException(ExceptionCode.TEMPIATE_FAILED_TO_INIT, "模板初始化参数有误，未找到" + keyValue + "对应的值");

					}
					content.append(msgParameters.get(keyValue));
					key = null;
				} else {
					if (key == null) {
						content.append(charItem);
					} else {
						key = key.append(charItem);
					}
				}

			}
			if (key != null) {
				throw new PortalAppCheckedException(ExceptionCode.TEMPIATE_FAILED_TO_INIT, "模板初始化参数有误");
			}
		}
		if (content.length() == 0) {
			throw new PortalAppCheckedException(ExceptionCode.TEMPIATE_FAILED_TO_INIT, "模板初始化参数有误");
		}
		return content.toString();
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, timeout = 3)
	public void updateSmsDeliveryReport() {
		logger.debug("开始获取短信发送状态");
		List<SmsStatusReport> results = smsProvider.querySmsStatusReport();
		logger.debug("短信发送状态信息:{}", results);
		for (SmsStatusReport result : results) {
			logger.debug("更新短信发送状态:{}", result);
			shortMessageMapper.updateSmsDeliveryReport(result.getCode(), result.getStatus().getValue());
		}
	}

	/**
	 * @return the repeatTimes
	 */
	public int getRepeatTimes() {
		return repeatTimes;
	}

	/**
	 * @param repeatTimes the repeatTimes to set
	 */
	public void setRepeatTimes(int repeatTimes) {
		this.repeatTimes = repeatTimes;
	}

	/**
	 * @return the smsProvider
	 */
	public ISmsProvider getSmsProvider() {
		return smsProvider;
	}

	/**
	 * @param smsProvider the smsProvider to set
	 */
	public void setSmsProvider(ISmsProvider smsProvider) {
		this.smsProvider = smsProvider;
	}

	/**
	 * @return the messageTemplateMapper
	 */
	public MessageTemplateMapper getMessageTemplateMapper() {
		return messageTemplateMapper;
	}

	/**
	 * @param messageTemplateMapper the messageTemplateMapper to set
	 */
	public void setMessageTemplateMapper(MessageTemplateMapper messageTemplateMapper) {
		this.messageTemplateMapper = messageTemplateMapper;
	}

	/**
	 * @return the shortMessageMapper
	 */
	public ShortMessageMapper getShortMessageMapper() {
		return shortMessageMapper;
	}

	/**
	 * @param shortMessageMapper the shortMessageMapper to set
	 */
	public void setShortMessageMapper(ShortMessageMapper shortMessageMapper) {
		this.shortMessageMapper = shortMessageMapper;
	}
}
