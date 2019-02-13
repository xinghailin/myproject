/*******************************************************************************
 * Project   : decorate-portal-common
 * Class Name: com.yyq.decorate.portal.common.web.initialization.APPAwareBean
 * Created By: wangzh 
 * Created on: 2017年2月13日 下午6:30:15
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.web.initialization;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


/**
 * <P>TODO</P>
 * @author wangzh
 */
public class APPAwareBean implements ApplicationContextAware {

	private ApplicationContext appContext;

	/**
	 * <p>Method for constructor</p>
	 */
	public APPAwareBean() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework
	 * .context.ApplicationContext)
	 * @author wangzh
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		appContext = applicationContext;
	}

	public ApplicationContext getAppContext() {
		return appContext;
	}

	public void setAppContext(ApplicationContext appContext) {
		this.appContext = appContext;
	}

}
