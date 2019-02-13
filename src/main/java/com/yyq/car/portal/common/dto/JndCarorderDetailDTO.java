package com.yyq.car.portal.common.dto;

import java.math.BigDecimal;
import java.util.Date;

public class JndCarorderDetailDTO {
    private String id;

    private Integer sourceid;

    private String skucode;

    private String ordercode;

    private String subordercode;

    private String contractcode;

    private Date createtime;

    private Integer verifystatus;

    private String description;

    private BigDecimal totalprice;

    private Integer areaid;

    private String unit;

    private String areaname;
    
    private String brand;

    private String model;

    private String version;
    
    private String username;
    
    private String vin;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getSourceid() {
        return sourceid;
    }

    public void setSourceid(Integer sourceid) {
        this.sourceid = sourceid;
    }

    public String getSkucode() {
        return skucode;
    }

    public void setSkucode(String skucode) {
        this.skucode = skucode == null ? null : skucode.trim();
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode == null ? null : ordercode.trim();
    }

    public String getSubordercode() {
        return subordercode;
    }

    public void setSubordercode(String subordercode) {
        this.subordercode = subordercode == null ? null : subordercode.trim();
    }

    public String getContractcode() {
        return contractcode;
    }

    public void setContractcode(String contractcode) {
        this.contractcode = contractcode == null ? null : contractcode.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getVerifystatus() {
        return verifystatus;
    }

    public void setVerifystatus(Integer verifystatus) {
        this.verifystatus = verifystatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sourceid=").append(sourceid);
        sb.append(", skucode=").append(skucode);
        sb.append(", ordercode=").append(ordercode);
        sb.append(", subordercode=").append(subordercode);
        sb.append(", contractcode=").append(contractcode);
        sb.append(", createtime=").append(createtime);
        sb.append(", verifystatus=").append(verifystatus);
        sb.append(", description=").append(description);
        sb.append(", totalprice=").append(totalprice);
        sb.append(", areaid=").append(areaid);
        sb.append(", unit=").append(unit);
        sb.append(", areaname=").append(areaname);
        sb.append("]");
        return sb.toString();
    }

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}
}