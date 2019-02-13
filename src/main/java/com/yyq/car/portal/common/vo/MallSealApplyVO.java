package com.yyq.car.portal.common.vo;

import java.util.Date;


public class MallSealApplyVO {
  
    private String sealtime_s;

    private Date sealtime;
    
    private String mallcontractcode;
    
    private Integer start;
    
    private Integer pageSize;
    
    private String username;
    
    private String subcode;
    
    private String skucode;
    
    private String subordercode;
    
	
	public String getMallcontractcode() {
		return mallcontractcode;
	}

	public void setMallcontractcode(String mallcontractcode) {
		this.mallcontractcode = mallcontractcode;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getSealtime_s() {
		return sealtime_s;
	}

	public void setSealtime_s(String sealtime_s) {
		this.sealtime_s = sealtime_s;
	}

	public Date getSealtime() {
		return sealtime;
	}

	public void setSealtime(Date sealtime) {
		this.sealtime = sealtime;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSubcode() {
		return subcode;
	}

	public void setSubcode(String subcode) {
		this.subcode = subcode;
	}

	public String getSkucode() {
		return skucode;
	}

	public void setSkucode(String skucode) {
		this.skucode = skucode;
	}

	public String getSubordercode() {
		return subordercode;
	}

	public void setSubordercode(String subordercode) {
		this.subordercode = subordercode;
	}

    
}