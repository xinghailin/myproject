/*******************************************************************************
 * Project   : car-common
 * Class Name: com.yyq.car.portal.common.dto.Riskfiledto
 * Created By: wangzh 
 * Created on: 2018年5月2日 下午6:34:08
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.dto;

import java.io.InputStream;


/**
 * <P>风控进件dto</P>
 * @author wangzh
 */
public class Riskfiledto {

	String name;
	InputStream input;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public InputStream getInput() {
		return input;
	}

	public void setInput(InputStream input) {
		this.input = input;
	}

}
