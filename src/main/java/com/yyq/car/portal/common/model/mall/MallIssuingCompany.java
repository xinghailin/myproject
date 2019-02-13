package com.yyq.car.portal.common.model.mall;

import java.util.Date;

public class MallIssuingCompany {
    private Integer id;

    private String name;

    private String receiveunit;

    private String sendunit;

    private Integer type;

    private String downpayscale;

    private String downpayscale2;

    private String introduce;

    private Integer status;

    private String creator;

    private Date createtime;

    private Date updatetime;

    private String updator;

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

    public String getReceiveunit() {
        return receiveunit;
    }

    public void setReceiveunit(String receiveunit) {
        this.receiveunit = receiveunit == null ? null : receiveunit.trim();
    }

    public String getSendunit() {
        return sendunit;
    }

    public void setSendunit(String sendunit) {
        this.sendunit = sendunit == null ? null : sendunit.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDownpayscale() {
        return downpayscale;
    }

    public void setDownpayscale(String downpayscale) {
        this.downpayscale = downpayscale == null ? null : downpayscale.trim();
    }

    public String getDownpayscale2() {
        return downpayscale2;
    }

    public void setDownpayscale2(String downpayscale2) {
        this.downpayscale2 = downpayscale2 == null ? null : downpayscale2.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", receiveunit=").append(receiveunit);
        sb.append(", sendunit=").append(sendunit);
        sb.append(", type=").append(type);
        sb.append(", downpayscale=").append(downpayscale);
        sb.append(", downpayscale2=").append(downpayscale2);
        sb.append(", introduce=").append(introduce);
        sb.append(", status=").append(status);
        sb.append(", creator=").append(creator);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", updator=").append(updator);
        sb.append("]");
        return sb.toString();
    }
}