package com.yyq.car.portal.common.model.comm;

import java.math.BigDecimal;
import java.util.Date;


public class PriceCity {
	private Integer id;

	private String brand;

	private String model;

	private String vin;

	private String type;

	private String pro;

	private String city;

	private String proName;

	private String cityName;

	private Date createTime;

	private BigDecimal price;

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand == null ? null : brand.trim();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model == null ? null : model.trim();
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin == null ? null : vin.trim();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro == null ? null : pro.trim();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName == null ? null : proName.trim();
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName == null ? null : cityName.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", brand=").append(brand);
		sb.append(", model=").append(model);
		sb.append(", vin=").append(vin);
		sb.append(", type=").append(type);
		sb.append(", pro=").append(pro);
		sb.append(", city=").append(city);
		sb.append(", proName=").append(proName);
		sb.append(", cityName=").append(cityName);
		sb.append(", createTime=").append(createTime);
		sb.append("]");
		return sb.toString();
	}
}