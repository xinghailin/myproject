package com.yyq.car.portal.common.constant;

/**
 * <P>模板可用状态</P>
 * 
 */
public enum MessageTemplateStatus {

	ENABLE(1, "生效"), DISABLE(0, "已禁用");

	private MessageTemplateStatus(Integer templateState, String templateStateName) {
		this.templateState = templateState;
		this.templateStateName = templateStateName;
	}

	public Integer getTemplateState() {
		return templateState;
	}

	public String getTemplateStateName() {
		return templateStateName;
	}

	private Integer templateState;
	private String templateStateName;

	public static MessageTemplateStatus getTemplateStateEnum(Integer templateState) {
		for (MessageTemplateStatus e : MessageTemplateStatus.values()) {
			if (e.templateState == templateState) {
				return e;
			}
		}
		return null;
	}
}
