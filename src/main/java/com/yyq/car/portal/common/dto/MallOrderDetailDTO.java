package com.yyq.car.portal.common.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author liliang
 * @since 2018-10-16
 */
public class MallOrderDetailDTO {


    private String id;

    /**
     * 订单详清编码
     */
    private String code;

    /**
     * 订单编码
     */
    private String orderid;

    /**
     * 用户id 即手机号
     */
    private String username;

    /**
     * 购物车记录id
     */
    private String cartid;

    /**
     * mall_area表区域id
     */
    private Integer areaid;

    /**
     * 区域名称
     */
    private String areaname;

    /**
     * 车源id
     */
    private Integer sourceid;

    /**
     * 车身价
     */
    private BigDecimal carprice;

    /**
     * 车辆数量
     */
    private Integer num;

    /**
     * 加装费
     */
    private BigDecimal decorateprice;

    /**
     * 定金
     */
    private BigDecimal downpay;

    /**
     * 商品总价
     */
    private BigDecimal totalprice;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 支付状态
     */
    private Integer paystatus;

    /**
     * 车辆状态
     */
    private Integer carstatus;

    /**
     * 状态
     */
    private Integer status;
    
    /**
     * 订单节点状态
     */
    private Integer orderstatus;

    /**
     * 冗余字段品牌
     */
    private String brand;

    /**
     * 型号
     */
    private String model;

    /**
     * 版别
     */
    private String version;
    
    private String remarks;
    
  /*  *//**
      * 下单人手机号    即 user表中的name字段
     *//*
    private String username;*/
    /**
     * 批次号    即 order表code  总订单的code
    */
    private String parentcode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCartid() {
		return cartid;
	}

	public void setCartid(String cartid) {
		this.cartid = cartid;
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
		this.areaname = areaname;
	}

	public Integer getSourceid() {
		return sourceid;
	}

	public void setSourceid(Integer sourceid) {
		this.sourceid = sourceid;
	}

	public BigDecimal getCarprice() {
		return carprice;
	}

	public void setCarprice(BigDecimal carprice) {
		this.carprice = carprice;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
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

	public BigDecimal getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(BigDecimal totalprice) {
		this.totalprice = totalprice;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Integer getPaystatus() {
		return paystatus;
	}

	public void setPaystatus(Integer paystatus) {
		this.paystatus = paystatus;
	}

	public Integer getCarstatus() {
		return carstatus;
	}

	public void setCarstatus(Integer carstatus) {
		this.carstatus = carstatus;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(Integer orderstatus) {
		this.orderstatus = orderstatus;
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

	public String getParentcode() {
		return parentcode;
	}

	public void setParentcode(String parentcode) {
		this.parentcode = parentcode;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
   
 
}
