package com.yyq.car.portal.common.model.jnd;

import java.math.BigDecimal;
import java.util.Date;

public class jndfreight {
    private Integer id;

    private String name;

    private BigDecimal drayage;

    private BigDecimal oceanfreight;

    private BigDecimal elsecost1;

    private BigDecimal elsecost2;

    private String proposer;

    private Date proposertime;

    private String verifier;

    private Date verifiertime;

    private Integer num;

    private Integer type;

    private String reason;

    private Integer currency;

    private Integer country;

    private BigDecimal fourtorep;

    private BigDecimal brandprice;

    private BigDecimal surepreinsuranceprice;

    private BigDecimal surepreoilprice;

    private String needer;

    private String mallcontractcode;

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
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getDrayage() {
        return drayage;
    }

    public void setDrayage(BigDecimal drayage) {
        this.drayage = drayage;
    }

    public BigDecimal getOceanfreight() {
        return oceanfreight;
    }

    public void setOceanfreight(BigDecimal oceanfreight) {
        this.oceanfreight = oceanfreight;
    }

    public BigDecimal getElsecost1() {
        return elsecost1;
    }

    public void setElsecost1(BigDecimal elsecost1) {
        this.elsecost1 = elsecost1;
    }

    public BigDecimal getElsecost2() {
        return elsecost2;
    }

    public void setElsecost2(BigDecimal elsecost2) {
        this.elsecost2 = elsecost2;
    }

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer == null ? null : proposer.trim();
    }

    public Date getProposertime() {
        return proposertime;
    }

    public void setProposertime(Date proposertime) {
        this.proposertime = proposertime;
    }

    public String getVerifier() {
        return verifier;
    }

    public void setVerifier(String verifier) {
        this.verifier = verifier == null ? null : verifier.trim();
    }

    public Date getVerifiertime() {
        return verifiertime;
    }

    public void setVerifiertime(Date verifiertime) {
        this.verifiertime = verifiertime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public BigDecimal getFourtorep() {
        return fourtorep;
    }

    public void setFourtorep(BigDecimal fourtorep) {
        this.fourtorep = fourtorep;
    }

    public BigDecimal getBrandprice() {
        return brandprice;
    }

    public void setBrandprice(BigDecimal brandprice) {
        this.brandprice = brandprice;
    }

    public BigDecimal getSurepreinsuranceprice() {
        return surepreinsuranceprice;
    }

    public void setSurepreinsuranceprice(BigDecimal surepreinsuranceprice) {
        this.surepreinsuranceprice = surepreinsuranceprice;
    }

    public BigDecimal getSurepreoilprice() {
        return surepreoilprice;
    }

    public void setSurepreoilprice(BigDecimal surepreoilprice) {
        this.surepreoilprice = surepreoilprice;
    }

    public String getNeeder() {
        return needer;
    }

    public void setNeeder(String needer) {
        this.needer = needer == null ? null : needer.trim();
    }

    public String getMallcontractcode() {
        return mallcontractcode;
    }

    public void setMallcontractcode(String mallcontractcode) {
        this.mallcontractcode = mallcontractcode == null ? null : mallcontractcode.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", drayage=").append(drayage);
        sb.append(", oceanfreight=").append(oceanfreight);
        sb.append(", elsecost1=").append(elsecost1);
        sb.append(", elsecost2=").append(elsecost2);
        sb.append(", proposer=").append(proposer);
        sb.append(", proposertime=").append(proposertime);
        sb.append(", verifier=").append(verifier);
        sb.append(", verifiertime=").append(verifiertime);
        sb.append(", num=").append(num);
        sb.append(", type=").append(type);
        sb.append(", reason=").append(reason);
        sb.append(", currency=").append(currency);
        sb.append(", country=").append(country);
        sb.append(", fourtorep=").append(fourtorep);
        sb.append(", brandprice=").append(brandprice);
        sb.append(", surepreinsuranceprice=").append(surepreinsuranceprice);
        sb.append(", surepreoilprice=").append(surepreoilprice);
        sb.append(", needer=").append(needer);
        sb.append(", mallcontractcode=").append(mallcontractcode);
        sb.append("]");
        return sb.toString();
    }
}