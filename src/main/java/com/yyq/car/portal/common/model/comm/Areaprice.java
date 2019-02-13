package com.yyq.car.portal.common.model.comm;

import java.math.BigDecimal;
import java.util.Date;

public class Areaprice {
    private Integer id;

    private String province;

    private String city;

    private String brand;

    private String model;

    private String version;

    private BigDecimal price;

    private BigDecimal channelprice;

    private BigDecimal cnsystem;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getChannelprice() {
        return channelprice;
    }

    public void setChannelprice(BigDecimal channelprice) {
        this.channelprice = channelprice;
    }

    public BigDecimal getCnsystem() {
        return cnsystem;
    }

    public void setCnsystem(BigDecimal cnsystem) {
        this.cnsystem = cnsystem;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", brand=").append(brand);
        sb.append(", model=").append(model);
        sb.append(", version=").append(version);
        sb.append(", price=").append(price);
        sb.append(", channelprice=").append(channelprice);
        sb.append(", cnsystem=").append(cnsystem);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}