/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.constant.AccountStatus
 * Created By: Jonathan 
 * Created on: 2014-8-8 下午5:09:28
 * Copyright © 2008-2014 NATIE All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.constant;

/**
 * <P>TODO</P>
 * @author Jonathan
 */
public enum AccountStatus {
	DISABLED(0, "未启用"), ENABLE(1, "正常"), LOCKED(2, "锁定"), REVOCATED(3, "已注销");

	private Integer value;
	private String name;

	private AccountStatus(Integer value, String name) {
		this.value = value;
		this.name = name;
	}

	public static AccountStatus getLoginAccountType(Integer value) {
		for (AccountStatus e : AccountStatus.values()) {
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
