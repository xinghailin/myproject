package com.yyq.car.portal.common.model.cif;

import java.math.BigDecimal;
import java.util.Date;


public class Bargain {
	private Integer id;// 自增主键

	private String initiatorId;// 发起人id

	private BigDecimal money;// 参与者坎的钱数

	private String weixinId;// openid

	private String weixinPic;// 参与者头像

	private Integer phone;// 手机

	private Date createTime;//

	private Integer state;//

	private String country;// 国家

	private String province;// 省

	private String sex;// 性别

	private String city;// 城市

	private String name;// 昵称

	private String comefrom;// 从公众号或者外部链接进来的？

	private String talk;

	public String getTalk() {
		return talk;
	}

	public void setTalk(String talk) {
		this.talk = talk;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInitiatorId() {
		return initiatorId;
	}

	public void setInitiatorId(String initiatorId) {
		this.initiatorId = initiatorId == null ? null : initiatorId.trim();
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getWeixinId() {
		return weixinId;
	}

	public void setWeixinId(String weixinId) {
		this.weixinId = weixinId == null ? null : weixinId.trim();
	}

	public String getWeixinPic() {
		return weixinPic;
	}

	public void setWeixinPic(String weixinPic) {
		this.weixinPic = weixinPic == null ? null : weixinPic.trim();
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country == null ? null : country.trim();
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getComefrom() {
		return comefrom;
	}

	public void setComefrom(String comefrom) {
		this.comefrom = comefrom == null ? null : comefrom.trim();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", initiatorId=").append(initiatorId);
		sb.append(", money=").append(money);
		sb.append(", weixinId=").append(weixinId);
		sb.append(", weixinPic=").append(weixinPic);
		sb.append(", phone=").append(phone);
		sb.append(", createTime=").append(createTime);
		sb.append(", state=").append(state);
		sb.append(", country=").append(country);
		sb.append(", sex=").append(sex);
		sb.append(", city=").append(city);
		sb.append(", name=").append(name);
		sb.append(", comefrom=").append(comefrom);
		sb.append("]");
		return sb.toString();
	}
}