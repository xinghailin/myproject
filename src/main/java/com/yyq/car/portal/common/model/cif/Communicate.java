package com.yyq.car.portal.common.model.cif;

import java.util.Date;


public class Communicate {
	private Integer id;

	private Integer sellerId;

	private Integer clientId;

	private Integer newclientid;

	private String content;

	private Date createTime;

	public Integer getNewclientid() {
		return newclientid;
	}

	public void setNewclientid(Integer newclientid) {
		this.newclientid = newclientid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}