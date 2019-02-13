/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.constant.AuthCodeStatus
 * Created By: Jonathan 
 * Created on: 2014年11月21日 下午3:54:57
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.constant;

/**
 * <P>验证码状态</P>
 * @author Jonathan
 */
public enum AuthCodeStatus {
	VALID(1, "有效"), INVALID(0, "无效");

	private Integer value;
	private String name;

	private AuthCodeStatus(Integer value, String name) {
		this.value = value;
		this.name = name;
	}

	public static AuthCodeStatus getAuthCodeStatus(Integer value) {
		for (AuthCodeStatus e : AuthCodeStatus.values()) {
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
