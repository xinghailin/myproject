package com.yyq.car.portal.common.util.alipay;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.multipart.FilePartSource;
import org.apache.commons.httpclient.methods.multipart.PartSource;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;


/* *
 *类名：AlipayFunction
 *功能：支付宝接口公用函数类
 *详细：该类是请求、通知返回两个文件所调用的公用函数核心处理文件，不需要修改
 *版本：3.3
 *日期：2012-08-14
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayCore {

	/** 
	 * 除去数组中的空值和签名参数
	 * @param sArray 签名参数组
	 * @return 去掉空值与签名参数后的新签名参数组
	 */
	public static Map<String, String> paraFilter(Map<String, String> sArray) {

		Map<String, String> result = new HashMap<String, String>();

		if (sArray == null || sArray.size() <= 0) {
			return result;
		}

		for (String key : sArray.keySet()) {
			String value = sArray.get(key);
			if (value == null || value.equals("") || key.equalsIgnoreCase("sign") || key.equalsIgnoreCase("sign_type")) {
				continue;
			}
			result.put(key, value);
		}

		return result;
	}

	/** 
	 * 把数组所有元素排序，并按照“参数=参数值”的模式用“&”字符拼接成字符串
	 * @param params 需要排序并参与字符拼接的参数组
	 * @return 拼接后字符串
	 */
	public static String createLinkString(Map<String, String> params) {

		List<String> keys = new ArrayList<String>(params.keySet());
		Collections.sort(keys);

		String prestr = "";

		for (int i = 0; i < keys.size(); i++) {
			String key = keys.get(i);
			String value = params.get(key);

			if (i == keys.size() - 1) {// 拼接时，不包括最后一个&字符
				prestr = prestr + key + "=" + value;
			} else {
				prestr = prestr + key + "=" + value + "&";
			}
		}

		return prestr;
	}

	// /**
	// * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	// * @param sWord 要写入日志里的文本内容
	// */
	// public static void logResult(String sWord) {
	// FileWriter writer = null;
	// try {
	// writer = new FileWriter(AlipayConfig.log_path + "alipay_log_" +
	// System.currentTimeMillis()+".txt");
	// writer.write(sWord);
	// } catch (Exception e) {
	// e.printStackTrace();
	// } finally {
	// if (writer != null) {
	// try {
	// writer.close();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	// }
	// }

	/** 
	 * 生成文件摘要
	 * @param strFilePath 文件路径
	 * @param file_digest_type 摘要算法
	 * @return 文件摘要结果
	 */
	public static String getAbstract(String strFilePath, String file_digest_type) throws IOException {
		PartSource file = new FilePartSource(new File(strFilePath));
		if (file_digest_type.equals("MD5")) {
			return DigestUtils.md5Hex(file.createInputStream());
		} else if (file_digest_type.equals("SHA")) {
			return DigestUtils.sha256Hex(file.createInputStream());
		} else {
			return "";
		}
	}

	/**
	 * 
	 * <p>post 请求</p>
	 * @param sPara
	 * @param gateway
	 * @return
	 * @throws Exception
	 * @author mjy
	 */
	public static String sendPostInfo(Map<String, String> sPara, String gateway) throws Exception {

		HttpProtocolHandler httpProtocolHandler = HttpProtocolHandler.getInstance();

		HttpRequest request = new HttpRequest(HttpResultType.BYTES);
		// 设置编码集
		request.setCharset(AlipayConfig.input_charset);

		request.setParameters(generatNameValuePair(sPara));
		request.setUrl(gateway + "_input_charset=" + AlipayConfig.input_charset);

		HttpResponse response = httpProtocolHandler.execute(request, "", "");
		if (response == null) {
			return null;
		}

		String strResult = response.getStringResult();
		return strResult;
	}

	private static NameValuePair[] generatNameValuePair(Map<String, String> properties) {
		NameValuePair[] nameValuePair = new NameValuePair[properties.size()];
		int i = 0;
		for (Map.Entry<String, String> entry : properties.entrySet()) {
			nameValuePair[i++] = new NameValuePair(entry.getKey(), entry.getValue());
		}

		return nameValuePair;
	}

	public static String getRequestToken(String text) throws Exception {
		String request_token = "";
		// 以“&”字符切割字符串
		String[] strSplitText = text.split("&");
		// 把切割后的字符串数组变成变量与数值组合的字典数组
		Map<String, String> paraText = new HashMap<String, String>();
		for (int i = 0; i < strSplitText.length; i++) {

			// 获得第一个=字符的位置
			int nPos = strSplitText[i].indexOf("=");
			// 获得字符串长度
			int nLen = strSplitText[i].length();
			// 获得变量名
			String strKey = strSplitText[i].substring(0, nPos);
			// 获得数值
			String strValue = strSplitText[i].substring(nPos + 1, nLen);
			// 放入MAP类中
			paraText.put(strKey, strValue);
		}

		if (paraText.get("res_data") != null) {
			String res_data = paraText.get("res_data");
			// 解析加密部分字符串（RSA与MD5区别仅此一句）
			// token从res_data中解析出来（也就是说res_data中已经包含token的内容）
			Document document = DocumentHelper.parseText(res_data);
			request_token = document.selectSingleNode("//direct_trade_create_res/request_token").getText();
		}
		return request_token;
	}

	/** 
	 * 把数组所有元素按照固定参数排序，以“参数=参数值”的模式用“&”字符拼接成字符串
	 * @param params 需要参与字符拼接的参数组
	 * @return 拼接后字符串
	 */
	public static String createLinkStringNoSort(Map<String, String> params) {

		// 手机网站支付MD5签名固定参数排序，顺序参照文档说明
		StringBuilder gotoSign_params = new StringBuilder();
		gotoSign_params.append("service=" + params.get("service"));
		gotoSign_params.append("&v=" + params.get("v"));
		gotoSign_params.append("&sec_id=" + params.get("sec_id"));
		gotoSign_params.append("&notify_data=" + params.get("notify_data"));

		return gotoSign_params.toString();
	}
}
