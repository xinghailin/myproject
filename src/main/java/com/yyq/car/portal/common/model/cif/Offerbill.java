package com.yyq.car.portal.common.model.cif;

import java.math.BigDecimal;
import java.util.Date;


public class Offerbill {
	private Integer id;

	private Integer needid;

	private BigDecimal allprice;

	private BigDecimal firstpay;

	private BigDecimal secondpay;

	private BigDecimal thirteenthpay;

	private BigDecimal fourteenthpay;

	private Date createtime;

	private String district;

	private BigDecimal areaprice;

	private String validtime;

	private BigDecimal bodyprice;

	private BigDecimal tpprice;

	private BigDecimal cnsystem;

	private BigDecimal decorateprice;

	private String middleman;

	private BigDecimal channelprice;

	private BigDecimal finpri;// 金融本金

	private BigDecimal remainprice;// 金融本金*3/4：还完一年后剩下要还的总额

	public BigDecimal getRemainprice() {
		return remainprice;
	}

	public void setRemainprice(BigDecimal remainprice) {
		this.remainprice = remainprice;
	}

	public BigDecimal getFinpri() {
		return finpri;
	}

	public void setFinpri(BigDecimal finpri) {
		this.finpri = finpri;
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

	public BigDecimal getAllprice() {
		return allprice;
	}

	public void setAllprice(BigDecimal allprice) {
		this.allprice = allprice;
	}

	public BigDecimal getFirstpay() {
		return firstpay;
	}

	public void setFirstpay(BigDecimal firstpay) {
		this.firstpay = firstpay;
	}

	public BigDecimal getSecondpay() {
		return secondpay;
	}

	public void setSecondpay(BigDecimal secondpay) {
		this.secondpay = secondpay;
	}

	public BigDecimal getThirteenthpay() {
		return thirteenthpay;
	}

	public void setThirteenthpay(BigDecimal thirteenthpay) {
		this.thirteenthpay = thirteenthpay;
	}

	public BigDecimal getFourteenthpay() {
		return fourteenthpay;
	}

	public void setFourteenthpay(BigDecimal fourteenthpay) {
		this.fourteenthpay = fourteenthpay;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district == null ? null : district.trim();
	}

	public BigDecimal getAreaprice() {
		return areaprice;
	}

	public void setAreaprice(BigDecimal areaprice) {
		this.areaprice = areaprice;
	}

	public String getValidtime() {
		return validtime;
	}

	public void setValidtime(String validtime) {
		this.validtime = validtime == null ? null : validtime.trim();
	}

	public BigDecimal getBodyprice() {
		return bodyprice;
	}

	public void setBodyprice(BigDecimal bodyprice) {
		this.bodyprice = bodyprice;
	}

	public BigDecimal getTpprice() {
		return tpprice;
	}

	public void setTpprice(BigDecimal tpprice) {
		this.tpprice = tpprice;
	}

	public BigDecimal getCnsystem() {
		return cnsystem;
	}

	public void setCnsystem(BigDecimal cnsystem) {
		this.cnsystem = cnsystem;
	}

	public BigDecimal getDecorateprice() {
		return decorateprice;
	}

	public void setDecorateprice(BigDecimal decorateprice) {
		this.decorateprice = decorateprice;
	}

	public String getMiddleman() {
		return middleman;
	}

	public void setMiddleman(String middleman) {
		this.middleman = middleman;
	}

	public BigDecimal getChannelprice() {
		return channelprice;
	}

	public void setChannelprice(BigDecimal channelprice) {
		this.channelprice = channelprice;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", needid=").append(needid);
		sb.append(", allprice=").append(allprice);
		sb.append(", firstpay=").append(firstpay);
		sb.append(", secondpay=").append(secondpay);
		sb.append(", thirteenthpay=").append(thirteenthpay);
		sb.append(", fourteenthpay=").append(fourteenthpay);
		sb.append(", createtime=").append(createtime);
		sb.append(", district=").append(district);
		sb.append(", areaprice=").append(areaprice);
		sb.append(", validtime=").append(validtime);
		sb.append("]");
		return sb.toString();
	}
}