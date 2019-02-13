package com.yyq.car.portal.common.model.product;

import java.util.Date;

public class CarTypePic {
    private Integer id;

    private Integer typeid;

    private Integer type;

    private String pic;

    private Integer sort;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
        sb.append(", typeid=").append(typeid);
        sb.append(", type=").append(type);
        sb.append(", pic=").append(pic);
        sb.append(", sort=").append(sort);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}