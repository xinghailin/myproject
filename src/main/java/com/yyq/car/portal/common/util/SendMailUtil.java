package com.yyq.car.portal.common.util;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.apache.commons.codec.binary.Base64;
/**
 * 用于邮件发送的一些功能调用
 * @author dell
 *
 */
public class SendMailUtil {

	/**
	 * 生成激活码
	 */
	public static String getMailRequestKey(String memberId,
			                               String mobile,
			                               String email,
			                               String messageId,
			                               String accountId){
		
//		String currentDate=StringUtil.getFormatDate("yyyyMMddHHmmss");//当前日期的字符串格式
		String currentDate=DateUtils.formateCurrent(DateUtils.COMPACT_DATETIME_FORMAT_SEC);
		int randomCode=StringUtil.generaryRandom(4);//四位随机数
		StringBuilder key = new StringBuilder();//激活码
		key.append(memberId)
		   .append("&")
		   .append(currentDate)
		   .append("&")
		   .append(String.valueOf(randomCode))
		   .append("&")
		   .append(mobile)
		   .append("&")
		   .append(email)
		   .append("&")
		   .append(messageId)
		   .append("&")
		   .append(accountId);
		String str=key.toString();
		byte[] encodeBase=Base64.encodeBase64(str.getBytes());
		String result="";
		try {
			result = new String(encodeBase,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;		
	}
	
	/**
	 * 解锁激活码
	 */
	public static String openKey(String key){
		if(key==null) return null;
		byte[] b=new byte[1024];
		try {
			b = Base64.decodeBase64(key.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return new String(b);
	}
	
}
