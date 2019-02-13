/*******************************************************************************
 * Project   : portal-ms
 * Class Name: com.yyq.portal.ms.common.exception.PortalMsException
 * Created By: Jonathan 
 * Created on: 2014-6-5 下午4:26:32
 * Copyright © 2008-2014 NATIE All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.exception;

import org.ufa.core.exception.BaseCheckedException;

/**
 * <P>系统异常</P>
 * @author Jonathan
 */
public class PortalAppCheckedException extends BaseCheckedException{

	/**
	 * TODO
	 */
	private static final long serialVersionUID = -8589759687972557489L;

	/**
	 * <p>Method for constructor</p>
	 * @param defaultMessage
	 */
	public PortalAppCheckedException(String defaultMessage) {
		super(defaultMessage);
	}
	
	/**
	 * <p>Method for constructor</p>
	 * @param code
	 * @param params
	 * @param defaultMessage
	 */
	public PortalAppCheckedException(String code, String[] params, String defaultMessage) {
		super(code, params, defaultMessage);
	}

	public PortalAppCheckedException(String code, String defaultMessage) {
		super(code, null, defaultMessage);
	}
}
