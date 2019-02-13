package com.yyq.car.portal.common.model.biz;

import java.util.Date;


public class BizInvoiceFile implements Comparable<BizInvoiceFile> {
	private Integer id;

	private Integer invoiceid;

	private Integer type;

	private String address;

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

	public Integer getInvoiceid() {
		return invoiceid;
	}

	public void setInvoiceid(Integer invoiceid) {
		this.invoiceid = invoiceid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
	@Override
	public int compareTo(BizInvoiceFile o) {
		int re = this.getType() - o.getType();
		if (re == 0) {
			return this.getSort() - o.getSort();
		}
		return re;
	}
}