/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.constant.CommonStatus
 * Created By: Jonathan 
 * Created on: 2014年12月5日 下午1:44:39
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.constant;

/**
 * <P>TODO</P>
 * @author Jonathan
 */
public enum CommonStatus {
	INVALID(0, "无效"), VALID(1, "有效"), WAITING_APPROVAE(2, "待审核");

	private Integer value;
	private String name;

	private CommonStatus(Integer value, String name) {
		this.value = value;
		this.name = name;
	}

	public static CommonStatus getCommonStatus(Integer value) {
		for (CommonStatus e : CommonStatus.values()) {
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
