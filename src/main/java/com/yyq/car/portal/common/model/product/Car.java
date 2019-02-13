package com.yyq.car.portal.common.model.product;

import java.math.BigDecimal;
import java.util.Date;


public class Car {
	private Integer id;

	private String brand;

	private String version;
	private String model;

	private String engineNum;

	private String lenWidHei;

	private String displacement;

	private String oilWear;

	private String discharge;

	private String weight;

	private String level;

	private String gearbox;

	private String energyType;

	private String outlookColor;

	private String innerColor;

	private String vin;

	private BigDecimal buyPrice;// 采购价

	private BigDecimal salePrice;// 销售价

	private BigDecimal lowPrice;// 最低销售价

	private BigDecimal sellerprice;//

	private String address;// 仓库地址-关联仓库主键

	private String shopRelated;// 关联门店主键

	private Integer status;// 状态 1库存中 2运输中 3门店锁定 4销售锁定 5已销售 需求修改:时空状态 1库存中 2移库中 3已移库门店

	private Integer isStored;// 入库状态/审核入库通过与否 1通过、入库 2 不通过 未入库 3 审核中

	private Integer buyerId;// 购买人/客户 id

	private String buyName;// 采购商名称

	private Integer contractId;

	private String iden1;

	private String iden2;

	private String iden3;
	private String iden5;

	private String iden4;

	private String pic1;

	private String pic2;

	private String pic3;

	private String pic4;

	private Date createTime;

	private Date leaveFactoryTime;

	private String reason;// 入库驳回理由

	private Integer moveStatus;

	private Integer shopId;

	private Integer storeId;

	private Integer storeType;

	private String carAddress;

	private Integer outStatus;// 购车出库状态 需求修改为新需求：
	// 1、出库合同已提交 2、总部审核合同已通过 3、总部财务审核首付已通过 4、客户验车通过 5、已通知客户支付尾款 6、财务审核尾款已通过 7客户已提车

	private Integer realSale;// 出售状态

	private String decorate;// 加装

	private Integer saleStatus;// 销售状态：1、购车锁定（选完车后） 2、购车物流中（定金审核通过）3、已销未提（尾款审核通过）4、已销已提（出库材料备好）

	private Date saletime;// 车辆售出时间 尾款付清表示售出

	private Date purchaseTime;// 采购时间
	private BigDecimal oPrice;// 对外采购价

	private String buyerName;// 采购人员名称

	private Integer jndcar;// 加拿大过来的车

	private BigDecimal gpsprice;
	private Date signingdate;
	private Date duedate;
	private Integer supplycarstatus;
	private String config;

	private BigDecimal typeinsettleprice;// 车辆录入的结算价
	private BigDecimal settlementprice;// 每日报价的结算价
	private BigDecimal contractprice;

	private Integer financialtype;

	private Integer zeropurid;// 零采外键
	private Integer creatorid;// 创建者id
	
	private BigDecimal purchasesettlementprice;//采购结算价
	
	private String mallCarSkuCode;
	private Integer mallCarStatus;

	public Integer getZeropurid() {
		return zeropurid;
	}

	public void setZeropurid(Integer zeropurid) {
		this.zeropurid = zeropurid;
	}

	public Integer getCreatorid() {
		return creatorid;
	}

	public void setCreatorid(Integer creatorid) {
		this.creatorid = creatorid;
	}

	public BigDecimal getTypeinsettleprice() {
		return typeinsettleprice;
	}

	public void setTypeinsettleprice(BigDecimal typeinsettleprice) {
		this.typeinsettleprice = typeinsettleprice;
	}

	private Date contractpricetime;

	public Date getPurchaseTime() {
		return purchaseTime;
	}

	public void setPurchaseTime(Date purchaseTime) {
		this.purchaseTime = purchaseTime;
	}

	public Date getSaletime() {
		return saletime;
	}

	public void setSaletime(Date saletime) {
		this.saletime = saletime;
	}

	public Integer getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(Integer saleStatus) {
		this.saleStatus = saleStatus;
	}

	public String getDecorate() {
		return decorate;
	}

	public void setDecorate(String decorate) {
		this.decorate = decorate;
	}

	public Integer getRealSale() {
		return realSale;
	}

	public void setRealSale(Integer realSale) {
		this.realSale = realSale;
	}

	public Integer getOutStatus() {
		return outStatus;
	}

	public void setOutStatus(Integer outStatus) {
		this.outStatus = outStatus;
	}

