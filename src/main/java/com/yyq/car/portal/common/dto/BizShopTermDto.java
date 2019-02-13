package com.yyq.car.portal.common.dto;

import java.math.BigDecimal;
import java.util.Date;

public class BizShopTermDto {
	  private Integer id;

	    private String name;

	    private BigDecimal totalmoney;
	    
	    private BigDecimal realmoney;
	    
	    private BigDecimal beleftmoney;

	    private String type;

	    private Date createtime;

	    private String note;

	    private String principal;

	    private BigDecimal bigScale;

	    private Date shopFirstCreatTime;
	    
	    private Integer start;
	    private Integer pageSize;

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

	    public BigDecimal getTotalmoney() {
	        return totalmoney;
	    }

	    public void setTotalmoney(BigDecimal totalmoney) {
	        this.totalmoney = totalmoney;
	    }

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type == null ? null : type.trim();
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

	   

	    public String getPrincipal() {
			return principal;
		}

		public void setPrincipal(String principal) {
			this.principal = principal;
		}

		public BigDecimal getBigScale() {
	        return bigScale;
	    }

	    public void setBigScale(BigDecimal bigScale) {
	        this.bigScale = bigScale;
	    }

	    public Date getShopFirstCreatTime() {
	        return shopFirstCreatTime;
	    }

	    public void setShopFirstCreatTime(Date shopFirstCreatTime) {
	        this.shopFirstCreatTime = shopFirstCreatTime;
	    }

	    public BigDecimal getRealmoney() {
			return realmoney;
		}

		public void setRealmoney(BigDecimal realmoney) {
			this.realmoney = realmoney;
		}

		public BigDecimal getBeleftmoney() {
			return beleftmoney;
		}

		public void setBeleftmoney(BigDecimal beleftmoney) {
			this.beleftmoney = beleftmoney;
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

		@Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append(getClass().getSimpleName());
	        sb.append(" [");
	        sb.append("Hash = ").append(hashCode());
	        sb.append(", id=").append(id);
	        sb.append(", name=").append(name);
	        sb.append(", totalmoney=").append(totalmoney);
	        sb.append(", type=").append(type);
	        sb.append(", createtime=").append(createtime);
	        sb.append(", note=").append(note);
	        sb.append(", principal=").append(principal);
	        sb.append(", bigScale=").append(bigScale);
	        sb.append(", shopFirstCreatTime=").append(shopFirstCreatTime);
	        sb.append("]");
	        return sb.toString();
	    }
}