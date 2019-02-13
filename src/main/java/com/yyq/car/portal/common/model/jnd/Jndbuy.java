package com.yyq.car.portal.common.model.jnd;

import java.util.Date;


public class Jndbuy {
	private Integer id;

	private Integer needid;

	private String name;

	private String code;

	private Date createtime;

	private String note;

	private Integer num;

	private Integer currency;// 货币 1 加币 2美元

	private Integer country;// 国家1 加拿大 2中东

	private String needer;

	private String mallcontractcode;

	public String getNeeder() {
		return needer;
	}

	public void setNeeder(String needer) {
		this.needer = needer;
	}

	public String getMallcontractcode() {
		return mallcontractcode;
	}

	public void setMallcontractcode(String mallcontractcode) {
		this.mallcontractcode = mallcontractcode;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNeedid() {
		return needid;
	}

	public void setNeedid(Integer needid) {
		this.needid = needid;
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

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", needid=").append(needid);
		sb.append(", name=").append(name);
		sb.append(", code=").append(code);
		sb.append(", createtime=").append(createtime);
		sb.append(", note=").append(note);
		sb.append(", num=").append(num);
		sb.append("]");
		return sb.toString();
	}
}