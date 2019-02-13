/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.dto.MasterDataDTO
 * Created By: Jonathan 
 * Created on: 2014年11月25日 上午1:15:14
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.dto;

import org.ufa.core.model.BaseObject;


/**
 * <P>基础数据DTO</P>
 * @author Jonathan
 */
public class MasterDataDTO extends BaseObject {

	/**
	 * TODO
	 */
	private static final long serialVersionUID = 136205100617174017L;

	private String code;

	private String value;

	private String description;

	private Integer sortNum;

	private Integer isDefault;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getSortNum() {
		return sortNum;
	}

	public void setSortNum(Integer sortNum) {
		this.sortNum = sortNum;
	}

	public Integer getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

}
