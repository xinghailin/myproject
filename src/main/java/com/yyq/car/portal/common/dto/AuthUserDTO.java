package com.yyq.car.portal.common.dto;

import com.yyq.car.portal.common.model.auth.User;

public class AuthUserDTO extends User {
     
	private Integer pageSize;
    
	private Integer startPage;
    
	public Integer getPageSize() {
		return pageSize;
	}
    
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
    
	public Integer getStartPage() {
		return startPage;
	}
    
	public void setStartPage(Integer startPage) {
		this.startPage = startPage;
	}
    
	
	
}
