/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.dto.AccountDTO
 * Created By: Jonathan 
 * Created on: 2014-8-8 下午5:04:30
 * Copyright © 2008-2014 NATIE All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.dto;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.yyq.car.portal.common.constant.AccountStatus;
import com.yyq.car.portal.common.constant.LoginType;
import com.yyq.car.portal.common.util.PasswordUtils;



/**
 * <P>TODO</P>
 * @author Jonathan
 */
public class AccountDTO implements UserDetails, CredentialsContainer {

	private static final long serialVersionUID = 525225901341988221L;

	private LoginType loginType;

	private String loginName;

	private String gender;

	private Integer orgId;

	private Integer id;

	private String nickname;

	private String loginPassword;

	private Integer customerId;

	private Integer type;

	private Integer status;

	private Date serviceEndDate;

	private Date createTime;

	private String signature;

	private Collection<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();

	/*
	 * (non-Javadoc)
	 * @see org.springframework.security.core.CredentialsContainer#eraseCredentials()
	 * @author Jonathan
	 */
	@Override
	public void eraseCredentials() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#getAuthorities()
	 * @author Jonathan
	 */
	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		return authorities;
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#getPassword()
	 * @author Jonathan
	 */
	@Override
	public String getPassword() {
		return PasswordUtils.decryptPassord(getLoginPassword());
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#getUsername()
	 * @author Jonathan
	 */
	@Override
	public String getUsername() {
		return getNickname();
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonExpired()
	 * @author Jonathan
	 */
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonLocked()
	 * @author Jonathan
	 */
	@Override
	public boolean isAccountNonLocked() {
		return !AccountStatus.LOCKED.getValue().equals(getStatus());
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isCredentialsNonExpired()
	 * @author Jonathan
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isEnabled()
	 * @author Jonathan
	 */
	@Override
	public boolean isEnabled() {
		return AccountStatus.ENABLE.getValue().equals(getStatus());
	}

	/**
	 * @return the loginType
	 */
	public LoginType getLoginType() {
		return loginType;
	}

	/**
	 * @param loginType the loginType to set
	 */
	public void setLoginType(LoginType loginType) {
		this.loginType = loginType;
	}

	/**
	 * @return the loginName
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * @param loginName the loginName to set
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getServiceEndDate() {
		return serviceEndDate;
	}

	public void setServiceEndDate(Date serviceEndDate) {
		this.serviceEndDate = serviceEndDate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public void setAuthorities(Collection<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

}
