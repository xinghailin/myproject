/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.constant.VerifyCodeType
 * Created By: Jonathan 
 * Created on: 2014年11月21日 上午2:06:05
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.constant;

/**
 * <P>验证码类型</P>
 * @author Jonathan
 */
public enum AuthCodeType {
	REGISTER(1, "注册", 10, false), FIND_PASSWORD(2, "找回密码", 11, false), BIND_MOBILE(6, "绑定手机", 13, true), OTHER(4, "其他", 14, true), MODIFY_PASSWORD(3, "修改密码",
			15, true);

	private Integer value;
	private String name;
	private Integer templateId;
	private Boolean isSecured;

	private AuthCodeType(Integer value, String name, Integer templateId, Boolean isSecured) {
		this.value = value;
		this.name = name;
		this.templateId = templateId;
		this.isSecured = isSecured;
	}

	public static AuthCodeType getAuthCodeType(Integer value) {
		for (AuthCodeType e : AuthCodeType.values()) {
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

	public Integer getTemplateId() {
		return templateId;
	}

	public Boolean getIsSecured() {
		return isSecured;
	}

}
