/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.portal.common.constant.AccountStatus
 * Created By: Jonathan 
 * Created on: 2014-8-8 下午5:09:28
 * Copyright © 2008-2014 NATIE All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.constant;

/**
 * <P>TODO</P>
 * @author Jonathan
 */
public enum UploadType {
	sync(0, "同步"), async(1, "异步");

	private Integer value;
	private String name;

	private UploadType(Integer value, String name) {
		this.value = value;
		this.name = name;
	}

	public static UploadType getUploadType(Integer value) {
		for (UploadType e : UploadType.values()) {
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
