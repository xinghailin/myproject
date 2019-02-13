package com.yyq.car.portal.common.util;


/**
 * 
 * <P>计算两地经纬度之间的距离</P>
 * 
 * @author lidongfu
 */
public class GeographUtil {
     
	public static double getDistatce(double lat1, double lat2, double lon1,
			double lon2) {
		
		double R = 6371;
		double distance = 0.0;
		double dLat = (lat2 - lat1) * Math.PI / 180;
		double dLon = (lon2 - lon1) * Math.PI / 180;
		double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
				+ Math.cos(lat1 * Math.PI / 180)
				* Math.cos(lat2 * Math.PI / 180) * Math.sin(dLon / 2)
				* Math.sin(dLon / 2);
		distance = (2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a))) * R;
		return distance;
	}
	
	
	public static void main(String[] args){
		Double d=new Double(1.0);
		System.out.println(GeographUtil.getDistatce(114.30313047851565,114.07035765136722,d.doubleValue(),d));
		System.out.println(GeographUtil.getDistatce(114.30313047851565,114.07035765136722,29.676716976164293,29.677611842370116));
	}
	
	
}
