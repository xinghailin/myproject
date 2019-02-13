package com.yyq.car.portal.common.util;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * XML与对象之间进行转换
 * 
 * @author lidongfu
 * 
 */
public class XmlUtil {

	private static final Logger logger = LoggerFactory.getLogger(XmlUtil.class);

	/**
	 * 将XML转换为Object对象
	 * 
	 * @param xmlStr
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T xml2Object(String xmlStr, Class<T> clazz) {
		StringReader reader = new StringReader(xmlStr);
		Object object = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			object = jaxbUnmarshaller.unmarshal(reader);
		} catch (JAXBException e) {
			logger.error(xmlStr + "转为" + clazz.getName() + "对象失败！" + e);
		} finally {
			reader.close();
		}
		return (T) object;
	}

	/**
	 * 将对象转换为XML格式数据
	 * 
	 * @param object
	 * @return
	 */
	public static String Object2Xml(Object object) {
		StringWriter writer = new StringWriter();
		String xmlStr = "";
		try {
			JAXBContext jaxbContext = JAXBContext
					.newInstance(object.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
			jaxbMarshaller.marshal(object, writer);
		} catch (JAXBException e) {
			logger.error(object + "对象转为xml失败！" + e);
		} finally {
			xmlStr = writer.toString();
			try {
				writer.close();
			} catch (IOException e) {
				logger.error("关闭writer失败：" + e);
			}
		}
		return xmlStr;
	}
}
