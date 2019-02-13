package com.yyq.car.portal.common.model.wholesale;

import java.math.BigDecimal;
import java.util.Date;

public class WholesaleCar {
    private String id;

    private Integer carid;

    private String monad;

    private BigDecimal price;

    private Integer status;

    private Integer location;

    private Integer status2;

    private Date createtime;

    private Date modifytime;

    private Integer createuser;

    private Integer modifyuser;

    private String reason1;

    private String reason2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public String getMonad() {
        return monad;
    }

    public void setMonad(String monad) {
        this.monad = monad == null ? null : monad.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Integer getStatus2() {
        return status2;
    }

    public void setStatus2(Integer status2) {
        this.status2 = status2;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Integer getCreateuser() {
        return createuser;
    }

    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }

    public Integer getModifyuser() {
        return modifyuser;
    }

    public void setModifyuser(Integer modifyuser) {
        this.modifyuser = modifyuser;
    }

    public String getReason1() {
        return reason1;
    }

    public void setReason1(String reason1) {
        this.reason1 = reason1 == null ? null : reason1.trim();
    }

    public String getReason2() {
        return reason2;
    }

    public void setReason2(String reason2) {
        this.reason2 = reason2 == null ? null : reason2.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", carid=").append(carid);
        sb.append(", monad=").append(monad);
        sb.append(", price=").append(price);
        sb.append(", status=").append(status);
        sb.append(", location=").append(location);
        sb.append(", status2=").append(status2);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", createuser=").append(createuser);
        sb.append(", modifyuser=").append(modifyuser);
        sb.append(", reason1=").append(reason1);
        sb.append(", reason2=").append(reason2);
        sb.append("]");
        return sb.toString();
    }
}