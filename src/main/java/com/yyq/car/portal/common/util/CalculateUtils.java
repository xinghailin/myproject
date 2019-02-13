/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.util.CalculateUtils
 * Created By: mjy 
 * Created on: 2014年12月5日 上午11:23:47
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.util;

import com.yyq.car.portal.common.constant.ExceptionCode;
import com.yyq.car.portal.common.exception.PortalBizCheckedException;


/**
 * <P>TODO</P>
 * @author mjy
 */
public class CalculateUtils {
	/**
	 * 
	 * <p>计算总页数</p>
	 * @param count 数据总记录数
	 * @param pageSize 每页显示数
	 * @return  int
	 * @author mjy
	 */
	public static int CalculateTotalPage(int count, int pageSize) {
		int totalPage = 0;
		if (pageSize == 0) {
			throw new PortalBizCheckedException(ExceptionCode.PAGESIZE_ZERO_INCORRECT);
		}
		if (count != 0) {
			int t = count % pageSize;
			int p = count / pageSize;
			if (t == 0) {
				totalPage = p;
			} else {
				totalPage = p + 1;
			}
		}
		return totalPage;
	}
}
