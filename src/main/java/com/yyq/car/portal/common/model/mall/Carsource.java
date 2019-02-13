package com.yyq.car.portal.common.model.mall;

import java.math.BigDecimal;
import java.util.Date;


public class Carsource {
	private Integer id;

	private Integer areaid;

	private String areaname;

	private String unit;

	private Integer brandid;

	private String brand;

	private String model;

	private String version;

	private Integer displacement;

	private BigDecimal carprice;

	private BigDecimal decorateprice;

	private BigDecimal downpay;

	private BigDecimal oversea4sprice;

	private BigDecimal favor;

	private BigDecimal cmsn;

	private BigDecimal overseadrayage;

	private BigDecimal overseashotinsurance;

	private BigDecimal seatransportprice;

	private BigDecimal seatransportinsurance;

	private Integer storagenum;

	private Integer issuingid;

	private String issuingcompany;

	private BigDecimal issuingprice;

	private BigDecimal customsclearancefee;

	private BigDecimal duties;

	private Integer status;

	private String creator;

	private Date createtime;

	private String updator;

	private Date updatetime;

	private Integer type;

	private BigDecimal downpayscale;

	private String downpayscale2;

	private String outcolor;

	private String incolor;

	private String config;

	private BigDecimal serviceprice;

	private BigDecimal interests;

	private String updator1;

	private Date updatetime1;

	private String coverpic;// 封面图片地址

	private BigDecimal totaldecorateprice;// 总加装费

	private String configv;// 加装值

	private BigDecimal tax;// 税率

	private BigDecimal terminalhandlingcharges;// 港杂费

	private Integer auditstatus;// 审核状态

	public Integer getAuditstatus() {
		return auditstatus;
	}

