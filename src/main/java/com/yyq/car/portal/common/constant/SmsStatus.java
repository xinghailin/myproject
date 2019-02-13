package com.yyq.car.portal.common.constant;

/**
 * <P>短信发送状态</P>
 * @author Jonathan
 */
public enum SmsStatus {

	WAITING(2, "待发送"), SUCCESS(1, "发送成功"), FAILED(0, "发送失败"), SUBMIT(3, "提交成功"), CHANNEL_WAITING(4, "渠道待发送");

	private Integer value;
	private String name;

	private SmsStatus(Integer value, String name) {
		this.value = value;
		this.name = name;
	}

	public static SmsStatus getSmsStatus(Integer value) {
		for (SmsStatus e : SmsStatus.values()) {
			if (e.value.equals(value)) {
				return e;
			}
		}
		return null;
	}

	public Integer getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
}
