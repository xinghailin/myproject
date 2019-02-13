package com.yyq.car.portal.common.model.mall;

import java.util.Date;

public class mallUser {
    private String id;

    private String mobile;

    private String username;

    private String password;

    private String country;

    private String city;

    private Integer status;

    private String note;

    private Date createtime;

    private Date lastlogintime;

    private Integer organtype;

    private String regtype;

    private String organcode;

    private String organizeaccountid;

    private String organizesealdata;

    private Integer usertype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Integer getOrgantype() {
        return organtype;
    }

    public void setOrgantype(Integer organtype) {
        this.organtype = organtype;
    }

    public String getRegtype() {
        return regtype;
    }

    public void setRegtype(String regtype) {
        this.regtype = regtype == null ? null : regtype.trim();
    }

    public String getOrgancode() {
        return organcode;
    }

    public void setOrgancode(String organcode) {
        this.organcode = organcode == null ? null : organcode.trim();
    }

    public String getOrganizeaccountid() {
        return organizeaccountid;
    }

    public void setOrganizeaccountid(String organizeaccountid) {
        this.organizeaccountid = organizeaccountid == null ? null : organizeaccountid.trim();
    }

    public String getOrganizesealdata() {
        return organizesealdata;
    }

    public void setOrganizesealdata(String organizesealdata) {
        this.organizesealdata = organizesealdata == null ? null : organizesealdata.trim();
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mobile=").append(mobile);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", country=").append(country);
        sb.append(", city=").append(city);
        sb.append(", status=").append(status);
        sb.append(", note=").append(note);
        sb.append(", createtime=").append(createtime);
        sb.append(", lastlogintime=").append(lastlogintime);
        sb.append(", organtype=").append(organtype);
        sb.append(", regtype=").append(regtype);
        sb.append(", organcode=").append(organcode);
        sb.append(", organizeaccountid=").append(organizeaccountid);
        sb.append(", organizesealdata=").append(organizesealdata);
        sb.append(", usertype=").append(usertype);
        sb.append("]");
        return sb.toString();
    }
}