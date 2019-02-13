/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.dto.AlipayWebPayParamDTO
 * Created By: Jonathan 
 * Created on: 2014年12月10日 下午12:03:20
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.dto;

import java.util.Map;

/**
 * <P>TODO</P>
 * @author Jonathan
 */
public class AlipayWebPayParamDTO {

	private String requestUrl;

	private Map<String, String> param;

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	public Map<String, String> getParam() {
		return param;
	}

	public void setParam(Map<String, String> param) {
		this.param = param;
	}

}
