package com.yyq.car.portal.common.vo;


/**
 * <p>
 * 
 * </p>
 *
 * @author liliang
 * @since 2018-10-16
 */
public class MallOrderDetailVO  {

  

    /**
     * 订单编号
     */
    private String code;
    
    
    private Integer status;

    /**
     * 订单状态
     */
    private Integer orderstatus;
    


    /**
     * 下单人手机号    即 user表中的name字段
     */
    private String username;
    
    private String notinid;
    
    private Integer areaid;
    
    private Integer issealapply;
    
    /**
     * 分页
     */
    private Integer start;
    
    private Integer pageSize;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(Integer orderstatus) {
		this.orderstatus = orderstatus;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getNotinid() {
		return notinid;
	}

	public void setNotinid(String notinid) {
		this.notinid = notinid;
	}

	public Integer getAreaid() {
		return areaid;
	}

	public void setAreaid(Integer areaid) {
		this.areaid = areaid;
	}

	public Integer getIssealapply() {
		return issealapply;
	}

	public void setIssealapply(Integer issealapply) {
		this.issealapply = issealapply;
	}


	

	

   
}
