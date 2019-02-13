/*******************************************************************************
 * Project   : cloud-portal-common
 * Class Name: com.yyq.cloud.portal.common.service.GetLongitudeLatitudeService
 * Created By: wangzh 
 * Created on: 2015年6月5日 下午4:38:17
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


/**
 * <P>TODO</P>
 * @author wangzh
 * 密钥:f247cdb592eb43ebac6ccd27f796e2d2
 */
// @Service
public class GetLongitudeLatitudeService {

	/** 
	* @param addr 
	* 查询的地址 
	* @return 
	* @throws IOException 
	*/
	public Object[] getCoordinate(String addr) throws Exception {
		String lng = null;// 经度
		String lat = null;// 纬度
		String address = null;
		try {
			address = java.net.URLEncoder.encode(addr, "UTF-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		String key = "f247cdb592eb43ebac6ccd27f796e2d2";
		String url = String.format("http://api.map.baidu.com/geocoder?address=%s&output=json&key=%s", address, key);
		URL myURL = null;
		URLConnection httpsConn = null;
		try {
			myURL = new URL(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		InputStreamReader insr = null;
		BufferedReader br = null;
		try {
			httpsConn = (URLConnection) myURL.openConnection();// 不使用代理
			if (httpsConn != null) {
				insr = new InputStreamReader(httpsConn.getInputStream(), "UTF-8");
				br = new BufferedReader(insr);
				String data = null;
				int count = 1;
				while ((data = br.readLine()) != null) {
					if (count == 5) {
						// System.out.println(data);
						lng = (String) data.subSequence(data.indexOf(":") + 1, data.indexOf(","));// 经度
						count++;
					} else if (count == 6) {
						lat = data.substring(data.indexOf(":") + 1);// 纬度
						count++;
					} else {
						count++;
					}
				}
			}
		} finally {
			if (insr != null) {
				insr.close();
			}
			if (br != null) {
				br.close();
			}
		}
		return new Object[] { lng, lat };
	}

	public static void main(String[] args) throws IOException {
		GetLongitudeLatitudeService getLatAndLngByBaidu = new GetLongitudeLatitudeService();
		Object[] o = null;
		try {
			o = getLatAndLngByBaidu.getCoordinate("静安区南京西路1515号静安嘉里中心S4-s,單元");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(o[0]);// 经度
		System.out.println(o[1]);// 纬度
	}

	/*
	 * 输出结果： 121.424363 31.175942
	 */
}
