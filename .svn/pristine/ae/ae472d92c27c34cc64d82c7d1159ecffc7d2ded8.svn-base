package com.yyq.car.portal.common.util;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

//import net.sf.json.JSONObject;



import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.ufa.log.Logger;
import org.ufa.log.LoggerFactory;

import com.yyq.car.portal.common.exception.PortalAppCheckedException;


/**
 * <P>TODO</P>
 * @author Jonathan
 */
public class HttpClientUtil {
	private static final String DEFAULT_CHARSET = "UTF-8";
	private static Logger logger = LoggerFactory.getLogger(HttpClientUtil.class);

	/**
	 * <p>通过HTTP POST提交文件</p>
	 * @param url
	 * @param params
	 * @param fileName
	 * @param file
	 * @param charSet
	 * @return 返回response串
	 * @throws PortalAppCheckedException
	 * @author Jonathan
	 */
	public static String postFiles(String url, Map<String, String> params, String fileName, File file, String charSet) throws PortalAppCheckedException {
		logger.debug("Enter HttpClientUtil.postFiles");
		logger.debug("输出参数params:{},fileNames:{},charSet:{},url:{}", new Object[] { params.toString(), file.getName(), charSet, url });
		String result = null;
		charSet = (charSet == null ? DEFAULT_CHARSET : charSet);
		try {
			DefaultHttpClient httpclient = new DefaultHttpClient();
			if (StringUtils.containsIgnoreCase(url, "https")) {
				initializeSecurityContext(url, httpclient);
			}
			HttpPost httPost = new HttpPost(url);
			MultipartEntity entity = new MultipartEntity();
			Set<String> keySet = params.keySet();
			for (String key : keySet) {
				entity.addPart(key, new StringBody(params.get(key)));
			}

			entity.addPart(fileName, new FileBody(file));

			httPost.setEntity(entity);
			HttpResponse response = httpclient.execute(httPost);

			result = EntityUtils.toString(response.getEntity(), charSet);

			httpclient.getConnectionManager().shutdown();

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new PortalAppCheckedException("code", null, "字符编码格式不支持");
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			throw new PortalAppCheckedException("code", null, "发送http报文时协议错误");
		} catch (IOException e) {
			e.printStackTrace();
			throw new PortalAppCheckedException("code", null, "发送http报文时，IO异常");
		}
		logger.debug("Exit HttpClientUtil.postFiles, return value:{}", result);
		return result;
	}

	/**
	 * <p>通过HTTP POST提交文件</p>
	 * @param url
	 * @param params
	 * @param files
	 * @return 返回response串
	 * @throws PortalAppCheckedException
	 * @author Jonathan
	 */
	public static String postFiles(String url, Map<String, String> params, Map<String, File> files) throws PortalAppCheckedException {
		return postFiles(url, params, files, DEFAULT_CHARSET);
	}

	/**
	 * <p>通过HTTP POST提交文件</p>
	 * @param url
	 * @param params
	 * @param fileNames
	 * @param charSet
	 * @return 返回response串
	 * @author Jonathan
	 * @throws PortalAppCheckedException 
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public static String postFiles(String url, Map<String, String> params, Map<String, File> files, String charSet) throws PortalAppCheckedException {
		logger.debug("Enter HttpClientUtil.postFiles");
		logger.debug("输出参数params:{},fileNames:{},charSet:{},url:{}", new Object[] { params.toString(), files.toString(), charSet, url });
		String result = null;
		charSet = (charSet == null ? DEFAULT_CHARSET : charSet);
		try {
			DefaultHttpClient httpclient = new DefaultHttpClient();
			if (StringUtils.containsIgnoreCase(url, "https")) {
				initializeSecurityContext(url, httpclient);
			}
			HttpPost httPost = new HttpPost(url);
			MultipartEntity entity = new MultipartEntity();
			Set<String> keySet = params.keySet();
			for (String key : keySet) {
				entity.addPart(key, new StringBody(params.get(key)));
			}
			keySet = files.keySet();
			for (String key : keySet) {
				entity.addPart(key, new FileBody(files.get(key)));
			}
			httPost.setEntity(entity);

			if (StringUtils.containsIgnoreCase(url, "https")) {
				initializeSecurityContext(url, httpclient);
			}

			HttpResponse response = httpclient.execute(httPost);

			result = EntityUtils.toString(response.getEntity(), charSet);

			httpclient.getConnectionManager().shutdown();

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new PortalAppCheckedException("code", null, "字符编码格式不支持");
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			throw new PortalAppCheckedException("code", null, "发送http报文时协议错误");
		} catch (IOException e) {
			e.printStackTrace();
			throw new PortalAppCheckedException("code", null, "发送http报文时，IO异常");
		}
		logger.debug("Exit HttpClientUtil.postFiles, return value:{}", result);
		return result;
	}

	/**
	 * <p>使用HTTP POST方法向指定URL提交数据</p>
	 * @param url
	 * @param params
	 * @return
	 * @throws PortalAppCheckedException
	 * @author Jonathan
	 */
	public static String post(String url, Map<String, String> params) throws PortalAppCheckedException {
		return post(url, params, DEFAULT_CHARSET);
	}

