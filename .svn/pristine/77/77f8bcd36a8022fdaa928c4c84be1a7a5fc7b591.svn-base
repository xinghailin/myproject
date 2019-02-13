/**
 * WmgwSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yyq.car.portal.common.service.sms.provider.mongate.util;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.Enumeration;
import java.util.Vector;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;

import org.apache.axis.AxisEngine;
import org.apache.axis.AxisFault;
import org.apache.axis.NoEndPointException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.DeserializerFactory;
import org.apache.axis.encoding.SerializerFactory;
import org.apache.axis.encoding.ser.ArrayDeserializerFactory;
import org.apache.axis.encoding.ser.ArraySerializerFactory;
import org.apache.axis.soap.SOAPConstants;
import org.apache.axis.utils.JavaUtils;


public class WmgwSoapStub extends Stub implements WmgwSoap {
	private final Vector cachedSerClasses = new Vector();
	private final Vector cachedSerQNames = new Vector();
	private final Vector cachedSerFactories = new Vector();
	private final Vector cachedDeserFactories = new Vector();

	static OperationDesc[] operations;

	static {
		operations = new OperationDesc[5];
		initOperationDesc();
	}

	private static void initOperationDesc() {
		OperationDesc oper;
		ParameterDesc param;
		oper = new OperationDesc();
		oper.setName("MongateCsSendSmsEx");
		param = new ParameterDesc(new QName("http://tempuri.org/", "userId"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("http://tempuri.org/", "password"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("http://tempuri.org/", "pszMobis"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("http://tempuri.org/", "pszMsg"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("http://tempuri.org/", "iMobiCount"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(String.class);
		oper.setReturnQName(new QName("http://tempuri.org/", "MongateCsSendSmsExResult"));
		oper.setStyle(Style.WRAPPED);
		oper.setUse(Use.LITERAL);
		operations[0] = oper;

		oper = new OperationDesc();
		oper.setName("MongateCsGetSmsExEx");
		param = new ParameterDesc(new QName("http://tempuri.org/", "userId"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("http://tempuri.org/", "password"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://tempuri.org/", "ArrayOfString"));
		oper.setReturnClass(String[].class);
		oper.setReturnQName(new QName("http://tempuri.org/", "MongateCsGetSmsExExResult"));
		param = oper.getReturnParamDesc();
		param.setItemQName(new QName("http://tempuri.org/", "string"));
		oper.setStyle(Style.WRAPPED);
		oper.setUse(Use.LITERAL);
		operations[1] = oper;

		oper = new OperationDesc();
		oper.setName("MongateCsGetStatusReportExEx");
		param = new ParameterDesc(new QName("http://tempuri.org/", "userId"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("http://tempuri.org/", "password"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://tempuri.org/", "ArrayOfString"));
		oper.setReturnClass(String[].class);
		oper.setReturnQName(new QName("http://tempuri.org/", "MongateCsGetStatusReportExExResult"));
		param = oper.getReturnParamDesc();
		param.setItemQName(new QName("http://tempuri.org/", "string"));
		oper.setStyle(Style.WRAPPED);
		oper.setUse(Use.LITERAL);
		operations[2] = oper;

		oper = new OperationDesc();
		oper.setName("MongateQueryBalance");
		param = new ParameterDesc(new QName("http://tempuri.org/", "userId"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("http://tempuri.org/", "password"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
		oper.setReturnClass(int.class);
		oper.setReturnQName(new QName("http://tempuri.org/", "MongateQueryBalanceResult"));
		oper.setStyle(Style.WRAPPED);
		oper.setUse(Use.LITERAL);
		operations[3] = oper;

		oper = new OperationDesc();
		oper.setName("MongateCsSpSendSmsNew");
		param = new ParameterDesc(new QName("http://tempuri.org/", "userId"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("http://tempuri.org/", "password"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("http://tempuri.org/", "pszMobis"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("http://tempuri.org/", "pszMsg"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("http://tempuri.org/", "iMobiCount"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
		oper.addParameter(param);
		param = new ParameterDesc(new QName("http://tempuri.org/", "pszSubPort"), ParameterDesc.IN, new QName(
				"http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(String.class);
		oper.setReturnQName(new QName("http://tempuri.org/", "MongateCsSpSendSmsNewResult"));
		oper.setStyle(Style.WRAPPED);
		oper.setUse(Use.LITERAL);
		operations[4] = oper;

	}

	public WmgwSoapStub() throws AxisFault {
		this(null);
	}

	public WmgwSoapStub(URL endpointURL, Service service) throws AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public WmgwSoapStub(Service service) throws AxisFault {
		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
		QName qName;
		QName qName2;
		// Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		// Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		// Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		// Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		// Class arraysf = ArraySerializerFactory.class;
		// Class arraydf = ArrayDeserializerFactory.class;
		// Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		// Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		// Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		// Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		qName = new QName("http://tempuri.org/", "ArrayOfString");
		cachedSerQNames.add(qName);
		Class cls = String[].class;
		cachedSerClasses.add(cls);
		qName = new QName("http://www.w3.org/2001/XMLSchema", "string");
		qName2 = new QName("http://tempuri.org/", "string");
		cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new ArrayDeserializerFactory());

	}

	protected Call createCall() throws RemoteException {
		try {
			Call call = super._createCall();
			if (super.maintainSessionSet) {
				call.setMaintainSession(super.maintainSession);
			}
			if (super.cachedUsername != null) {
				call.setUsername(super.cachedUsername);
			}
			if (super.cachedPassword != null) {
				call.setPassword(super.cachedPassword);
			}
			if (super.cachedEndpoint != null) {
				call.setTargetEndpointAddress(super.cachedEndpoint);
			}
			if (super.cachedTimeout != null) {
				call.setTimeout(super.cachedTimeout);
			}
			if (super.cachedPortName != null) {
				call.setPortName(super.cachedPortName);
			}
			Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				call.setProperty(key, super.cachedProperties.get(key));
			}
			// All the type mapping information is registered
			// when the first call is made.
			// The type mapping information is actually registered in
			// the TypeMappingRegistry of the service, which
			// is the reason why registration is only needed for the first call.
			synchronized (this) {
				if (firstCall()) {
					// must set encoding style before registering serializers
					call.setEncodingStyle(null);
					for (int i = 0; i < cachedSerFactories.size(); ++i) {
						Class cls = (Class) cachedSerClasses.get(i);
						QName qName = (QName) cachedSerQNames.get(i);
						Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							Class sf = (Class) cachedSerFactories.get(i);
							Class df = (Class) cachedDeserFactories.get(i);
							call.registerTypeMapping(cls, qName, sf, df, false);
						} else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
							SerializerFactory sf = (SerializerFactory) cachedSerFactories.get(i);
							DeserializerFactory df = (DeserializerFactory) cachedDeserFactories.get(i);
							call.registerTypeMapping(cls, qName, sf, df, false);
						}
					}
				}
			}
			return call;
		} catch (Throwable t) {
			throw new AxisFault("Failure trying to get the Call object", t);
		}
	}

	@Override
	public String mongateCsSendSmsEx(String userId, String password, String pszMobis, String pszMsg, int iMobiCount)
			throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new NoEndPointException();
		}
		Call call = createCall();
		call.setOperation(operations[0]);
		call.setUseSOAPAction(true);
		call.setSOAPActionURI("http://tempuri.org/MongateCsSendSmsEx");
		call.setEncodingStyle(null);
		call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
		call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
		call.setOperationName(new QName("http://tempuri.org/", "MongateCsSendSmsEx"));

		setRequestHeaders(call);
		setAttachments(call);
		try {
			Object resp = call.invoke(new Object[] { userId, password, pszMobis, pszMsg, new Integer(iMobiCount) });

			if (resp instanceof RemoteException) {
				throw (RemoteException) resp;
			} else {
				extractAttachments(call);
				try {
					return (String) resp;
				} catch (Exception e) {
					return (String) JavaUtils.convert(resp, String.class);
				}
			}
		} catch (AxisFault afe) {
			throw afe;
		}
	}

	@Override
	public String[] mongateCsGetSmsExEx(String userId, String password) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new NoEndPointException();
		}
		Call call = createCall();
		call.setOperation(operations[1]);
		call.setUseSOAPAction(true);
		call.setSOAPActionURI("http://tempuri.org/MongateCsGetSmsExEx");
		call.setEncodingStyle(null);
		call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
		call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
		call.setOperationName(new QName("http://tempuri.org/", "MongateCsGetSmsExEx"));

		setRequestHeaders(call);
		setAttachments(call);
		try {
			Object resp = call.invoke(new Object[] { userId, password });

			if (resp instanceof RemoteException) {
				throw (RemoteException) resp;
			} else {
				extractAttachments(call);
				try {
					return (String[]) resp;
				} catch (Exception e) {
					return (String[]) JavaUtils.convert(resp, String[].class);
				}
			}
		} catch (AxisFault afe) {
			throw afe;
		}
	}

	@Override
	public String[] mongateCsGetStatusReportExEx(String userId, String password) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new NoEndPointException();
		}
		Call call = createCall();
		call.setOperation(operations[2]);
		call.setUseSOAPAction(true);
		call.setSOAPActionURI("http://tempuri.org/MongateCsGetStatusReportExEx");
		call.setEncodingStyle(null);
		call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
		call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
		call.setOperationName(new QName("http://tempuri.org/", "MongateCsGetStatusReportExEx"));

		setRequestHeaders(call);
		setAttachments(call);
		try {
			Object resp = call.invoke(new Object[] { userId, password });

			if (resp instanceof RemoteException) {
				throw (RemoteException) resp;
			} else {
				extractAttachments(call);
				try {
					return (String[]) resp;
				} catch (Exception e) {
					return (String[]) JavaUtils.convert(resp, String[].class);
				}
			}
		} catch (AxisFault afe) {
			throw afe;
		}
	}

	@Override
	public int mongateQueryBalance(String userId, String password) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new NoEndPointException();
		}
		Call call = createCall();
		call.setOperation(operations[3]);
		call.setUseSOAPAction(true);
		call.setSOAPActionURI("http://tempuri.org/MongateQueryBalance");
		call.setEncodingStyle(null);
		call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
		call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
		call.setOperationName(new QName("http://tempuri.org/", "MongateQueryBalance"));

		setRequestHeaders(call);
		setAttachments(call);
		try {
			Object resp = call.invoke(new Object[] { userId, password });

			if (resp instanceof RemoteException) {
				throw (RemoteException) resp;
			} else {
				extractAttachments(call);
				try {
					return ((Integer) resp).intValue();
				} catch (Exception e) {
					return ((Integer) JavaUtils.convert(resp, int.class)).intValue();
				}
			}
		} catch (AxisFault afe) {
			throw afe;
		}
	}

	@Override
	public String mongateCsSpSendSmsNew(String userId, String password, String pszMobis, String pszMsg, int iMobiCount,
			String pszSubPort) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new NoEndPointException();
		}
		Call call = createCall();
		call.setOperation(operations[4]);
		call.setUseSOAPAction(true);
		call.setSOAPActionURI("http://tempuri.org/MongateCsSpSendSmsNew");
		call.setEncodingStyle(null);
		call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
		call.setProperty(AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
		call.setOperationName(new QName("http://tempuri.org/", "MongateCsSpSendSmsNew"));

		setRequestHeaders(call);
		setAttachments(call);
		try {
			Object resp = call.invoke(new Object[] { userId, password, pszMobis, pszMsg, new Integer(iMobiCount),
					pszSubPort });

			if (resp instanceof RemoteException) {
				throw (RemoteException) resp;
			} else {
				extractAttachments(call);
				try {
					return (String) resp;
				} catch (Exception e) {
					return (String) JavaUtils.convert(resp, String.class);
				}
			}
		} catch (AxisFault afe) {
			throw afe;
		}
	}

}
