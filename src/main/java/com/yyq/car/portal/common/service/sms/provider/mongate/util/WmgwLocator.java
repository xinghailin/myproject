/**
 * WmgwLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yyq.car.portal.common.service.sms.provider.mongate.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.HashSet;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

public class WmgwLocator extends Service implements Wmgw {

	/***/
	private static final long serialVersionUID = -4446496390454756949L;

	public WmgwLocator() {
	}

	public WmgwLocator(EngineConfiguration config) {
		super(config);
	}

	public WmgwLocator(String wsdlLoc, QName sName) throws ServiceException {
		super(wsdlLoc, sName);
	}

	//http://ws.montnets.com:9002/MWGate/wmgw.asmx
	// Use to get a proxy class for wmgwSoap
	//private String wmgwSoapAddress = "http://ws.montnets.com:9002/MWGate/wmgw.asmx";// 61.145.229.29

	//public final String WMGW_SOAP_ADDRESS_9002 = "http://ws.montnets.com:9002/MWGate/wmgw.asmx";

	//public final String WMGW_SOAP_ADDRESS_7903 = "http://ws.montnets.com:7791/MWGate/wmgw.asmx";
	private String wmgwSoapAddress;
	
	@Override
	public String getWmgwSoapAddress() {
		return wmgwSoapAddress;
	}

	// The WSDD service name defaults to the port name.
	private String wmgwSoapWSDDServiceName = "wmgwSoap";

	public String getWmgwSoapWSDDServiceName() {
		return wmgwSoapWSDDServiceName;
	}

	public void setWmgwSoapWSDDServiceName(String name) {
		wmgwSoapWSDDServiceName = name;
	}

	@Override
	public WmgwSoap getWmgwSoap() throws ServiceException {
		URL endpoint;
		try {
			endpoint = new URL(wmgwSoapAddress);
		} catch (MalformedURLException e) {
			throw new ServiceException(e);
		}
		return getWmgwSoap(endpoint);
	}

	@Override
	public WmgwSoap getWmgwSoap(URL portAddress) throws ServiceException {
		try {
			WmgwSoapStub stub = new WmgwSoapStub(portAddress, this);
			stub.setPortName(getWmgwSoapWSDDServiceName());
			return stub;
		} catch (AxisFault e) {
			return null;
		}
	}

	public void setWmgwSoapEndpointAddress(String address) {
		wmgwSoapAddress = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no port for the
	 * given interface, then ServiceException is thrown.
	 */
	@Override
	public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
		try {
			if (WmgwSoap.class.isAssignableFrom(serviceEndpointInterface)) {
				WmgwSoapStub _stub = new WmgwSoapStub(new URL(wmgwSoapAddress), this);
				_stub.setPortName(getWmgwSoapWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Throwable t) {
			throw new ServiceException(t);
		}
		throw new ServiceException("There is no stub implementation for the interface:  "
				+ (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no port for the
	 * given interface, then ServiceException is thrown.
	 */
	@Override
	public Remote getPort(QName portName, Class serviceEndpointInterface) throws ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		String inputPortName = portName.getLocalPart();
		if ("wmgwSoap".equals(inputPortName)) {
			return getWmgwSoap();
		} else {
			Remote _stub = getPort(serviceEndpointInterface);
			((Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	@Override
	public QName getServiceName() {
		return new QName("http://tempuri.org/", "wmgw");
	}

	private HashSet ports = null;

	@Override
	public Iterator getPorts() {
		if (ports == null) {
			ports = new HashSet();
			ports.add(new QName("http://tempuri.org/", "wmgwSoap"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(String portName, String address) throws ServiceException {

		if ("wmgwSoap".equals(portName)) {
			setWmgwSoapEndpointAddress(address);
		} else { // Unknown Port Name
			throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(QName portName, String address) throws ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