	/**
	 * <p>使用HTTP POST方法向指定URL提交数据</p>
	 * @param url HTTP POST的提交地址
	 * @param params 通过POST提交的参数
	 * @param charSet 使用的字符集，默认为UTF-8
	 * @return 字符串
	 * @author Jonathan
	 * @throws PortalAppCheckedException 
	 */
	public static String post(String url, Map<String, String> params, String charSet) throws PortalAppCheckedException {
		logger.debug("Enter HttpClientUtil.post");
		logger.debug("输出参数params:{},charSet:{},url:{}", new Object[] { params.toString(), charSet, url });
		String responseStr = null;
		try {
			// 设定默认字符集为UTF-8
			charSet = (charSet == null ? DEFAULT_CHARSET : charSet);

			DefaultHttpClient httpclient = new DefaultHttpClient();
			// 创建HttpPost对象
			HttpPost post = createHttpPost(url, params, charSet);

			if (StringUtils.containsIgnoreCase(url, "https")) {
				initializeSecurityContext(url, httpclient);
			}
			// 提交post请求
			HttpResponse httpResponse = httpclient.execute(post);

			// 解析请求
			responseStr = parseResponse(httpResponse, charSet);
			httpclient.getConnectionManager().shutdown();

		} catch (ClientProtocolException e) {
			e.printStackTrace();
			throw new PortalAppCheckedException("code", null, "发送http报文时协议错误");
		} catch (IOException e) {
			e.printStackTrace();
			throw new PortalAppCheckedException("code", null, "发送http报文时，IO异常");
		}
		logger.debug("Exit HttpClientUtil.post, return value:{}", responseStr);
		return responseStr;
	}

