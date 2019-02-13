package com.yyq.car.portal.common.model.web;

import java.util.Date;
import java.util.List;

public class Purchaseareapic {
    private String id;

    private String url;

    private Date createtime;

    private Date modifytime;

    private Integer createuser;

    private Integer modifyuser;

    private String parentId;

    private String parentGroupId;
    
    private List<Purchaseareapicname> picname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId == null ? null : parentGroupId.trim();
    }

    public List<Purchaseareapicname> getPicname() {
		return picname;
	}

	public void setPicname(List<Purchaseareapicname> picname) {
		this.picname = picname;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", url=").append(url);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", createuser=").append(createuser);
        sb.append(", modifyuser=").append(modifyuser);
        sb.append(", parentId=").append(parentId);
        sb.append(", parentGroupId=").append(parentGroupId);
        sb.append("]");
        return sb.toString();
    }
}