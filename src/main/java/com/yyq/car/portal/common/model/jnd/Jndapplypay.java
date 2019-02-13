package com.yyq.car.portal.common.model.jnd;

import java.math.BigDecimal;
import java.util.Date;


public class Jndapplypay {
	private Integer id;

	private Integer subbuyid;

	private Integer num;

	private Integer tostoreid;

	private Date appointtime;

	private Date paytime;

	private BigDecimal totalprice;

	private BigDecimal rebate;

	private BigDecimal othercost;

	private BigDecimal latecost;

	private BigDecimal salecost;

	private BigDecimal insurance;

	private BigDecimal expensetax;

	private Date createtime;

	private String status;

	private String supplyname;

	private String config;

	private String outcolor;

	private String incolor;

	private String adjust;

	private BigDecimal cmsn1;// 佣金

	private BigDecimal cmsn2;

	private BigDecimal cmsn3;

	private BigDecimal cmsn4;

	private BigDecimal cmsn5;

	private BigDecimal other1;// 其他费用

	private BigDecimal other2;

	private BigDecimal other3;

	private BigDecimal other4;

	private BigDecimal other5;

	private BigDecimal transcost;// 运费

	private String transname;// 运输方

	private String paytype;// 付款类型1全款2预定

	private BigDecimal downpay;// 定金

	private BigDecimal shouldfp;// 自动计算出的应付尾款

	private BigDecimal finalpay;// 尾款

	private Date downpaytime;// 定金付款审核通过时间

	private Date finalpaytime;// 尾款

	private String downpayoperater;// 定金操作者

	private String finalpayoperater;// 尾款

	private String contract;// 合同编号

	private String reason;// 不通过的理由

	private Integer currency;// 货币 1 加币 2美元

	private Integer country;// 国家1 加拿大 2中东

	public Integer getCurrency() {
		return currency;
	}

	public void setCurrency(Integer currency) {
		this.currency = currency;
	}

	public Integer getCountry() {
		return country;
	}

