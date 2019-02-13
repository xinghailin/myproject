package com.yyq.car.portal.common.service.sms.provider.mongate;

import java.util.ArrayList;
import java.util.List;

import org.ufa.core.service.BaseService;

import com.yyq.car.portal.common.constant.SmsStatus;
import com.yyq.car.portal.common.dto.SmsDeliveryResult;
import com.yyq.car.portal.common.dto.SmsStatusReport;
import com.yyq.car.portal.common.service.sms.provider.ISmsProvider;
import com.yyq.car.portal.common.service.sms.provider.mongate.util.WmgwLocator;


public class MongateSmsProvider extends BaseService implements ISmsProvider {

	private String accountId;

	private String password;

	private String url;

	@Override
	public List<SmsDeliveryResult> send(String content, List<String> mobile) {

		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.yyq.cloud.portal.common.service.sms.provider.ISmsProvider#send(java.lang.String,
	 * java.lang.String)
	 * @author Jonathan
	 */
	@Override
	public SmsDeliveryResult send(String content, String mobile) {
		WmgwLocator wmgwLocator = new WmgwLocator();
		SmsDeliveryResult result = new SmsDeliveryResult();
		result.setStatus(SmsStatus.FAILED.getValue());
		result.setResultMessage("发送失败");
		wmgwLocator.setWmgwSoapEndpointAddress(url);

		try {
			String resultCode = wmgwLocator.getWmgwSoap().mongateCsSpSendSmsNew(accountId, password, mobile, content, 1, "*");
			logger.info("梦网返回结果{}", resultCode);
			// 可根据返回值位数判断提交是否成功，如果返回的流水大于10位小于25位为提交成功
			if (resultCode.length() > 10 && resultCode.length() < 25) {
				result.setStatus(SmsStatus.SUBMIT.getValue());
				result.setResultMessage("提交成功");
				logger.info("短信提交成功");
			}
			result.setResultCode(resultCode);

		} catch (Throwable e) {
			e.printStackTrace();
			logger.error("短信发送异常");
			result.setResultMessage("短信发送异常");
		}
		return result;

	}

	/*
	 * (non-Javadoc)
	 * @see com.yyq.cloud.portal.common.service.sms.provider.ISmsProvider#querySmsStatusReport()
	 * @author Jonathan
	 */
	@Override
	public List<SmsStatusReport> querySmsStatusReport() {
		WmgwLocator wmgwLocator = new WmgwLocator();
		wmgwLocator.setWmgwSoapEndpointAddress(url);
		List<SmsStatusReport> list = new ArrayList<SmsStatusReport>();
		try {
			String[] results = wmgwLocator.getWmgwSoap().mongateCsGetStatusReportExEx(accountId, password);
			if (results != null && results.length > 0) {
				for (String result : results) {
					logger.debug("获取短信状态:{}", result);
					String[] fileds = result.split(",");
					SmsStatusReport smsStatusReport = new SmsStatusReport();
					smsStatusReport.setCode(fileds[2]);
					String smsStatus = fileds[4];
					switch (smsStatus) {
						case "0":
							smsStatusReport.setStatus(SmsStatus.SUCCESS);
							break;
						case "2":
							smsStatusReport.setStatus(SmsStatus.FAILED);
							break;
						case "1":
							smsStatusReport.setStatus(SmsStatus.CHANNEL_WAITING);
							break;
						default:
							logger.error("Code{}的短信状态为{}", fileds[2], smsStatus);
							break;
					}
					list.add(smsStatusReport);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("获取短信状态报告异常");
		}
		return list;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
