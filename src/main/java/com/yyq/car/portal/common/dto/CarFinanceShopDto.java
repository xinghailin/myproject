package com.yyq.car.portal.common.dto;



public class CarFinanceShopDto {
    private Integer id;

    private String name;

    private String financeType;

    private String termName;

    private String type;
    
    private String payDate;
    
    private String sumMoney;// 总的利息
    private String sumcredit;// 总的授信额度
    private String sumSettlementprice;// 车总的结算价
    private String remainsumMoney;// 剩余总价
    private String credit;// 授信额度
    
    private String shopId;
    
    
    
    //查询条件
    private String shopName;
    private String brand;
    private String model;
    private String version;
    private String shopTermName;
    private String vin;
    private Integer start;
    private Integer pageSize;
    
    
    private String payStartDate; //结算开始日期
    private String payEndDate;//结算结束日期
    private Integer showPayMoney;// 是否现实结算  1 显示 2 不显示

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFinanceType() {
		return financeType;
	}

	public void setFinanceType(String financeType) {
		this.financeType = financeType;
	}

	public String getTermName() {
		return termName;
	}

	public void setTermName(String termName) {
		this.termName = termName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPayDate() {
		return payDate;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public String getSumMoney() {
		return sumMoney;
	}

	public void setSumMoney(String sumMoney) {
		this.sumMoney = sumMoney;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getShopTermName() {
		return shopTermName;
	}

	public void setShopTermName(String shopTermName) {
		this.shopTermName = shopTermName;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getPayStartDate() {
		return payStartDate;
	}

	public void setPayStartDate(String payStartDate) {
		this.payStartDate = payStartDate;
	}

	public String getPayEndDate() {
		return payEndDate;
	}

	public void setPayEndDate(String payEndDate) {
		this.payEndDate = payEndDate;
	}

	public Integer getShowPayMoney() {
		return showPayMoney;
	}

	public void setShowPayMoney(Integer showPayMoney) {
		this.showPayMoney = showPayMoney;
	}

	public String getSumcredit() {
		return sumcredit;
	}

	public void setSumcredit(String sumcredit) {
		this.sumcredit = sumcredit;
	}

	public String getSumSettlementprice() {
		return sumSettlementprice;
	}

	public void setSumSettlementprice(String sumSettlementprice) {
		this.sumSettlementprice = sumSettlementprice;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getRemainsumMoney() {
		return remainsumMoney;
	}

	public void setRemainsumMoney(String remainsumMoney) {
		this.remainsumMoney = remainsumMoney;
	}
    
}