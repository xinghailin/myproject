package com.yyq.car.portal.common.service.sms.provider.tecact;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import org.ufa.core.service.BaseService;

import com.google.common.collect.Lists;
import com.yyq.car.portal.common.constant.SmsStatus;
import com.yyq.car.portal.common.dto.SmsDeliveryResult;
import com.yyq.car.portal.common.dto.SmsStatusReport;
import com.yyq.car.portal.common.service.sms.provider.ISmsProvider;
import com.yyq.car.portal.common.util.DateUtils;
import com.yyq.car.portal.common.util.StringUtil;


/**
 * <p>柯塔短信调用接口 </p>
 * 
 * @author lidongfu_2005@sina.com
 * @date 2014年7月28日 下午4:26:31
 * 
 */
public class TecactSmsProvider extends BaseService implements ISmsProvider, InitializingBean {

	private String url;

	private String accountIdyx;

	private String passwordyx;

	private String accountIdyzm;

	private String passwordyzm;

	/**
	 * 参数错误
	 */

	final static int SUCCESS = 1;

	/**
	 * 参数错误
	 */
	final static int PARAM_ERROR = 0;
	/**
	 * 用户名密码错误
	 */
	final static int USER_PWD_ERROR = 2;
	/**
	 * 手机号码超过200个
	 */
	final static int MOBILE_TOTAL_OVER = 3;
	/**
	 * 余额不足
	 */
	final static int NSF = 6;
	/**
	 * 未加签名或者签名不正确
	 */
	final static int SIGN_ERROR = 7;

