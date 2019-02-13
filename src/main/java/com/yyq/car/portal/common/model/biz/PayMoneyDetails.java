package com.yyq.car.portal.common.model.biz;

import java.math.BigDecimal;
import java.util.Date;

public class PayMoneyDetails {
    private String id;

    private String payId;

    private Integer shopId;

    private Integer carId;

    private Date createTime;

    private Date modifyTime;

    private BigDecimal payMoney;

    private Date payStartDate;

    private Date payEndDate;

    private Integer freeDays;

    private Integer notfreeDays;

    private Integer isPayall;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public Date getPayStartDate() {
        return payStartDate;
    }

    public void setPayStartDate(Date payStartDate) {
        this.payStartDate = payStartDate;
    }

    public Date getPayEndDate() {
        return payEndDate;
    }

    public void setPayEndDate(Date payEndDate) {
        this.payEndDate = payEndDate;
    }

    public Integer getFreeDays() {
        return freeDays;
    }

    public void setFreeDays(Integer freeDays) {
        this.freeDays = freeDays;
    }

    public Integer getNotfreeDays() {
        return notfreeDays;
    }

    public void setNotfreeDays(Integer notfreeDays) {
        this.notfreeDays = notfreeDays;
    }

    public Integer getIsPayall() {
        return isPayall;
    }

    public void setIsPayall(Integer isPayall) {
        this.isPayall = isPayall;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", payId=").append(payId);
        sb.append(", shopId=").append(shopId);
        sb.append(", carId=").append(carId);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", payStartDate=").append(payStartDate);
        sb.append(", payEndDate=").append(payEndDate);
        sb.append(", freeDays=").append(freeDays);
        sb.append(", notfreeDays=").append(notfreeDays);
        sb.append(", isPayall=").append(isPayall);
        sb.append("]");
        return sb.toString();
    }
}