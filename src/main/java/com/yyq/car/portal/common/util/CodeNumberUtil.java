/*******************************************************************************
 * Project   : decorate-portal-common
 * Class Name: com.yyq.decorate.portal.common.util.CodeNumberUtil
 * Created By: mjy 
 * Created on: 2015年12月29日 上午10:11:59
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.util;

import java.util.HashMap;
import java.util.Map;


/**
 * <P>根据传入的 二维码 序列 获取查询条件 </P>
 * @author lkd
 */
public class CodeNumberUtil {

	/* 三种类型 */
	public final static int HOME = 3; // 样板房
	public final static int ROOM = 4; // 房间
	public final static int PRODUCT = 7;// 产品
	public final static int PRODUCT_NEW = 5;// 新产品长度

	/**
	 * 	0	 1		|	2	 3	 4	    5	  6           7
	 *  类别-产品类型-开发商-楼盘-样板房-房间-供应商/设计师-产品
	 *  样板房 (开发商-楼盘-样板房)
	 *  房间    (开发商-楼盘-样板房-房间)
	 *  产品    (产品类型-开发商-楼盘-样板房-房间-供应商/设计师-产品)(老版本)
	 *  产品    (labitu-产品类型-二级分类-三级分类-产品编号)(新版本)
	 * <p>TODO</p>
	 * @param code
	 * @return
	 * @author lkd
	 */
	public static Map<String, Object> getQueryConditionByFirstNumber(String code) {
		Map<String, Object> result = new HashMap<String, Object>();
		if (!"".equals(code) && code != null) {
			Integer length = code.split("-").length;
			if (code.contains("-") && length >= 3) {
				if (length == 3 || length == 4 || length == 7 || length == 5) {
					switch (length) {
						case HOME:
							result.put("type", 1);
							break;
						case ROOM:
							result.put("type", 2);
							break;
						case PRODUCT:
							result.put("type", 3);
							break;
						case PRODUCT_NEW:
							result.put("type", 5);
					}
					result.put("queryCondition", code);
				} else {
					result.put("error", "二维码格式不正确");
				}
			} else {
				result.put("error", "二维码格式不正确");
			}
		} else {
			result.put("error", "二维码不能为空");
		}
		return result;
	}

	public static void main(String[] args) {
		String x = "产品类型-开发商-楼盘-样板房-房间-供应商/设计师-产品";
		System.err.println(CodeNumberUtil.getQueryConditionByFirstNumber(x));
		String productNew = "labitu-1-2-3-lkdpro";
		// System.err.println(CodeNumberUtil.getQueryConditionByFirstNumber(productNew));
		System.err.println(productNew.split("-")[4]);

	}
}