	/**
	 * 数据库访问失败
	 */
	final static int DB_ACCESS_ERROR = 5;

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("短信网关初始化开始");

	}

	/**
	 * <p>
	 * TODO 批量调用短信接口
	 * </p>
	 * 
	 * @param content
	 * @param mobiles
	 * @return SmsDeliveryResult
	 * @author lidongfu
	 */
	@Override
	public List<SmsDeliveryResult> send(String content, List<String> mobiles) {
		logger.info("开始调用短信接口:{}", mobiles.toArray());
		final HttpClient client = new HttpClient();
		final List<SmsDeliveryResult> resultList = new ArrayList<SmsDeliveryResult>();
		try {
			content = URLEncoder.encode(content, "utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
			logger.error("出现异常{}", e1);
		}
		// 每批次不能超过5个手机号码
		List<List<String>> mobileList = Lists.partition(mobiles, 5);
		for (final List<String> itemList : mobileList) {
			String mobileString = StringUtils.join(itemList, ",");
			String sendURL = url + "?op=sendsms&username=" + accountIdyx + "&password=" + passwordyx + "&taskid=" + getTaskId() + "&smsmes=" + content
					+ "&smsphone=" + mobileString;
			logger.info("短信接口请求地址[{}]", sendURL);
			GetMethod method = new GetMethod(sendURL);
			int statusCode = 0;
			InputStream ins = null;
			StringBuilder sb = new StringBuilder();
			try {
				statusCode = client.executeMethod(method);
				if (statusCode == HttpStatus.SC_OK) {
					ins = method.getResponseBodyAsStream();
					byte[] b = new byte[1024];
					int r_len = 0;
					while ((r_len = ins.read(b)) > 0) {
						sb.append(new String(b, 0, r_len, method.getResponseCharSet()));
					}
				} else {
					logger.error("调用短信接口失败{}", statusCode);
				}
			} catch (IOException e) {
				e.printStackTrace();
				logger.error("调用短信接口失败{}", e);
			}
			logger.info("调用短信接口成功[{}]", sb.toString());
			method.releaseConnection();
			String _strTmp = sb.toString();
			String[] retStr = _strTmp.split(",");
			SmsDeliveryResult result = stateConverter(Integer.parseInt(retStr[0]));
			resultList.add(result);
		}
		logger.info("调用短信接口完成");
		return resultList;
	}

	/**
	 * <p>
	 * TODO 调用短信接口
	 * </p>
	 * 
	 * @param content
	 * @param mobile
	 * @return SmsDeliveryResult
	 * @author lidongfu
	 */
	@Override
	public SmsDeliveryResult send(String content, String mobile) {
		logger.info("开始调用短信接口:{}", mobile);
		HttpClient client = new HttpClient();
		try {
			content = URLEncoder.encode(content, "utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
			logger.error("出现异常{}", e1);
		}
		String sendURL = url + "?op=sendsms&username=" + accountIdyzm + "&password=" + passwordyzm + "&taskid=" + getTaskId() + "&smsmes=" + content
				+ "&smsphone=" + mobile;
		logger.info("短信接口请求地址[{}]", sendURL);
		GetMethod method = new GetMethod(sendURL);
		int statusCode = 0;
		InputStream ins = null;
		StringBuilder sb = new StringBuilder();
		try {
			statusCode = client.executeMethod(method);
			if (statusCode == HttpStatus.SC_OK) {
				ins = method.getResponseBodyAsStream();
				byte[] b = new byte[1024];
				int r_len = 0;
				while ((r_len = ins.read(b)) > 0) {
					sb.append(new String(b, 0, r_len, method.getResponseCharSet()));
				}
			} else {
				logger.error("调用短信接口失败{}", statusCode);
			}
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("调用短信接口失败{}", e);
		}
		logger.info("调用短信接口成功[{}]", sb.toString());
		method.releaseConnection();
		String _strTmp = sb.toString();
		String[] retStr = _strTmp.split(",");
		SmsDeliveryResult result = stateConverter(Integer.parseInt(retStr[0]));
		return result;
	}

	/**
	 * <p>
	 * TODO 转换短信发送的返回结果
	 * </p>
	 * 
	 * @param resp
	 * @return
	 * @author lidongfu
	 */
	private SmsDeliveryResult stateConverter(int statusCode) {
		logger.info("转换短信发送的返回结果");
		SmsDeliveryResult result = new SmsDeliveryResult();
		if (statusCode == SUCCESS) {
			result.setStatus(SmsStatus.SUCCESS.getValue());
			result.setResultMessage("发送成功");
		} else if (statusCode == PARAM_ERROR) {
			result.setStatus(SmsStatus.FAILED.getValue());
			result.setResultMessage("参数不正确");
		} else if (statusCode == USER_PWD_ERROR) {
			result.setStatus(SmsStatus.FAILED.getValue());
			result.setResultMessage("用户名密码错误");
		} else if (statusCode == MOBILE_TOTAL_OVER) {
			result.setStatus(SmsStatus.FAILED.getValue());
			result.setResultMessage("手机号码不能超过200个");
		} else if (statusCode == DB_ACCESS_ERROR) {
			result.setStatus(SmsStatus.FAILED.getValue());
			result.setResultMessage("数据库访问失败");
		} else if (statusCode == NSF) {
			result.setStatus(SmsStatus.FAILED.getValue());
			result.setResultMessage("余额不足");
		} else if (statusCode == SIGN_ERROR) {
			result.setStatus(SmsStatus.FAILED.getValue());
			result.setResultMessage("未加签名或签名不正确");
		} else {
			result.setStatus(SmsStatus.FAILED.getValue());
			result.setResultMessage("无返回值,其他异常错误");
		}
		return result;
	}

	private String getTaskId() {
		String taskId = DateUtils.formateCurrent(DateUtils.COMPACT_DATETIME_FORMAT_SEC) + "_" + StringUtil.generaryRandom(6);
		return taskId;
	}

	public static void main(String[] args) {
		TecactSmsProvider tecact = new TecactSmsProvider();
		System.out.println("" + tecact.getTaskId());
		tecact.url = "http://www.tecact.com/smsinfo/smsinfo.aspx";
		tecact.accountIdyx = "yiyouquanyx";
		tecact.passwordyx = "123456";
		List<String> mobieList = new ArrayList();
		mobieList.add("18930409278");
		/*
		 * mobieList.add("13917559664"); mobieList.add("13917559661"); mobieList.add("13917559662");
		 * mobieList.add("13917559663"); mobieList.add("13917559665"); mobieList.add("13917559666");
		 * mobieList.add("13917559667"); mobieList.add("13917559668"); mobieList.add("13917559669");
		 * mobieList.add("23917559669");
		 */

		System.out.println("..................................." + tecact.stateConverter(Integer.parseInt("2")).getResultMessage());
		// List<SmsDeliveryResult> result =
		// tecact.send("您好，欢迎您注册益友圈。验证码：1111.  【益友圈】",
		// mobieList);
		// for(SmsDeliveryResult item:result)
		// System.out.println("::"+item.getResultMessage());
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAccountIdyx() {
		return accountIdyx;
	}

	public void setAccountIdyx(String accountIdyx) {
		this.accountIdyx = accountIdyx;
	}

	public String getPasswordyx() {
		return passwordyx;
	}

	public void setPasswordyx(String passwordyx) {
		this.passwordyx = passwordyx;
	}

	public String getAccountIdyzm() {
		return accountIdyzm;
	}

	public void setAccountIdyzm(String accountIdyzm) {
		this.accountIdyzm = accountIdyzm;
	}

	public String getPasswordyzm() {
		return passwordyzm;
	}

	public void setPasswordyzm(String passwordyzm) {
		this.passwordyzm = passwordyzm;
	}

	/*
	 * (non-Javadoc)
	 * @see com.yyq.cloud.portal.common.service.sms.provider.ISmsProvider#querySmsStatusReport()
	 * @author Jonathan
	 */
	@Override
	public List<SmsStatusReport> querySmsStatusReport() {
		// TODO Auto-generated method stub
		return null;
	}

}
