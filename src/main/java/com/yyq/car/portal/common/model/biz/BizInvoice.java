package com.yyq.car.portal.common.model.biz;

import java.math.BigDecimal;
import java.util.Date;


public class BizInvoice {
	private Integer id;

	private Integer conid;

	private String wsid;// 车辆批发主键

	private Integer carid;// 车辆批发车辆id

	private Integer typebig;

	private Integer typesmall;

	private BigDecimal amount;

	private String companyname;

	private String taxnum;

	private String openbank;

	private String banknum;

	private String runaddress;

	private String phone;

	private String identify;

	private Integer status;

	private Date createtime;

	private String creator;

	private String behalfpay;

	private BigDecimal settlementcarprice;

	private BigDecimal purchasetax;

	private BigDecimal insurance;

	private BigDecimal dynamicsupervise;

	private BigDecimal appointinsurance;

	private BigDecimal plateprice;

	private BigDecimal other1price;

	private String other1description;

	private BigDecimal other2price;

	private String other2description;

	private String backreason;

	private String nopassreason;

	private BigDecimal fsettlementcarprice;

	private BigDecimal fpurchasetax;

	private BigDecimal finsurance;

	private BigDecimal fdynamicsupervise;

	private BigDecimal fappointinsurance;

	private BigDecimal fplateprice;

	private BigDecimal fother1price;

	private String fother1description;

	private BigDecimal fother2price;

	private String fother2description;

	private String fbackreason;

	private String fnopassreason;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getConid() {
		return conid;
	}

	public void setConid(Integer conid) {
		this.conid = conid;
	}

	public Integer getTypebig() {
		return typebig;
	}

	public void setTypebig(Integer typebig) {
		this.typebig = typebig;
	}

	public Integer getTypesmall() {
		return typesmall;
	}

	public void setTypesmall(Integer typesmall) {
		this.typesmall = typesmall;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname == null ? null : companyname.trim();
	}

	public String getTaxnum() {
		return taxnum;
	}

	public void setTaxnum(String taxnum) {
		this.taxnum = taxnum == null ? null : taxnum.trim();
	}

	public String getOpenbank() {
		return openbank;
	}

	public void setOpenbank(String openbank) {
		this.openbank = openbank == null ? null : openbank.trim();
	}

	public String getBanknum() {
		return banknum;
	}

	public void setBanknum(String banknum) {
		this.banknum = banknum == null ? null : banknum.trim();
	}

	public String getRunaddress() {
		return runaddress;
	}

	public void setRunaddress(String runaddress) {
		this.runaddress = runaddress == null ? null : runaddress.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getIdentify() {
		return identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify == null ? null : identify.trim();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator == null ? null : creator.trim();
	}

	public String getBehalfpay() {
		return behalfpay;
	}

	public void setBehalfpay(String behalfpay) {
		this.behalfpay = behalfpay == null ? null : behalfpay.trim();
	}

	public BigDecimal getSettlementcarprice() {
		return settlementcarprice;
	}

	public void setSettlementcarprice(BigDecimal settlementcarprice) {
		this.settlementcarprice = settlementcarprice;
	}

	public BigDecimal getPurchasetax() {
		return purchasetax;
	}

	public void setPurchasetax(BigDecimal purchasetax) {
		this.purchasetax = purchasetax;
	}

	public BigDecimal getInsurance() {
		return insurance;
	}

	public void setInsurance(BigDecimal insurance) {
		this.insurance = insurance;
	}

	public BigDecimal getDynamicsupervise() {
		return dynamicsupervise;
	}

	public void setDynamicsupervise(BigDecimal dynamicsupervise) {
		this.dynamicsupervise = dynamicsupervise;
	}

	public BigDecimal getAppointinsurance() {
		return appointinsurance;
	}

	public void setAppointinsurance(BigDecimal appointinsurance) {
		this.appointinsurance = appointinsurance;
	}

	public BigDecimal getPlateprice() {
		return plateprice;
	}

	public void setPlateprice(BigDecimal plateprice) {
		this.plateprice = plateprice;
	}

	public BigDecimal getOther1price() {
		return other1price;
	}

	public void setOther1price(BigDecimal other1price) {
		this.other1price = other1price;
	}

	public String getOther1description() {
		return other1description;
	}

	public void setOther1description(String other1description) {
		this.other1description = other1description == null ? null : other1description.trim();
	}

	public BigDecimal getOther2price() {
		return other2price;
	}

	public void setOther2price(BigDecimal other2price) {
		this.other2price = other2price;
	}

	public String getOther2description() {
		return other2description;
	}

	public void setOther2description(String other2description) {
		this.other2description = other2description == null ? null : other2description.trim();
	}

	public String getBackreason() {
		return backreason;
	}

	public void setBackreason(String backreason) {
		this.backreason = backreason == null ? null : backreason.trim();
	}

	public String getNopassreason() {
		return nopassreason;
	}

	public void setNopassreason(String nopassreason) {
		this.nopassreason = nopassreason == null ? null : nopassreason.trim();
	}

	public BigDecimal getFsettlementcarprice() {
		return fsettlementcarprice;
	}

	public void setFsettlementcarprice(BigDecimal fsettlementcarprice) {
		this.fsettlementcarprice = fsettlementcarprice;
	}

	public BigDecimal getFpurchasetax() {
		return fpurchasetax;
	}

	public void setFpurchasetax(BigDecimal fpurchasetax) {
		this.fpurchasetax = fpurchasetax;
	}

	public BigDecimal getFinsurance() {
		return finsurance;
	}

	public void setFinsurance(BigDecimal finsurance) {
		this.finsurance = finsurance;
	}

	public BigDecimal getFdynamicsupervise() {
		return fdynamicsupervise;
	}

	public void setFdynamicsupervise(BigDecimal fdynamicsupervise) {
		this.fdynamicsupervise = fdynamicsupervise;
	}

	public BigDecimal getFappointinsurance() {
		return fappointinsurance;
	}

	public void setFappointinsurance(BigDecimal fappointinsurance) {
		this.fappointinsurance = fappointinsurance;
	}

	public BigDecimal getFplateprice() {
		return fplateprice;
	}

	public void setFplateprice(BigDecimal fplateprice) {
		this.fplateprice = fplateprice;
	}

	public BigDecimal getFother1price() {
		return fother1price;
	}

	public void setFother1price(BigDecimal fother1price) {
		this.fother1price = fother1price;
	}

	public String getFother1description() {
		return fother1description;
	}

	public void setFother1description(String fother1description) {
		this.fother1description = fother1description == null ? null : fother1description.trim();
	}

	public BigDecimal getFother2price() {
		return fother2price;
	}

	public void setFother2price(BigDecimal fother2price) {
		this.fother2price = fother2price;
	}

	public String getFother2description() {
		return fother2description;
	}

	public void setFother2description(String fother2description) {
		this.fother2description = fother2description == null ? null : fother2description.trim();
	}

	public String getFbackreason() {
		return fbackreason;
	}

	public void setFbackreason(String fbackreason) {
		this.fbackreason = fbackreason == null ? null : fbackreason.trim();
	}

	public String getFnopassreason() {
		return fnopassreason;
	}

	public void setFnopassreason(String fnopassreason) {
		this.fnopassreason = fnopassreason == null ? null : fnopassreason.trim();
	}

	public String getWsid() {
		return wsid;
	}

	public void setWsid(String wsid) {
		this.wsid = wsid;
	}

	public Integer getCarid() {
		return carid;
	}

	public void setCarid(Integer carid) {
		this.carid = carid;
	}

}