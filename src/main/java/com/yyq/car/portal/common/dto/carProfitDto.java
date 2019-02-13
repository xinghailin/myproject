package com.yyq.car.portal.common.dto;

import java.math.BigDecimal;


public class carProfitDto {
	private BigDecimal buyPrice;// 采购价

	private String buyName;// 采购商名称

	private String engineNum;// 发动机号

	private String vin;// 车架号

	private String brand;// 车辆品牌

	private String model;// 车辆型号
	private String version;//版别

	private String iden1;// 证件1

	private String iden2;// 证件1

	private String iden3;// 证件1

	private String setTlement;//结算

	private BigDecimal profit;//总利润

	private String shopId;//门店id

	private BigDecimal salePrice;//销售价格

	private String leaveFactoryTime;// 出厂时间

	private String outlookColor;

	private String innerColor;

	private String carId;
	private Integer pageStart;
	private Integer pageSize;

	private String infoNum;

	public Integer getPageStart() {
		return pageStart;
	}

	public void setPageStart(Integer pageStart) {
		this.pageStart = pageStart;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getOutlookColor() {
		return outlookColor;
	}

	public void setOutlookColor(String outlookColor) {
		this.outlookColor = outlookColor;
	}

	public String getInnerColor() {
		return innerColor;
	}

	public void setInnerColor(String innerColor) {
		this.innerColor = innerColor;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getBuyName() {
		return buyName;
	}

	public void setBuyName(String buyName) {
		this.buyName = buyName;
	}

	public String getEngineNum() {
		return engineNum;
	}

	public void setEngineNum(String engineNum) {
		this.engineNum = engineNum;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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

	public String getSetTlement() {
		return setTlement;
	}

	public void setSetTlement(String setTlement) {
		this.setTlement = setTlement;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public BigDecimal getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}

	public BigDecimal getProfit() {
		return profit;
	}

	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public String getLeaveFactoryTime() {
		return leaveFactoryTime;
	}

	public void setLeaveFactoryTime(String leaveFactoryTime) {
		this.leaveFactoryTime = leaveFactoryTime;
	}

	public String getInfoNum() {
		return infoNum;
	}

	public void setInfoNum(String infoNum) {
		this.infoNum = infoNum;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
