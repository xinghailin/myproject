package com.yyq.car.portal.common.dto;

import java.io.Serializable;


/**
 * <P>TODO</P>
 * @author Jonathan
 */
public class SmsDeliveryResult implements Serializable {

	/**
	* TODO
	*/
	private static final long serialVersionUID = 5198858411181122460L;

	// 短信发送状态
	private int status;

	// 短信发送返回信息
	private String resultMessage;

	// 短信通道商编码
	private String resultCode;

	/**
	 * @return the resultMessage
	 */
	public String getResultMessage() {
		return resultMessage;
	}

	/**
	 * @param resultMessage the resultMessage to set
	 */
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

}