	/**
	 * <p>为https初始化security context</p>
	 * @param url
	 * @param httpclient
	 * @throws NoSuchAlgorithmException
	 * @throws KeyManagementException
	 * @author Jonathan
	 * @throws PortalAppCheckedException 
	 */
	private static void initializeSecurityContext(String url, DefaultHttpClient httpclient) throws PortalAppCheckedException {
		SSLContext ctx;
		try {
			ctx = SSLContext.getInstance("SSL");
			X509TrustManager tm = new X509TrustManager() {
				public void checkClientTrusted(X509Certificate[] xcs, String string) throws CertificateException {
				}

				public void checkServerTrusted(X509Certificate[] xcs, String string) throws CertificateException {
				}

				public X509Certificate[] getAcceptedIssuers() {
					return null;
				}
			};
			ctx.init(null, new TrustManager[] { tm }, null);
			SSLSocketFactory ssf = new SSLSocketFactory(ctx, SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
			HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
			ClientConnectionManager ccm = httpclient.getConnectionManager();
			SchemeRegistry sr = ccm.getSchemeRegistry();
			Integer port = extractPort(url);
			sr.register(new Scheme("https", port, ssf));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new PortalAppCheckedException("NO_SUCH_ALGORITHM_EXCEPTION", null, "建立SSL时，算法不支持");
		} catch (KeyManagementException e) {
			e.printStackTrace();
			throw new PortalAppCheckedException("KEY_MANAGEMENT_EXCEPTION", null, "建立SSL时，初始化context异常");
		}

	}

	public static String get(String url) throws PortalAppCheckedException {
		return get(url, DEFAULT_CHARSET);
	}

	/**
	 * <p>使用HTTP GET方从指定URL获取数据</p>
	 * @param url
	 * @param charSet
	 * @return 返回字符串
	 * @author Jonathan
	 * @throws PortalAppCheckedException 
	 */
	public static String get(String url, String charSet) throws PortalAppCheckedException {
		logger.debug("Enter HttpClientUtil.get");
		logger.debug("输出参数charSet:{},url:{}", new Object[] { url, charSet });
		String responseStr = null;
		charSet = (charSet == null ? DEFAULT_CHARSET : charSet);
		try {
			DefaultHttpClient httpclient = new DefaultHttpClient();
			HttpGet get = new HttpGet(url);
			HttpResponse httpResponse = httpclient.execute(get);
			responseStr = parseResponse(httpResponse, charSet);
			httpclient.getConnectionManager().shutdown();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			throw new PortalAppCheckedException("REMOTE_INVOKING_EXCEPTION", null, "发送http报文时协议错误");
		} catch (IOException e) {
			e.printStackTrace();
			throw new PortalAppCheckedException("IO_EXCEPTION", null, "发送http报文时，IO异常");
		}
		logger.debug("Exit HttpClientUtil.get, return value:{}", responseStr);
		return responseStr;
	}

	/**
	 * <p>创建HttpPost对象</p>
	 * @param url
	 * @param params
	 * @param charSet
	 * @return 返回HttpPost对象
	 * @author Jonathan
	 * @throws PortalAppCheckedException 
	 */
	private static HttpPost createHttpPost(String url, Map<String, String> params, String charSet) throws PortalAppCheckedException {
		charSet = (charSet == null ? DEFAULT_CHARSET : charSet);
		HttpPost httpost = new HttpPost(url);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		Set<String> keySet = params.keySet();
		for (String key : keySet) {
			nvps.add(new BasicNameValuePair(key, params.get(key)));
		}

		try {
			httpost.setEntity(new UrlEncodedFormEntity(nvps, charSet));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new PortalAppCheckedException("UNSUPPORTED_ENCODING_EXCEPTION", null, "字符编码格式不支持");
		}

		return httpost;
	}

	/**
	 * <p>解析HttpResponse</p>
	 * @param response
	 * @param charSet
	 * @return response字符串
	 * @author Jonathan
	 * @throws PortalAppCheckedException 
	 */
	private static String parseResponse(HttpResponse response, String charSet) throws PortalAppCheckedException {
		if (response == null) {
			return null;
		}
		charSet = (charSet == null ? DEFAULT_CHARSET : charSet);
		HttpEntity entity = response.getEntity();
		logger.debug("response status：{}" + response.getStatusLine());
		logger.debug("entity default charset:", ContentType.getOrDefault(entity).getCharset().name());
		String body = null;
		try {

			body = EntityUtils.toString(entity, charSet);

		} catch (ParseException e) {
			e.printStackTrace();
			throw new PortalAppCheckedException("REMOTE_RESPONSE_PARSE_EXCEPTION", null, "解析response出错");
		} catch (IOException e) {
			e.printStackTrace();
			throw new PortalAppCheckedException("IO_EXCEPTION", null, "发送http报文时，IO异常");
		}

		return body;
	}

	private static Integer extractPort(String url) {
		String re = "(([^:/?#]+)://)([^:^/]*)?(:)?(\\d*)?(.*)?";
		Matcher matcher = Pattern.compile(re, Pattern.CASE_INSENSITIVE).matcher(url);
		matcher.find();
		String protocol = matcher.group(2);
		String domain = matcher.group(3);
		String port = matcher.group(5);
		if (StringUtils.isEmpty(port)) {
			switch (protocol) {
				case "http":
					port = "80";
					break;
				case "https":
					port = "443";
					break;
				case "ftp":
					port = "21";
					break;
			}
		}
		return Integer.valueOf(port);
	}

	public static void main(String[] args) {
		String sessionId = "BBmnENquxoYMF7EbuzKG7GdfnIA=";
		String accountId = "23988";
		Map map = new HashMap<String, String>();
//		map.put("sessionId", sessionId);
//		map.put("accountId", accountId);
//		map.put("type", "1");
//		map.put("otherAccountId", "20117");
//		map.put("content", "我想看看天上的月亮什么时候的园");
		// map.put("city", "2");
		// map.put("address", "测试");
		// map.put("postalNo", "200000");
		// map.put("receiverName", "测试");
		// map.put("mobile", "13771017809");
		// map.put("tele", "021-12345678");
		// map.put("isDefault", "1");

		// map.put("content", "好冷啊");
		// map.put("topicId", "1");
		// map.put("type", "1");
		// File file = new File("d:/login_new.jpg");
		// Map files = new HashMap<String, File>();
		// files.put("image", file);
		// files.put("albumPhotoFile", file);

//		String result = HttpClientUtil.post("http://test.yiyouquan.com:20001/account/member/update/add", map);
		String result = HttpClientUtil.post("http://192.168.205.18:801/cloud-app-back/unsecured/login?loginName=13046631167&password=111111", map);
		System.out.println("登录消息："+result); 
//		JSONObject jsonObj = JSONObject.fromObject(result);
//		JSONObject  response = jsonObj.getJSONObject("result") ;
//		String sessionIds = response.getString("sessionId") ;
//		String accountIds =  response.getString("accountId") ;
//		String url = "http://192.168.205.18:801/cloud-app-back/business/list/recommend?sessionId="+sessionIds+"&accountId="+accountIds ;
//		System.out.println("URL地址为："+url);
//		String result1 = HttpClientUtil.get(url);
//		System.out.println("获取数据："+result1);
	}
}
