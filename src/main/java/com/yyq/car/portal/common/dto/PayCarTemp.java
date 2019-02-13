package com.yyq.car.portal.common.dto;
import java.math.BigDecimal;
import java.util.Date;
public class PayCarTemp {
	
	
	//结算
	private BigDecimal sumMoney;

	private Date payStartDate;  // 计息开始日期
	
	private Date payEndDate;    //  计息结束日期
	
	private int freeDays;    // 免息期
	
	private int notFreeDays;    // 计息天数
	
	private Integer iscount;    // 是否计算   2 不计算        (1)  不符合计算上个月利息的条件  (2) 是卖的车  不需要计算利息
	
	private Integer ispayall = 3;//1 未全部结清 2 全部结清

	public BigDecimal getSumMoney() {
		return sumMoney;
	}

	public void setSumMoney(BigDecimal sumMoney) {
		this.sumMoney = sumMoney;
	}

	public Date getPayStartDate() {
		return payStartDate;
	}

	public void setPayStartDate(Date payStartDate) {
		this.payStartDate = payStartDate;
	}

	public Date getPayEndDate() {
		return payEndDate;
	}

	public void setPayEndDate(Date payEndDate) {
		this.payEndDate = payEndDate;
	}

	public int getFreeDays() {
		return freeDays;
	}

	public void setFreeDays(int freeDays) {
		this.freeDays = freeDays;
	}

	public int getNotFreeDays() {
		return notFreeDays;
	}

	public void setNotFreeDays(int notFreeDays) {
		this.notFreeDays = notFreeDays;
	}

	public Integer getIscount() {
		return iscount;
	}

	public void setIscount(Integer iscount) {
		this.iscount = iscount;
	}

	public Integer getIspayall() {
		return ispayall;
	}

	public void setIspayall(Integer ispayall) {
		this.ispayall = ispayall;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}