	public BigDecimal getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(BigDecimal lowPrice) {
		this.lowPrice = lowPrice;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getBuyName() {
		return buyName;
	}

	public void setBuyName(String buyName) {
		this.buyName = buyName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getEngineNum() {
		return engineNum;
	}

	public void setEngineNum(String engineNum) {
		this.engineNum = engineNum == null ? null : engineNum.trim();
	}

	public String getLenWidHei() {
		return lenWidHei;
	}

	public void setLenWidHei(String lenWidHei) {
		this.lenWidHei = lenWidHei == null ? null : lenWidHei.trim();
	}

	public String getDisplacement() {
		return displacement;
	}

	public void setDisplacement(String displacement) {
		this.displacement = displacement == null ? null : displacement.trim();
	}

	public String getOilWear() {
		return oilWear;
	}

	public void setOilWear(String oilWear) {
		this.oilWear = oilWear == null ? null : oilWear.trim();
	}

	public String getDischarge() {
		return discharge;
	}

	public void setDischarge(String discharge) {
		this.discharge = discharge == null ? null : discharge.trim();
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight == null ? null : weight.trim();
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level == null ? null : level.trim();
	}

	public String getGearbox() {
		return gearbox;
	}

	public void setGearbox(String gearbox) {
		this.gearbox = gearbox == null ? null : gearbox.trim();
	}

	public String getEnergyType() {
		return energyType;
	}

	public void setEnergyType(String energyType) {
		this.energyType = energyType == null ? null : energyType.trim();
	}

	public String getOutlookColor() {
		return outlookColor;
	}

	public void setOutlookColor(String outlookColor) {
		this.outlookColor = outlookColor == null ? null : outlookColor.trim();
	}

	public String getInnerColor() {
		return innerColor;
	}

	public void setInnerColor(String innerColor) {
		this.innerColor = innerColor == null ? null : innerColor.trim();
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin == null ? null : vin.trim();
	}

	public BigDecimal getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getShopRelated() {
		return shopRelated;
	}

	public void setShopRelated(String shopRelated) {
		this.shopRelated = shopRelated == null ? null : shopRelated.trim();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsStored() {
		return isStored;
	}

	public void setIsStored(Integer isStored) {
		this.isStored = isStored;
	}

	public Integer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

	public Integer getContractId() {
		return contractId;
	}

	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}

	public String getIden1() {
		return iden1;
	}

	public void setIden1(String iden1) {
		this.iden1 = iden1;
	}

	public String getIden2() {
		return iden2;
	}

	public void setIden2(String iden2) {
		this.iden2 = iden2;
	}

	public String getIden3() {
		return iden3;
	}

	public void setIden3(String iden3) {
		this.iden3 = iden3;
	}

	public String getIden4() {
		return iden4;
	}

	public void setIden4(String iden4) {
		this.iden4 = iden4;
	}

	public String getPic1() {
		return pic1;
	}

	public void setPic1(String pic1) {
		this.pic1 = pic1 == null ? null : pic1.trim();
	}

	public String getPic2() {
		return pic2;
	}

	public void setPic2(String pic2) {
		this.pic2 = pic2 == null ? null : pic2.trim();
	}

	public String getPic3() {
		return pic3;
	}

	public void setPic3(String pic3) {
		this.pic3 = pic3 == null ? null : pic3.trim();
	}

	public String getPic4() {
		return pic4;
	}

	public void setPic4(String pic4) {
		this.pic4 = pic4 == null ? null : pic4.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLeaveFactoryTime() {
		return leaveFactoryTime;
	}

	public void setLeaveFactoryTime(Date leaveFactoryTime) {
		this.leaveFactoryTime = leaveFactoryTime;
	}

	public Integer getMoveStatus() {
		return moveStatus;
	}

	public void setMoveStatus(Integer moveStatus) {
		this.moveStatus = moveStatus;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Integer getStoreType() {
		return storeType;
	}

	public void setStoreType(Integer storeType) {
		this.storeType = storeType;
	}

	public String getCarAddress() {
		return carAddress;
	}

	public void setCarAddress(String carAddress) {
		this.carAddress = carAddress;
	}

	public BigDecimal getoPrice() {
		return oPrice;
	}

	public void setoPrice(BigDecimal oPrice) {
		this.oPrice = oPrice;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public BigDecimal getSellerprice() {
		return sellerprice;
	}

	public void setSellerprice(BigDecimal sellerprice) {
		this.sellerprice = sellerprice;
	}

	public String getIden5() {
		return iden5;
	}

	public void setIden5(String iden5) {
		this.iden5 = iden5;
	}

	public Integer getJndcar() {
		return jndcar;
	}

	public void setJndcar(Integer jndcar) {
		this.jndcar = jndcar;
	}

	public Date getSigningdate() {
		return signingdate;
	}

	public void setSigningdate(Date signingdate) {
		this.signingdate = signingdate;
	}

	public BigDecimal getGpsprice() {
		return gpsprice;
	}

	public void setGpsprice(BigDecimal gpsprice) {
		this.gpsprice = gpsprice;
	}

	public Date getDuedate() {
		return duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	public Integer getSupplycarstatus() {
		return supplycarstatus;
	}

	public void setSupplycarstatus(Integer supplycarstatus) {
		this.supplycarstatus = supplycarstatus;
	}

	public BigDecimal getSettlementprice() {
		return settlementprice;
	}

	public void setSettlementprice(BigDecimal settlementprice) {
		this.settlementprice = settlementprice;
	}

	public BigDecimal getContractprice() {
		return contractprice;
	}

	public void setContractprice(BigDecimal contractprice) {
		this.contractprice = contractprice;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public Integer getFinancialtype() {
		return financialtype;
	}

	public void setFinancialtype(Integer financialtype) {
		this.financialtype = financialtype;
	}

	public Date getContractpricetime() {
		return contractpricetime;
	}

	public void setContractpricetime(Date contractpricetime) {
		this.contractpricetime = contractpricetime;
	}

	public BigDecimal getPurchasesettlementprice() {
		return purchasesettlementprice;
	}

	public void setPurchasesettlementprice(BigDecimal purchasesettlementprice) {
		this.purchasesettlementprice = purchasesettlementprice;
	}

	public String getMallCarSkuCode() {
		return mallCarSkuCode;
	}

	public void setMallCarSkuCode(String mallCarSkuCode) {
		this.mallCarSkuCode = mallCarSkuCode;
	}

	public Integer getMallCarStatus() {
		return mallCarStatus;
	}

	public void setMallCarStatus(Integer mallCarStatus) {
		this.mallCarStatus = mallCarStatus;
	}

}