/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.constant.LoginAccountType
 * Created By: Jonathan 
 * Created on: 2014-8-8 下午4:36:03
 * Copyright © 2008-2014 NATIE All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.constant;

/**
 * <P>登录类型</P>
 * @author Jonathan
 */
public enum LoginType {

	EMAIL(1, "邮箱"), MOBILE(2, "手机"), NICK_NAME(3, "昵称");

	private Integer value;
	private String name;

	private LoginType(Integer value, String name) {
		this.value = value;
		this.name = name;
	}

	public static LoginType getLoginAccountType(Integer value) {
		for (LoginType e : LoginType.values()) {
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
