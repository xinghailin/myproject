package com.yyq.car.portal.common.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONObject;
import org.springframework.stereotype.Service;


@Service
public class httpClientUtils {
	public final static String ACCESS_TOKEN_URL = "http://openapi.iqiyi.com/api/iqiyi/authorize?client_id=5de2a851aba444b184f6b95393940729&client_secret=a54f59019e208e11608a0c546e2a3bb1";

	// 获取视屏信息
	public final static String VIDEO_STATUS_URL = "http://openapi.iqiyi.com/api/file/fullStatus";

	// 得到HttpClient
	public static HttpClient getHttpClient() {
		HttpParams mHttpParams = new BasicHttpParams();
		// 设置网络链接超时
		// 即:Set the timeout in milliseconds until a connection is established.
		HttpConnectionParams.setConnectionTimeout(mHttpParams, 20 * 1000);
		// 设置socket响应超时
		// 即:in milliseconds which is the timeout for waiting for data.
		HttpConnectionParams.setSoTimeout(mHttpParams, 20 * 1000);
		// 设置socket缓存大小
		HttpConnectionParams.setSocketBufferSize(mHttpParams, 8 * 1024);
		// 设置是否可以重定向
		HttpClientParams.setRedirecting(mHttpParams, true);

		HttpClient httpClient = new DefaultHttpClient(mHttpParams);
		return httpClient;
	}

	// 得到JSONObject(Get方式)
	public static String getStringByGet(String url) {
		if ("".equals(url) || url == null) {
			return null;
		}
		HttpClient httpClient = httpClientUtils.getHttpClient();
		StringBuilder urlStringBuilder = new StringBuilder(url);
		StringBuilder entityStringBuilder = new StringBuilder();
		// 利用URL生成一个HttpGet请求
		HttpGet httpGet = new HttpGet(urlStringBuilder.toString());
		BufferedReader bufferedReader = null;
		HttpResponse httpResponse = null;
		try {
			// HttpClient发出一个HttpGet请求
			httpResponse = httpClient.execute(httpGet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 得到httpResponse的状态响应码
		int statusCode = httpResponse.getStatusLine().getStatusCode();
		if (statusCode == HttpStatus.SC_OK) {
			// 得到httpResponse的实体数据
			HttpEntity httpEntity = httpResponse.getEntity();
			if (httpEntity != null) {
				try {
					bufferedReader = new BufferedReader(new InputStreamReader(httpEntity.getContent(), "UTF-8"), 8 * 1024);
					String line = null;
					while ((line = bufferedReader.readLine()) != null) {
						entityStringBuilder.append(line + "/n");
					}
					// 利用从HttpEntity中得到的String生成JsonObject
					// resultJsonObject = new JSONObject(entityStringBuilder.toString());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return entityStringBuilder.toString();
	}

	// 得到JSONObject(Get方式)
	public static JSONObject getJSONObjectByGet(String url) {
		JSONObject resultJsonObject = null;
		if ("".equals(url) || url == null) {
			return null;
		}
		HttpClient httpClient = httpClientUtils.getHttpClient();
		StringBuilder urlStringBuilder = new StringBuilder(url);
		StringBuilder entityStringBuilder = new StringBuilder();
		// 利用URL生成一个HttpGet请求
		HttpGet httpGet = new HttpGet(urlStringBuilder.toString());
		BufferedReader bufferedReader = null;
		HttpResponse httpResponse = null;
		try {
			// HttpClient发出一个HttpGet请求
			httpResponse = httpClient.execute(httpGet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 得到httpResponse的状态响应码
		int statusCode = httpResponse.getStatusLine().getStatusCode();
		if (statusCode == HttpStatus.SC_OK) {
			// 得到httpResponse的实体数据
			HttpEntity httpEntity = httpResponse.getEntity();
			if (httpEntity != null) {
				try {
					bufferedReader = new BufferedReader(new InputStreamReader(httpEntity.getContent(), "UTF-8"), 8 * 1024);
					String line = null;
					while ((line = bufferedReader.readLine()) != null) {
						entityStringBuilder.append(line + "/n");
					}
					// System.out.println(entityStringBuilder.toString() + "==========");
					// 利用从HttpEntity中得到的String生成JsonObject
					resultJsonObject = new JSONObject(entityStringBuilder.toString());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return resultJsonObject;
	}

	public static JSONObject getCarVideoJSONObject(String accessToken, String fileId) {
		return httpClientUtils.getJSONObjectByGet(VIDEO_STATUS_URL + "?access_token=" + accessToken + "&file_id=" + fileId);
	}

	public static void main(String[] args) {
		System.err.println(getMp4UrlByFileId("4b448e3e2d0d4b7c8925522172c3bf7d"));
	}

	public static String getMp4UrlByFileId(String fileId) {
		/* 获取access_token */
		JSONObject jsonObject = httpClientUtils.getJSONObjectByGet(ACCESS_TOKEN_URL);
		JSONObject objs = jsonObject.getJSONObject("data");
		String access_token = objs.getString("access_token");
		/* 获取 MP4url,图片地址,状态码 */
		JSONObject data = httpClientUtils.getCarVideoJSONObject(access_token, fileId);
		JSONObject videoData = data.getJSONObject("data");
		// String imagePaht = String.valueOf((videoData.get("img"))); // 图片地址
		// String code = String.valueOf(data.get("code")); // 状态码

		String needAnalyzeUrl = ""; // 需要解析的MP4url

		JSONObject urllist = videoData.getJSONObject("urllist");
		if (urllist != null) {
			JSONObject m3u8 = urllist.getJSONObject("m3u8");
			if (m3u8 != null) {
				if (m3u8.has("1")) {
					needAnalyzeUrl = m3u8.getString("1");
				}
				if (m3u8.has("2")) {
					needAnalyzeUrl = m3u8.getString("2");
				}
			}

		}

		return needAnalyzeUrl;
	}

	public static String getVideoStatus(String fileId) {
		/* 获取access_token */
		JSONObject jsonObject = httpClientUtils.getJSONObjectByGet(ACCESS_TOKEN_URL);
		JSONObject objs = jsonObject.getJSONObject("data");
		String access_token = objs.getString("access_token");
		/* 获取 MP4url,图片地址,状态码 */
		JSONObject data = httpClientUtils.getCarVideoJSONObject(access_token, fileId);
		String code = String.valueOf(data.get("code"));				// 状态码
		return code;
	}

}