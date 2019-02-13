package com.yyq.car.portal.common.model.biz;

import java.math.BigDecimal;
import java.util.Date;


public class Bizrisk {
	private Integer id;

	private Integer contractid;

	private String filecode;

	private String applybill;

	private String idfront;

	private String idside;

	private String driverprove;

	private String workprove;

	private String marryprove;

	private BigDecimal aproveprice;

	private BigDecimal missmoney;

	private String status;

	private String repairreason;

	private String refusereason;



	private Date createtime;


	private String dontagreereason;// 金融客户不同意审批首付金额的原因

	private String approvaltableurl;// 消费贷贷审会审批表

	public String getApprovaltableurl() {
		return approvaltableurl;
	}

	public void setApprovaltableurl(String approvaltableurl) {
		this.approvaltableurl = approvaltableurl;
	}

	public String getDontagreereason() {
		return dontagreereason;
	}

	public void setDontagreereason(String dontagreereason) {
		this.dontagreereason = dontagreereason;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getApplybill() {
		return applybill;
	}

	public void setApplybill(String applybill) {
		this.applybill = applybill == null ? null : applybill.trim();
	}

	public String getIdfront() {
		return idfront;
	}

	public void setIdfront(String idfront) {
		this.idfront = idfront == null ? null : idfront.trim();
	}

	public String getIdside() {
		return idside;
	}

	public void setIdside(String idside) {
		this.idside = idside == null ? null : idside.trim();
	}

	public String getDriverprove() {
		return driverprove;
	}

	public void setDriverprove(String driverprove) {
		this.driverprove = driverprove == null ? null : driverprove.trim();
	}

	public String getWorkprove() {
		return workprove;
	}

	public void setWorkprove(String workprove) {
		this.workprove = workprove == null ? null : workprove.trim();
	}

	public String getMarryprove() {
		return marryprove;
	}

	public void setMarryprove(String marryprove) {
		this.marryprove = marryprove == null ? null : marryprove.trim();
	}

	public BigDecimal getAproveprice() {
		return aproveprice;
	}

	public void setAproveprice(BigDecimal aproveprice) {
		this.aproveprice = aproveprice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getRepairreason() {
		return repairreason;
	}

	public void setRepairreason(String repairreason) {
		this.repairreason = repairreason == null ? null : repairreason.trim();
	}

	public String getRefusereason() {
		return refusereason;
	}

	public void setRefusereason(String refusereason) {
		this.refusereason = refusereason == null ? null : refusereason.trim();
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}



	public BigDecimal getMissmoney() {
		return missmoney;
	}

	public void setMissmoney(BigDecimal missmoney) {
		this.missmoney = missmoney;
	}
}