	public void setCountry(Integer country) {
		this.country = country;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public BigDecimal getShouldfp() {
		return shouldfp;
	}

	public void setShouldfp(BigDecimal shouldfp) {
		this.shouldfp = shouldfp;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public BigDecimal getCmsn1() {
		return cmsn1;
	}

	public void setCmsn1(BigDecimal cmsn1) {
		this.cmsn1 = cmsn1;
	}

	public BigDecimal getCmsn2() {
		return cmsn2;
	}

	public void setCmsn2(BigDecimal cmsn2) {
		this.cmsn2 = cmsn2;
	}

	public BigDecimal getCmsn3() {
		return cmsn3;
	}

	public void setCmsn3(BigDecimal cmsn3) {
		this.cmsn3 = cmsn3;
	}

	public BigDecimal getCmsn4() {
		return cmsn4;
	}

	public void setCmsn4(BigDecimal cmsn4) {
		this.cmsn4 = cmsn4;
	}

	public BigDecimal getCmsn5() {
		return cmsn5;
	}

	public void setCmsn5(BigDecimal cmsn5) {
		this.cmsn5 = cmsn5;
	}

	public BigDecimal getOther1() {
		return other1;
	}

	public void setOther1(BigDecimal other1) {
		this.other1 = other1;
	}

	public BigDecimal getOther2() {
		return other2;
	}

	public void setOther2(BigDecimal other2) {
		this.other2 = other2;
	}

	public BigDecimal getOther3() {
		return other3;
	}

	public void setOther3(BigDecimal other3) {
		this.other3 = other3;
	}

	public BigDecimal getOther4() {
		return other4;
	}

	public void setOther4(BigDecimal other4) {
		this.other4 = other4;
	}

	public BigDecimal getOther5() {
		return other5;
	}

	public void setOther5(BigDecimal other5) {
		this.other5 = other5;
	}

	public BigDecimal getTranscost() {
		return transcost;
	}

	public void setTranscost(BigDecimal transcost) {
		this.transcost = transcost;
	}

	public String getTransname() {
		return transname;
	}

	public void setTransname(String transname) {
		this.transname = transname;
	}

	public String getPaytype() {
		return paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public BigDecimal getDownpay() {
		return downpay;
	}

	public void setDownpay(BigDecimal downpay) {
		this.downpay = downpay;
	}

	public BigDecimal getFinalpay() {
		return finalpay;
	}

	public void setFinalpay(BigDecimal finalpay) {
		this.finalpay = finalpay;
	}

	public Date getDownpaytime() {
		return downpaytime;
	}

	public void setDownpaytime(Date downpaytime) {
		this.downpaytime = downpaytime;
	}

	public Date getFinalpaytime() {
		return finalpaytime;
	}

	public void setFinalpaytime(Date finalpaytime) {
		this.finalpaytime = finalpaytime;
	}

	public String getDownpayoperater() {
		return downpayoperater;
	}

	public void setDownpayoperater(String downpayoperater) {
		this.downpayoperater = downpayoperater;
	}

	public String getFinalpayoperater() {
		return finalpayoperater;
	}

	public void setFinalpayoperater(String finalpayoperater) {
		this.finalpayoperater = finalpayoperater;
	}

	public String getConfig() {
		return config;
	}

	public String getOutcolor() {
		return outcolor;
	}

	public String getIncolor() {
		return incolor;
	}

	public String getAdjust() {
		return adjust;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public void setOutcolor(String outcolor) {
		this.outcolor = outcolor;
	}

	public void setIncolor(String incolor) {
		this.incolor = incolor;
	}

	public void setAdjust(String adjust) {
		this.adjust = adjust;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSubbuyid() {
		return subbuyid;
	}

	public void setSubbuyid(Integer subbuyid) {
		this.subbuyid = subbuyid;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getTostoreid() {
		return tostoreid;
	}

	public void setTostoreid(Integer tostoreid) {
		this.tostoreid = tostoreid;
	}

	public Date getAppointtime() {
		return appointtime;
	}

	public void setAppointtime(Date appointtime) {
		this.appointtime = appointtime;
	}

	public Date getPaytime() {
		return paytime;
	}

	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}

	public BigDecimal getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(BigDecimal totalprice) {
		this.totalprice = totalprice;
	}

	public BigDecimal getRebate() {
		return rebate;
	}

	public void setRebate(BigDecimal rebate) {
		this.rebate = rebate;
	}

	public BigDecimal getOthercost() {
		return othercost;
	}

	public void setOthercost(BigDecimal othercost) {
		this.othercost = othercost;
	}

	public BigDecimal getLatecost() {
		return latecost;
	}

	public void setLatecost(BigDecimal latecost) {
		this.latecost = latecost;
	}

	public BigDecimal getSalecost() {
		return salecost;
	}

	public void setSalecost(BigDecimal salecost) {
		this.salecost = salecost;
	}

	public BigDecimal getInsurance() {
		return insurance;
	}

	public void setInsurance(BigDecimal insurance) {
		this.insurance = insurance;
	}

	public BigDecimal getExpensetax() {
		return expensetax;
	}

	public void setExpensetax(BigDecimal expensetax) {
		this.expensetax = expensetax;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", subbuyid=").append(subbuyid);
		sb.append(", num=").append(num);
		sb.append(", tostoreid=").append(tostoreid);
		sb.append(", appointtime=").append(appointtime);
		sb.append(", paytime=").append(paytime);
		sb.append(", totalprice=").append(totalprice);
		sb.append(", rebate=").append(rebate);
		sb.append(", othercost=").append(othercost);
		sb.append(", latecost=").append(latecost);
		sb.append(", salecost=").append(salecost);
		sb.append(", insurance=").append(insurance);
		sb.append(", expensetax=").append(expensetax);
		sb.append(", createtime=").append(createtime);
		sb.append(", status=").append(status);
		sb.append("]");
		return sb.toString();
	}

	public String getSupplyname() {
		return supplyname;
	}

	public void setSupplyname(String supplyname) {
		this.supplyname = supplyname;
	}
}