	public void setAuditstatus(Integer auditstatus) {
		this.auditstatus = auditstatus;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public String getConfigv() {
		return configv;
	}

	public void setConfigv(String configv) {
		this.configv = configv;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAreaid() {
		return areaid;
	}

	public void setAreaid(Integer areaid) {
		this.areaid = areaid;
	}

	public String getAreaname() {
		return areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname == null ? null : areaname.trim();
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit == null ? null : unit.trim();
	}

	public Integer getBrandid() {
		return brandid;
	}

	public void setBrandid(Integer brandid) {
		this.brandid = brandid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand == null ? null : brand.trim();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model == null ? null : model.trim();
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version == null ? null : version.trim();
	}

	public Integer getDisplacement() {
		return displacement;
	}

	public void setDisplacement(Integer displacement) {
		this.displacement = displacement;
	}

	public BigDecimal getCarprice() {
		return carprice;
	}

	public void setCarprice(BigDecimal carprice) {
		this.carprice = carprice;
	}

	public BigDecimal getDecorateprice() {
		return decorateprice;
	}

	public void setDecorateprice(BigDecimal decorateprice) {
		this.decorateprice = decorateprice;
	}

	public BigDecimal getDownpay() {
		return downpay;
	}

	public void setDownpay(BigDecimal downpay) {
		this.downpay = downpay;
	}

	public BigDecimal getOversea4sprice() {
		return oversea4sprice;
	}

	public void setOversea4sprice(BigDecimal oversea4sprice) {
		this.oversea4sprice = oversea4sprice;
	}

	public BigDecimal getFavor() {
		return favor;
	}

	public void setFavor(BigDecimal favor) {
		this.favor = favor;
	}

	public BigDecimal getCmsn() {
		return cmsn;
	}

	public void setCmsn(BigDecimal cmsn) {
		this.cmsn = cmsn;
	}

	public BigDecimal getOverseadrayage() {
		return overseadrayage;
	}

	public void setOverseadrayage(BigDecimal overseadrayage) {
		this.overseadrayage = overseadrayage;
	}

	public BigDecimal getOverseashotinsurance() {
		return overseashotinsurance;
	}

	public void setOverseashotinsurance(BigDecimal overseashotinsurance) {
		this.overseashotinsurance = overseashotinsurance;
	}

	public BigDecimal getSeatransportprice() {
		return seatransportprice;
	}

	public void setSeatransportprice(BigDecimal seatransportprice) {
		this.seatransportprice = seatransportprice;
	}

	public BigDecimal getSeatransportinsurance() {
		return seatransportinsurance;
	}

	public void setSeatransportinsurance(BigDecimal seatransportinsurance) {
		this.seatransportinsurance = seatransportinsurance;
	}

	public Integer getStoragenum() {
		return storagenum;
	}

	public void setStoragenum(Integer storagenum) {
		this.storagenum = storagenum;
	}

	public Integer getIssuingid() {
		return issuingid;
	}

	public void setIssuingid(Integer issuingid) {
		this.issuingid = issuingid;
	}

	public String getIssuingcompany() {
		return issuingcompany;
	}

	public void setIssuingcompany(String issuingcompany) {
		this.issuingcompany = issuingcompany == null ? null : issuingcompany.trim();
	}

	public BigDecimal getIssuingprice() {
		return issuingprice;
	}

	public void setIssuingprice(BigDecimal issuingprice) {
		this.issuingprice = issuingprice;
	}

	public BigDecimal getCustomsclearancefee() {
		return customsclearancefee;
	}

	public void setCustomsclearancefee(BigDecimal customsclearancefee) {
		this.customsclearancefee = customsclearancefee;
	}

	public BigDecimal getDuties() {
		return duties;
	}

	public void setDuties(BigDecimal duties) {
		this.duties = duties;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator == null ? null : creator.trim();
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getUpdator() {
		return updator;
	}

	public void setUpdator(String updator) {
		this.updator = updator == null ? null : updator.trim();
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public BigDecimal getDownpayscale() {
		return downpayscale;
	}

	public void setDownpayscale(BigDecimal downpayscale) {
		this.downpayscale = downpayscale;
	}

	public String getDownpayscale2() {
		return downpayscale2;
	}

	public void setDownpayscale2(String downpayscale2) {
		this.downpayscale2 = downpayscale2 == null ? null : downpayscale2.trim();
	}

	public String getOutcolor() {
		return outcolor;
	}

	public void setOutcolor(String outcolor) {
		this.outcolor = outcolor == null ? null : outcolor.trim();
	}

	public String getIncolor() {
		return incolor;
	}

	public void setIncolor(String incolor) {
		this.incolor = incolor == null ? null : incolor.trim();
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config == null ? null : config.trim();
	}

	public BigDecimal getServiceprice() {
		return serviceprice;
	}

	public void setServiceprice(BigDecimal serviceprice) {
		this.serviceprice = serviceprice;
	}

	public BigDecimal getInterests() {
		return interests;
	}

	public void setInterests(BigDecimal interests) {
		this.interests = interests;
	}

	public String getUpdator1() {
		return updator1;
	}

	public void setUpdator1(String updator1) {
		this.updator1 = updator1 == null ? null : updator1.trim();
	}

	public Date getUpdatetime1() {
		return updatetime1;
	}

	public void setUpdatetime1(Date updatetime1) {
		this.updatetime1 = updatetime1;
	}

	public String getCoverpic() {
		return coverpic;
	}

	public void setCoverpic(String coverpic) {
		this.coverpic = coverpic;
	}

	public BigDecimal getTotaldecorateprice() {
		return totaldecorateprice;
	}

	public void setTotaldecorateprice(BigDecimal totaldecorateprice) {
		this.totaldecorateprice = totaldecorateprice;
	}

	public BigDecimal getTerminalhandlingcharges() {
		return terminalhandlingcharges;
	}

	public void setTerminalhandlingcharges(BigDecimal terminalhandlingcharges) {
		this.terminalhandlingcharges = terminalhandlingcharges;
	}

}