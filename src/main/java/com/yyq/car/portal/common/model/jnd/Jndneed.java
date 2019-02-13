package com.yyq.car.portal.common.model.jnd;

import java.util.Date;


public class Jndneed {
	private Integer id;

	private String name;

	private String code;

	private Integer num;
	private Integer num2;
	private Integer num3;
	private Date createtime;

	private String note;

	private Integer currency;

	private Integer country;

	private String needer;

	private String mallcontractcode;

	private Integer needtype;

	private Integer status;
	private String creator;

	private String updator;

	private Date updatetime;
	
	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getUpdator() {
		return updator;
	}

	public void setUpdator(String updator) {
		this.updator = updator;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getNum2() {
		return num2;
	}

	public void setNum2(Integer num2) {
		this.num2 = num2;
	}

	public Integer getNum3() {
		return num3;
	}

	public void setNum3(Integer num3) {
		this.num3 = num3;
	}
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note == null ? null : note.trim();
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

	public Integer getNeedtype() {
		return needtype;
	}

	public void setNeedtype(Integer needtype) {
		this.needtype = needtype;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", name=").append(name);
		sb.append(", code=").append(code);
		sb.append(", num=").append(num);
		sb.append(", createtime=").append(createtime);
		sb.append(", note=").append(note);
		sb.append(", currency=").append(currency);
		sb.append(", country=").append(country);
		sb.append(", needer=").append(needer);
		sb.append(", mallcontractcode=").append(mallcontractcode);
		sb.append("]");
		return sb.toString();
	}
}