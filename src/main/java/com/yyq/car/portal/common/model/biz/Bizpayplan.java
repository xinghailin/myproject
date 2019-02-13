package com.yyq.car.portal.common.model.biz;

import java.math.BigDecimal;
import java.util.Date;

public class Bizpayplan {
    private String id;

    private Integer leasebackid;

    private Integer contractid;

    private String name;

    private String identify;

    private String phone;

    private String openbank;

    private String accountname;

    private String accountcode;

    private String payday;

    private String term;

    private BigDecimal price;

    private Date paytime;

    private String status;

    private String autostatus;

    private Date autosuccesstime;

    private Date manualtime;

    private Date createtime;

    private Integer submitstatus;

    private Integer sendstatus;

    private Date smssubmittime;

    private String smsuid;

    private String smsmsgid;

    private Date smsmodifytime;

    private Date paysubmittime;

    private Date paymodifytime;

    private Integer payStatus;

    private Integer sendPayStatus;

    private String transBatchId;

    private String transSerialNo;

    private String queryPayOrderStat;

    private String queryPayRespCode;

    private String queryPayRespMsg;
    
    private String batchId;
    
    private Integer payType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getLeasebackid() {
        return leasebackid;
    }

    public void setLeasebackid(Integer leasebackid) {
        this.leasebackid = leasebackid;
    }

    public Integer getContractid() {
        return contractid;
    }

    public void setContractid(Integer contractid) {
        this.contractid = contractid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify == null ? null : identify.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getOpenbank() {
        return openbank;
    }

    public void setOpenbank(String openbank) {
        this.openbank = openbank == null ? null : openbank.trim();
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public String getAccountcode() {
        return accountcode;
    }

    public void setAccountcode(String accountcode) {
        this.accountcode = accountcode == null ? null : accountcode.trim();
    }

    public String getPayday() {
        return payday;
    }

    public void setPayday(String payday) {
        this.payday = payday == null ? null : payday.trim();
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAutostatus() {
        return autostatus;
    }

    public void setAutostatus(String autostatus) {
        this.autostatus = autostatus == null ? null : autostatus.trim();
    }

    public Date getAutosuccesstime() {
        return autosuccesstime;
    }

    public void setAutosuccesstime(Date autosuccesstime) {
        this.autosuccesstime = autosuccesstime;
    }

    public Date getManualtime() {
        return manualtime;
    }

    public void setManualtime(Date manualtime) {
        this.manualtime = manualtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getSubmitstatus() {
        return submitstatus;
    }

    public void setSubmitstatus(Integer submitstatus) {
        this.submitstatus = submitstatus;
    }

    public Integer getSendstatus() {
        return sendstatus;
    }

    public void setSendstatus(Integer sendstatus) {
        this.sendstatus = sendstatus;
    }

    public Date getSmssubmittime() {
        return smssubmittime;
    }

    public void setSmssubmittime(Date smssubmittime) {
        this.smssubmittime = smssubmittime;
    }

    public String getSmsuid() {
        return smsuid;
    }

    public void setSmsuid(String smsuid) {
        this.smsuid = smsuid == null ? null : smsuid.trim();
    }

    public String getSmsmsgid() {
        return smsmsgid;
    }

    public void setSmsmsgid(String smsmsgid) {
        this.smsmsgid = smsmsgid == null ? null : smsmsgid.trim();
    }

    public Date getSmsmodifytime() {
        return smsmodifytime;
    }

    public void setSmsmodifytime(Date smsmodifytime) {
        this.smsmodifytime = smsmodifytime;
    }

    public Date getPaysubmittime() {
        return paysubmittime;
    }

    public void setPaysubmittime(Date paysubmittime) {
        this.paysubmittime = paysubmittime;
    }

    public Date getPaymodifytime() {
        return paymodifytime;
    }

    public void setPaymodifytime(Date paymodifytime) {
        this.paymodifytime = paymodifytime;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getSendPayStatus() {
        return sendPayStatus;
    }

    public void setSendPayStatus(Integer sendPayStatus) {
        this.sendPayStatus = sendPayStatus;
    }

    public String getTransBatchId() {
        return transBatchId;
    }

    public void setTransBatchId(String transBatchId) {
        this.transBatchId = transBatchId == null ? null : transBatchId.trim();
    }

    public String getTransSerialNo() {
        return transSerialNo;
    }

    public void setTransSerialNo(String transSerialNo) {
        this.transSerialNo = transSerialNo == null ? null : transSerialNo.trim();
    }

    public String getQueryPayOrderStat() {
        return queryPayOrderStat;
    }

    public void setQueryPayOrderStat(String queryPayOrderStat) {
        this.queryPayOrderStat = queryPayOrderStat == null ? null : queryPayOrderStat.trim();
    }

    public String getQueryPayRespCode() {
        return queryPayRespCode;
    }

    public void setQueryPayRespCode(String queryPayRespCode) {
        this.queryPayRespCode = queryPayRespCode == null ? null : queryPayRespCode.trim();
    }

    public String getQueryPayRespMsg() {
        return queryPayRespMsg;
    }

    public void setQueryPayRespMsg(String queryPayRespMsg) {
        this.queryPayRespMsg = queryPayRespMsg == null ? null : queryPayRespMsg.trim();
    }

    public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", leasebackid=").append(leasebackid);
        sb.append(", contractid=").append(contractid);
        sb.append(", name=").append(name);
        sb.append(", identify=").append(identify);
        sb.append(", phone=").append(phone);
        sb.append(", openbank=").append(openbank);
        sb.append(", accountname=").append(accountname);
        sb.append(", accountcode=").append(accountcode);
        sb.append(", payday=").append(payday);
        sb.append(", term=").append(term);
        sb.append(", price=").append(price);
        sb.append(", paytime=").append(paytime);
        sb.append(", status=").append(status);
        sb.append(", autostatus=").append(autostatus);
        sb.append(", autosuccesstime=").append(autosuccesstime);
        sb.append(", manualtime=").append(manualtime);
        sb.append(", createtime=").append(createtime);
        sb.append(", submitstatus=").append(submitstatus);
        sb.append(", sendstatus=").append(sendstatus);
        sb.append(", smssubmittime=").append(smssubmittime);
        sb.append(", smsuid=").append(smsuid);
        sb.append(", smsmsgid=").append(smsmsgid);
        sb.append(", smsmodifytime=").append(smsmodifytime);
        sb.append(", paysubmittime=").append(paysubmittime);
        sb.append(", paymodifytime=").append(paymodifytime);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", sendPayStatus=").append(sendPayStatus);
        sb.append(", transBatchId=").append(transBatchId);
        sb.append(", transSerialNo=").append(transSerialNo);
        sb.append(", queryPayOrderStat=").append(queryPayOrderStat);
        sb.append(", queryPayRespCode=").append(queryPayRespCode);
        sb.append(", queryPayRespMsg=").append(queryPayRespMsg);
        sb.append("]");
        return sb.toString();
    }
}