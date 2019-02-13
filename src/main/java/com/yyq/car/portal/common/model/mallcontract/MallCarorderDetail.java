package com.yyq.car.portal.common.model.mallcontract;

import java.math.BigDecimal;
import java.util.Date;


public class MallCarorderDetail implements Comparable<MallCarorderDetail> {
	private String id;

	private Integer sourceid;

	private String skucode;

	private String ordercode;

	private String subordercode;

	private String contractcode;

	private Date createtime;

	private String verifier;

	private Integer verifystatus;

	private String description;

	private BigDecimal receivedmoney;

	private Integer currency;

	private String unit;

	private String rate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public Integer getSourceid() {
		return sourceid;
	}

	public void setSourceid(Integer sourceid) {
		this.sourceid = sourceid;
	}

	public String getSkucode() {
		return skucode;
	}

	public void setSkucode(String skucode) {
		this.skucode = skucode == null ? null : skucode.trim();
	}

	public String getOrdercode() {
		return ordercode;
	}

	public void setOrdercode(String ordercode) {
		this.ordercode = ordercode == null ? null : ordercode.trim();
	}

	public String getSubordercode() {
		return subordercode;
	}

	public void setSubordercode(String subordercode) {
		this.subordercode = subordercode == null ? null : subordercode.trim();
	}

	public String getContractcode() {
		return contractcode;
	}

	public void setContractcode(String contractcode) {
		this.contractcode = contractcode == null ? null : contractcode.trim();
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getVerifier() {
		return verifier;
	}

	public void setVerifier(String verifier) {
		this.verifier = verifier == null ? null : verifier.trim();
	}

	public Integer getVerifystatus() {
		return verifystatus;
	}

	public void setVerifystatus(Integer verifystatus) {
		this.verifystatus = verifystatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public BigDecimal getReceivedmoney() {
		return receivedmoney;
	}

	public void setReceivedmoney(BigDecimal receivedmoney) {
		this.receivedmoney = receivedmoney;
	}

	public Integer getCurrency() {
		return currency;
	}

	public void setCurrency(Integer currency) {
		this.currency = currency;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit == null ? null : unit.trim();
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate == null ? null : rate.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", sourceid=").append(sourceid);
		sb.append(", skucode=").append(skucode);
		sb.append(", ordercode=").append(ordercode);
		sb.append(", subordercode=").append(subordercode);
		sb.append(", contractcode=").append(contractcode);
		sb.append(", createtime=").append(createtime);
		sb.append(", verifier=").append(verifier);
		sb.append(", verifystatus=").append(verifystatus);
		sb.append(", description=").append(description);
		sb.append(", receivedmoney=").append(receivedmoney);
		sb.append(", currency=").append(currency);
		sb.append(", unit=").append(unit);
		sb.append(", rate=").append(rate);
		sb.append("]");
		return sb.toString();
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * @author wangzh
	 */
	@Override
	public int compareTo(MallCarorderDetail o) {
		// TODO Auto-generated method stub
		return this.getVerifystatus().intValue() - o.getVerifystatus().intValue();
	}

}