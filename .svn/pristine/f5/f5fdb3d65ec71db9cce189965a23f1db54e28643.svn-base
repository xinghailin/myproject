/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.dto.LoginResultDTO
 * Created By: Jonathan 
 * Created on: 2014年10月24日 下午3:58:05
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.dto;

import java.io.Serializable;

import com.yyq.car.portal.common.util.PasswordUtils;


/**
 * <P>登陆后返回信息</P>
 * @author Jonathan
 */
public class LoginInfoDTO implements Serializable {

	/**
	 * TODO
	 */
	private static final long serialVersionUID = 6848589397085769982L;

	/**
	 * 登陆后生成SESSION ID
	 */
	private String sessionId;

	/**
	 * 会员账户ID
	 */
	private String accountId;

	/**
	 * 性别
	 */
	private String gender;

	/**
	 * 实名类型
	 */
	private String type;

	/**
	 * 昵称
	 */
	private String nickname;

	/**
	 * 密码
	 */
	private String password;
	/**
	 * 会员所属企业id
	 */
	private Integer orgId;

	/**
	 * 用户头像
	 */
	private String avatar;

	/**
	 * 我的总积分
	 */
	private String integral;
	/**
	 * 我的手机号
	 */
	private String mobile;
	/**
	 * 会员类型
	 */
	private String memberType;
	/**
	 * 会员类型 B端,C端
	 */
	private char mType;

	private String name;// 名称
	private String businessScope;// 经营范围
	private String education;// 学历
	private String style;// 设计风格
	private String province;// 省
	private String area;// 地区
	private String contact;// 联系方式

	private String status;// 账户状态 0:冻结 1:正常

	private String auth;// 认证状态

	/**
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * @param sessionId the sessionId to set
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the nickName
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickName the nickName to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return PasswordUtils.decryptPassord(password);
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getIntegral() {
		return integral;
	}

	public void setIntegral(String integral) {
		this.integral = integral;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public char getmType() {
		return mType;
	}

	public void setmType(char mType) {
		this.mType = mType;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBusinessScope() {
		return businessScope;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

}
