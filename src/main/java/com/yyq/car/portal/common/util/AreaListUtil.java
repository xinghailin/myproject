/*******************************************************************************
 * Project   : cloud-portal-common
 * Class Name: com.yyq.cloud.portal.common.util.GetAreaListUtil
 * Created By: mjy 
 * Created on: 2015年7月28日 下午3:35:46
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.util;

import java.util.Map;

import com.yyq.car.portal.common.constant.Constants;


/**
 * 获得地区列表
 * <P>TODO</P>
 * @author mjy
 */
public class AreaListUtil {
	public static Map getAreaList() {
		Map<String, Object> pMap = (Map<String, Object>) CachFactory.getInstance().get(Constants.MASTER_DATA_NO_SORT);
		// Map<String, Object> areaList = (Map<String, Object>)
		// pMap.get(MasterDataType.BIZ_AREA_ADDR.getValue());// 地区
		// return areaList;
		return null;
	}
}
