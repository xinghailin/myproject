/*******************************************************************************
 * Project   : car-common
 * Class Name: com.yyq.car.portal.common.dto.WeixinOauth2Token
 * Created By: wangzh 
 * Created on: 2017年8月31日 下午5:09:06
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.dto;

/**
 * <P>网页授权信息</P>
 * @author wangzh
 */
public class WeixinOauth2Token {

	// 网页授权接口调用凭证
	private String accessToken;
	// 凭证有效时长
	private int expiresIn;
	// 用于刷新凭证
	private String refreshToken;
	// 用户标识
	private String openId;
	// 用户授权作用域
	private String scope;

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

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WeixinOauth2Token [accessToken=");
		builder.append(accessToken);
		builder.append(", expiresIn=");
		builder.append(expiresIn);
		builder.append(", refreshToken=");
		builder.append(refreshToken);
		builder.append(", openId=");
		builder.append(openId);
		builder.append(", scope=");
		builder.append(scope);
		builder.append("]");
		return builder.toString();
	}

}
