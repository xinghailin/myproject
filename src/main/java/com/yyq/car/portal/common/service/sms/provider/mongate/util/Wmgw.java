/**
 * Wmgw.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yyq.car.portal.common.service.sms.provider.mongate.util;

import java.net.URL;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;


public interface Wmgw extends Service {

	public String getWmgwSoapAddress();

	public WmgwSoap getWmgwSoap() throws ServiceException;

	public WmgwSoap getWmgwSoap(URL portAddress) throws ServiceException;

}
