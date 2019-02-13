package com.yyq.car.portal.common.model.mall;

import java.math.BigDecimal;
import java.util.Date;

public class Mallshoppingcart {
    private String id;

    private String username;

    private Integer areaid;

    private String unit;

    private String areaname;

    private Integer sourceid;

    private BigDecimal carprice;

    private BigDecimal issuingprice;

    private Integer num;

    private BigDecimal decorateprice;

    private BigDecimal downpay;

    private BigDecimal oversea4sprice;

    private BigDecimal favor;

    private BigDecimal cmsn;

    private BigDecimal overseadrayage;

    private BigDecimal overseashotinsurance;

    private BigDecimal seatransportprice;

    private BigDecimal seatransportinsurance;

    private BigDecimal totalprice;

    private Date createtime;

    private Integer status;

    private String version;

    private String brand;

    private String model;

    private BigDecimal interests;

    private BigDecimal serviceprice;

    private BigDecimal terminalhandlingcharges;

    private BigDecimal customsclearancefee;

    private BigDecimal duties;

    private Integer displacement;

    private Integer type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
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

    public BigDecimal getIssuingprice() {
        return issuingprice;
    }

    public void setIssuingprice(BigDecimal issuingprice) {
        this.issuingprice = issuingprice;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
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

    public BigDecimal getInterests() {
        return interests;
    }

    public void setInterests(BigDecimal interests) {
        this.interests = interests;
    }

    public BigDecimal getServiceprice() {
        return serviceprice;
    }

    public void setServiceprice(BigDecimal serviceprice) {
        this.serviceprice = serviceprice;
    }

    public BigDecimal getTerminalhandlingcharges() {
        return terminalhandlingcharges;
    }

    public void setTerminalhandlingcharges(BigDecimal terminalhandlingcharges) {
        this.terminalhandlingcharges = terminalhandlingcharges;
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

    public Integer getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Integer displacement) {
        this.displacement = displacement;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", areaid=").append(areaid);
        sb.append(", unit=").append(unit);
        sb.append(", areaname=").append(areaname);
        sb.append(", sourceid=").append(sourceid);
        sb.append(", carprice=").append(carprice);
        sb.append(", issuingprice=").append(issuingprice);
        sb.append(", num=").append(num);
        sb.append(", decorateprice=").append(decorateprice);
        sb.append(", downpay=").append(downpay);
        sb.append(", oversea4sprice=").append(oversea4sprice);
        sb.append(", favor=").append(favor);
        sb.append(", cmsn=").append(cmsn);
        sb.append(", overseadrayage=").append(overseadrayage);
        sb.append(", overseashotinsurance=").append(overseashotinsurance);
        sb.append(", seatransportprice=").append(seatransportprice);
        sb.append(", seatransportinsurance=").append(seatransportinsurance);
        sb.append(", totalprice=").append(totalprice);
        sb.append(", createtime=").append(createtime);
        sb.append(", status=").append(status);
        sb.append(", version=").append(version);
        sb.append(", brand=").append(brand);
        sb.append(", model=").append(model);
        sb.append(", interests=").append(interests);
        sb.append(", serviceprice=").append(serviceprice);
        sb.append(", terminalhandlingcharges=").append(terminalhandlingcharges);
        sb.append(", customsclearancefee=").append(customsclearancefee);
        sb.append(", duties=").append(duties);
        sb.append(", displacement=").append(displacement);
        sb.append(", type=").append(type);
        sb.append("]");
        return sb.toString();
    }
}