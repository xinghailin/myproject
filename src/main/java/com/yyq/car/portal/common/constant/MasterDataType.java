package com.yyq.car.portal.common.constant;

import java.util.HashMap;
import java.util.Map;


/**
 * <P>基础数据类型</P>
 * @author lidongfu
 */
public enum MasterDataType {

	PRICE("车辆价格", "1"), DEALER("经销商", "2");

	private String name;
	private String value;

	private MasterDataType(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public static String getName(String value) {
		for (MasterDataType c : MasterDataType.values()) {
			if (c.getValue().equals(value)) {
				return c.name;
			}
		}
		return null;
	}

	public static final Map<String, String> dmap = new HashMap<String, String>();

	static {
		for (MasterDataType bdt : MasterDataType.values()) {
			dmap.put(bdt.getValue(), bdt.getName());
		}

	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

}
