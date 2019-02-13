package com.yyq.car.portal.common.model.biz;

import java.util.Date;

public class bizcarsource {
    private Integer id;

    private String code;

    private Integer shopid;

    private String shopname;

    private String creatorname;

    private String auditname;

    private String brand;

    private String model;

    private String version;

    private String outcolour;

    private String incolour;

    private String province;

    private String city;

    private Integer purchaseprice;

    private Integer status;

    private String cause;

    private Integer num;

    private Date starttime;

    private Date endtime;

    private Date creatime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getCreatorname() {
        return creatorname;
    }

    public void setCreatorname(String creatorname) {
        this.creatorname = creatorname == null ? null : creatorname.trim();
    }

    public String getAuditname() {
        return auditname;
    }

    public void setAuditname(String auditname) {
        this.auditname = auditname == null ? null : auditname.trim();
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

    public String getOutcolour() {
        return outcolour;
    }

    public void setOutcolour(String outcolour) {
        this.outcolour = outcolour == null ? null : outcolour.trim();
    }

    public String getIncolour() {
        return incolour;
    }

    public void setIncolour(String incolour) {
        this.incolour = incolour == null ? null : incolour.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(Integer purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getCreatime() {
        return creatime;
    }

    public void setCreatime(Date creatime) {
        this.creatime = creatime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", shopid=").append(shopid);
        sb.append(", shopname=").append(shopname);
        sb.append(", creatorname=").append(creatorname);
        sb.append(", auditname=").append(auditname);
        sb.append(", brand=").append(brand);
        sb.append(", model=").append(model);
        sb.append(", version=").append(version);
        sb.append(", outcolour=").append(outcolour);
        sb.append(", incolour=").append(incolour);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", purchaseprice=").append(purchaseprice);
        sb.append(", status=").append(status);
        sb.append(", cause=").append(cause);
        sb.append(", num=").append(num);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", creatime=").append(creatime);
        sb.append("]");
        return sb.toString();
    }
}