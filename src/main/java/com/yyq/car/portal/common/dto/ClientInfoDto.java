/*******************************************************************************
 * Project   : car-common
 * Class Name: com.yyq.car.portal.common.dto.ClientInfoDto
 * Created By: wangzh 
 * Created on: 2017年5月19日 下午7:00:33
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.dto;

/**
 * <P>新旧混合信息表保存dto</P>
 * @author wangzh
 */
public class ClientInfoDto {

	private String id;

	private String filenum;// 档案编号

	private String shopId;// 门店主键

	private String shopName;// 门店名称

	private String name;// 客户姓名

	private String identify;// 身份证号

	private String phone;// 联系电话

	private String workType;// 客户类别 个人 单位

	// private String clienttype;// 客户类别 个人 单位

	private String companyName;// 单位名称

	private String companyname;// 单位名称

	private String companyAddress;

	private String homeAddress;

	private String postcode;

	private String auditStatus;

	private String createTime;// 创建时间

	private String comeshopTime;// 进店日期

	private String comeshoptime;// 进店日期

	private String initials;// 品牌首字母

	private String wantcar;// 意向车型

	private String model;// 意向车型

	private String version;// 版别

	private String carPrice;// 车辆价格

	private String usefor;// 车辆用途 个人 单位

	private String nowCar;// 现有交通工具

	private String nowcar;// 现有交通工具

	private String color;// 配置/颜色

	private String carId;// 车辆主键

	private String wantBrand;// 意向品牌

	private String brand;// 意向品牌

	private String heartPrice;// 心里价格，存储的是1,2..,对应的是20-40,40-60等

	private String heartprice;

	private String oldIntroduce;// 是否熟客介绍

	private String oldintroduce;// 是否熟客介绍

	private String haveCard; // 是否有牌照

	private String haslicense; // 是否有牌照

	private String clientLevel;// 客户级别

	private String clevel;// 客户级别

	private String bizLicense;// 企业营业执照号码

	private String bizlicense;// 企业营业执照号码

	private String sellerId;// 销售人ID

	// private String sellid;// 销售人ID

	private String salePrice;

	private String principal;// 负责人

	private String principle;// 负责人

	// public String getClienttype() {
	// return clienttype;
	// }
	//
	// public void setClienttype(String clienttype) {
	// this.clienttype = clienttype;
	// }

	public String getPrincipal() {
		return principal;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getComeshoptime() {
		return comeshoptime;
	}

	public void setComeshoptime(String comeshoptime) {
		this.comeshoptime = comeshoptime;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getNowcar() {
		return nowcar;
	}

	public void setNowcar(String nowcar) {
		this.nowcar = nowcar;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getHeartprice() {
		return heartprice;
	}

	public void setHeartprice(String heartprice) {
		this.heartprice = heartprice;
	}

	public String getOldintroduce() {
		return oldintroduce;
	}

	public void setOldintroduce(String oldintroduce) {
		this.oldintroduce = oldintroduce;
	}

	public String getHaslicense() {
		return haslicense;
	}

	public void setHaslicense(String haslicense) {
		this.haslicense = haslicense;
	}

	public String getClevel() {
		return clevel;
	}

	public void setClevel(String clevel) {
		this.clevel = clevel;
	}

	public String getBizlicense() {
		return bizlicense;
	}

	public void setBizlicense(String bizlicense) {
		this.bizlicense = bizlicense;
	}

	public String getPrinciple() {
		return principle;
	}

	public void setPrinciple(String principle) {
		this.principle = principle;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	/**
	 * @return the wantBrand
	 */
	public String getWantBrand() {
		return wantBrand;
	}

	/**
	 * @param wantBrand the wantBrand to set
	 */
	public void setWantBrand(String wantBrand) {
		this.wantBrand = wantBrand;
	}

	/**
	 * @return the heartPrice
	 */
	public String getHeartPrice() {
		return heartPrice;
	}

	/**
	 * @param heartPrice the heartPrice to set
	 */
	public void setHeartPrice(String heartPrice) {
		this.heartPrice = heartPrice;
	}

	/**
	 * @return the oldIntroduce
	 */
	public String getOldIntroduce() {
		return oldIntroduce;
	}

	/**
	 * @param oldIntroduce the oldIntroduce to set
	 */
	public void setOldIntroduce(String oldIntroduce) {
		this.oldIntroduce = oldIntroduce;
	}

	/**
	 * @return the haveCard
	 */
	public String getHaveCard() {
		return haveCard;
	}

	/**
	 * @param haveCard the haveCard to set
	 */
	public void setHaveCard(String haveCard) {
		this.haveCard = haveCard;
	}

	/**
	 * @return the clientLevel
	 */
	public String getClientLevel() {
		return clientLevel;
	}

	/**
	 * @param clientLevel the clientLevel to set
	 */
	public void setClientLevel(String clientLevel) {
		this.clientLevel = clientLevel;
	}

	/**
	 * @return the bizLicense
	 */
	public String getBizLicense() {
		return bizLicense;
	}

	/**
	 * @param bizLicense the bizLicense to set
	 */
	public void setBizLicense(String bizLicense) {
		this.bizLicense = bizLicense;
	}

	/**
	 * @return the sellerId
	 */
	public String getSellerId() {
		return sellerId;
	}

	/**
	 * @param sellerId the sellerId to set
	 */
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFilenum() {
		return filenum;
	}

	public void setFilenum(String filenum) {
		this.filenum = filenum;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentify() {
		return identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getComeshopTime() {
		return comeshopTime;
	}

	public void setComeshopTime(String comeshopTime) {
		this.comeshopTime = comeshopTime;
	}

	public String getWantcar() {
		return wantcar;
	}

	public void setWantcar(String wantcar) {
		this.wantcar = wantcar;
	}

	public String getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(String carPrice) {
		this.carPrice = carPrice;
	}

	public String getUsefor() {
		return usefor;
	}

	public void setUsefor(String usefor) {
		this.usefor = usefor;
	}

	public String getNowCar() {
		return nowCar;
	}

	public void setNowCar(String nowCar) {
		this.nowCar = nowCar;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
