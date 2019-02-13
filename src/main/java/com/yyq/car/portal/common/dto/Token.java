/*******************************************************************************
 * Project   : car-common
 * Class Name: com.yyq.car.portal.common.dto.Token
 * Created By: wangzh 
 * Created on: 2017年8月31日 下午5:10:27
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.dto;

/**
 * <P>凭证</P>
 * @author wangzh
 */
public class Token {

	// 接口访问凭证
	private String accessToken;
	// 凭证有效期，单位：秒
	private int expiresIn;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public int getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

}
