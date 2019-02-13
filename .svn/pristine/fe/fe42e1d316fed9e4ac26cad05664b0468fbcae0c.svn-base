/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.util.SentinelConfiguration
 * Created By: mjy 
 * Created on: 2014年11月4日 下午3:48:17
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.util;

import java.util.Set;


/**
 * <P>redis主从配置</P>
 * @author mjy
 */
public class SentinelConfiguration {
	/**
	 * （redis）主
	 */
	private String masterName;
	/**
	 * （redis）从
	 */
	private Set<String> sentinels;

	public SentinelConfiguration(String masterName, Set<String> sentinels) {
		this.masterName = masterName;
		this.sentinels = sentinels;
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	public Set<String> getSentinels() {
		return sentinels;
	}

	public void setSentinels(Set<String> sentinels) {
		this.sentinels = sentinels;
	}

}
