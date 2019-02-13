/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.dto.SequenceType
 * Created By: Jonathan 
 * Created on: 2014年12月9日 下午7:35:06
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.constant;

/**
 * <P>TODO</P>
 * @author Jonathan
 */
public enum SequenceType {

	BILL_NO(903, "支付流水号"), ORDER_CODE(902, "订单编号"), SECKILL(900, "秒杀"), MEMBER(102, "会员"), COMMON(901, "通用"), MEMBER_DESIGNER(106, "设计师"), MEMBER_SUPPLIER(107,
			"供应商"), MEMBER_DEVELOPER(108, "开发商"), REFUND_NO(909, "退款编号"), INITIATOR(119, "砍价");

	private Integer value;
	private String name;

	private SequenceType(Integer value, String name) {
		this.value = value;
		this.name = name;
	}

	public static SequenceType getSequenceType(Integer value) {
		for (SequenceType e : SequenceType.values()) {
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
