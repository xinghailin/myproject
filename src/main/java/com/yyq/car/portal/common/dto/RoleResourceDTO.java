package com.yyq.car.portal.common.dto;

import org.springframework.security.core.CredentialsContainer;

import com.yyq.car.portal.common.model.auth.Resource;

public class RoleResourceDTO extends Resource implements CredentialsContainer {
	@Override
	public void eraseCredentials() {

	}
	
	private Integer roleId;
	private String roleName;
	private Integer startPage;
	private Integer pageSize;
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Integer getStartPage() {
		return startPage;
	}
	public void setStartPage(Integer startPage) {
		this.startPage = startPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}		
	
}
