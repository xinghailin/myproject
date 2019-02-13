package com.yyq.car.portal.common.model.kr;

import java.math.BigDecimal;
import java.util.Date;

public class Krcar {
    private String id;

    private String poolid;

    private String brand;

    private String model;

    private String version;

    private String vin;

    private BigDecimal price;

    private BigDecimal disprice;

    private String outcolor;

    private String incolor;

    private String cert1;

    private String cert2;

    private String cert3;

    private Integer batnum;

    private String note;

    private Integer status;

    private String creator;

    private Date createtime;

    private String auditor;

    private Date intime;

    private String nopassreason;

    private String outor;

    private Date outtime;

    private Integer remaindays;

    private Integer remainstatus;
    private Date tasktime;
    
    // 以下字段再数据库中不存在  仅展示中用到

    private String poolname;
    
    private Integer start;
    
    private Integer pageSize;
    
    private Date loantime;
    
    private Integer outtimestatus;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPoolid() {
        return poolid;
    }

    public void setPoolid(String poolid) {
        this.poolid = poolid == null ? null : poolid.trim();
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDisprice() {
        return disprice;
    }

    public void setDisprice(BigDecimal disprice) {
        this.disprice = disprice;
    }

    public String getOutcolor() {
        return outcolor;
    }

    public void setOutcolor(String outcolor) {
        this.outcolor = outcolor == null ? null : outcolor.trim();
    }

    public String getIncolor() {
        return incolor;
    }

    public void setIncolor(String incolor) {
        this.incolor = incolor == null ? null : incolor.trim();
    }

    public String getCert1() {
        return cert1;
    }

    public void setCert1(String cert1) {
        this.cert1 = cert1 == null ? null : cert1.trim();
    }

    public String getCert2() {
        return cert2;
    }

    public void setCert2(String cert2) {
        this.cert2 = cert2 == null ? null : cert2.trim();
    }

    public String getCert3() {
        return cert3;
    }

    public void setCert3(String cert3) {
        this.cert3 = cert3 == null ? null : cert3.trim();
    }

    public Integer getBatnum() {
        return batnum;
    }

    public void setBatnum(Integer batnum) {
        this.batnum = batnum;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public String getNopassreason() {
        return nopassreason;
    }

    public void setNopassreason(String nopassreason) {
        this.nopassreason = nopassreason == null ? null : nopassreason.trim();
    }

    public String getOutor() {
        return outor;
    }

    public void setOutor(String outor) {
        this.outor = outor == null ? null : outor.trim();
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    public Integer getRemaindays() {
        return remaindays;
    }

    public void setRemaindays(Integer remaindays) {
        this.remaindays = remaindays;
    }

    public Integer getRemainstatus() {
        return remainstatus;
    }

    public void setRemainstatus(Integer remainstatus) {
        this.remainstatus = remainstatus;
    }

    public String getPoolname() {
		return poolname;
	}

	public void setPoolname(String poolname) {
		this.poolname = poolname;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", poolid=").append(poolid);
        sb.append(", brand=").append(brand);
        sb.append(", model=").append(model);
        sb.append(", version=").append(version);
        sb.append(", vin=").append(vin);
        sb.append(", price=").append(price);
        sb.append(", disprice=").append(disprice);
        sb.append(", outcolor=").append(outcolor);
        sb.append(", incolor=").append(incolor);
        sb.append(", cert1=").append(cert1);
        sb.append(", cert2=").append(cert2);
        sb.append(", cert3=").append(cert3);
        sb.append(", batnum=").append(batnum);
        sb.append(", note=").append(note);
        sb.append(", status=").append(status);
        sb.append(", creator=").append(creator);
        sb.append(", createtime=").append(createtime);
        sb.append(", auditor=").append(auditor);
        sb.append(", intime=").append(intime);
        sb.append(", nopassreason=").append(nopassreason);
        sb.append(", outor=").append(outor);
        sb.append(", outtime=").append(outtime);
        sb.append(", remaindays=").append(remaindays);
        sb.append(", remainstatus=").append(remainstatus);
        sb.append("]");
        return sb.toString();
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

	public Date getLoantime() {
		return loantime;
	}

	public void setLoantime(Date loantime) {
		this.loantime = loantime;
	}

	public Date getTasktime() {
		return tasktime;
	}

	public void setTasktime(Date tasktime) {
		this.tasktime = tasktime;
	}

	public Integer getOuttimestatus() {
		return outtimestatus;
	}

	public void setOuttimestatus(Integer outtimestatus) {
		this.outtimestatus = outtimestatus;
	}

}