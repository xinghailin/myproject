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
public enum TSignStatus {
	VALID(1, "签名成功"), INVALID(0, "签名失败");

	private Integer value;
	private String name;

	private TSignStatus(Integer value, String name) {
		this.value = value;
		this.name = name;
	}

	public static TSignStatus getAuthCodeStatus(Integer value) {
		for (TSignStatus e : TSignStatus.values()) {
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
