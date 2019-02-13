package com.yyq.car.portal.common.model.cif;

import java.util.Date;


public class Account {
	private Integer id;

	private String code;

	private String name;

	private String nickName;

	private String loginPassword;

	private Integer customerId;

	private Integer type;

	private Integer status;

	private Date createTime;

	private String remark;
	
	private Integer accountSource ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName == null ? null : nickName.trim();
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword == null ? null : loginPassword.trim();
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}


	public Integer getAccountSource() {
		return accountSource;
	}

	public void setAccountSource(Integer accountSource) {
		this.accountSource = accountSource;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", code=").append(code);
		sb.append(", name=").append(name);
		sb.append(", nickName=").append(nickName);
		sb.append(", loginPassword=").append(loginPassword);
		sb.append(", customerId=").append(customerId);
		sb.append(", type=").append(type);
		sb.append(", status=").append(status);
		sb.append(", createTime=").append(createTime);
		sb.append(", remark=").append(remark);
		sb.append("]");
		return sb.toString();
	}
}