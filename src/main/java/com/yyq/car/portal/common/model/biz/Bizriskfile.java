package com.yyq.car.portal.common.model.biz;

import java.util.Date;


public class Bizriskfile implements Comparable<Bizriskfile> {
	private Integer id;

	private Integer riskid;

	private Integer contractid;

	private String filecode;

	private String address;

	private String type;

	private Date createtime;

	private int sort;

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRiskid() {
		return riskid;
	}

	public void setRiskid(Integer riskid) {
		this.riskid = riskid;
	}

	public Integer getContractid() {
		return contractid;
	}

	public void setContractid(Integer contractid) {
		this.contractid = contractid;
	}

	public String getFilecode() {
		return filecode;
	}

	public void setFilecode(String filecode) {
		this.filecode = filecode == null ? null : filecode.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * @author wangzh
	 */
	/**
	 * 用来风控进件时的排序
	 */
	@Override
	public int compareTo(Bizriskfile o) {
		if (this.getType().length() - o.getType().length() > 0) {
			return 1;
		} else if (this.getType().length() - o.getType().length() == 0) {
			int re = Integer.parseInt(this.getType()) - Integer.parseInt(o.getType());
			if (re == 0) {
				return this.getSort() - o.getSort();
			}
			return re;
		} else {
			return -1;
		}
	}
}