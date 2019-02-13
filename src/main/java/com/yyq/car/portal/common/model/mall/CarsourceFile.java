package com.yyq.car.portal.common.model.mall;

import java.math.BigDecimal;
import java.util.Date;


public class CarsourceFile {
	private Integer id;

	private Integer sourceid;

	private String unit;

	private Integer type;

	private String picurl;

	private String title;

	private String detail;

	private BigDecimal price;

	private Integer sort;

	private String creator;

	private Date createtime;

	private String updator;

	private Date updatetime;

	private Integer deflt;// 是否默认配置
	
	private Integer ischeck;// 是否选中

	public Integer getDeflt() {
		return deflt;
	}

	public void setDeflt(Integer deflt) {
		this.deflt = deflt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSourceid() {
		return sourceid;
	}

	public void setSourceid(Integer sourceid) {
		this.sourceid = sourceid;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit == null ? null : unit.trim();
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getPicurl() {
		return picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl == null ? null : picurl.trim();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail == null ? null : detail.trim();
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
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

	public String getUpdator() {
		return updator;
	}

	public void setUpdator(String updator) {
		this.updator = updator == null ? null : updator.trim();
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getIscheck() {
		return ischeck;
	}

	public void setIscheck(Integer ischeck) {
		this.ischeck = ischeck;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", sourceid=").append(sourceid);
		sb.append(", unit=").append(unit);
		sb.append(", type=").append(type);
		sb.append(", picurl=").append(picurl);
		sb.append(", title=").append(title);
		sb.append(", detail=").append(detail);
		sb.append(", price=").append(price);
		sb.append(", sort=").append(sort);
		sb.append(", creator=").append(creator);
		sb.append(", createtime=").append(createtime);
		sb.append(", updator=").append(updator);
		sb.append(", updatetime=").append(updatetime);
		sb.append("]");
		return sb.toString();
	}
}