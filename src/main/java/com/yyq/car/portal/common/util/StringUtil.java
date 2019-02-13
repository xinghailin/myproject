package com.yyq.car.portal.common.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang.StringUtils;
import org.springframework.security.authentication.encoding.MessageDigestPasswordEncoder;
import org.ufa.log.Logger;
import org.ufa.log.LoggerFactory;

import com.yyq.car.portal.common.constant.Constants;


/**
 * 工具类
 * 
 * @author lidongfu
 * 
 */
public class StringUtil {

	protected final static Logger log = LoggerFactory.getLogger(StringUtil.class);

	/*	*//**
			* 获得当前格式化日期
			* 
			* @param format
			* @return
			*/
	/*
	 * public static String getFormatDate(String format) { SimpleDateFormat sdf = new
	 * SimpleDateFormat(format); String time = sdf.format(new Date()); return time; }
	 */
	/**
	 * 生成n位随机数
	 * 
	 * @return
	 */
	public static int generaryRandom(int n) {
		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Random rand = new Random();
		for (int i = 10; i > 1; i--) {
			int index = rand.nextInt(i);
			int tmp = array[index];
			array[index] = array[i - 1];
			array[i - 1] = tmp;
		}
		int result = 0;
		for (int i = 0; i < n; i++)
			result = result * 10 + array[i];
		return result;
	}

	/**
	 * 生成n长度0-9随机字符串
	 * 
	 * @return
	 */
	public static String generaryRandomStr(int n) {
		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Random rand = new Random();
		for (int i = 10; i > 1; i--) {
			int index = rand.nextInt(i);
			int tmp = array[index];
			array[index] = array[i - 1];
			array[i - 1] = tmp;
		}
		String result = "";
		for (int i = 0; i < n; i++)
			result = result + array[i];
		return result;
	}

	/**
	 * <P> 生成文件名</P>
	 *
	 * @author lidongfu_2005@sina.com
	 * @return
	 */
	public static String createFileName() {
		return DateUtils.formateCurrent(DateUtils.COMPACT_DATETIME_FORMAT_SEC) + generaryRandomStr(4);
	}

	/**
	 * 
	 * <p>6位随机名字</p>
	 * @return
	 * @author wangzh
	 */
	public static String createFileNameN() {
		return DateUtils.formateCurrent(DateUtils.COMPACT_DATETIME_FORMAT_SEC) + generaryRandomStr(6);
	}

	/**
	 * 读取文件内容
	 * 
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public static String readerFileContent(String fileName) {
		StringBuffer stringContent = new StringBuffer();
		try (FileInputStream fis = new FileInputStream(fileName);
				InputStreamReader isr = new InputStreamReader(fis, "GBK");
				BufferedReader br = new BufferedReader(isr)) {
			String line = null;
			while ((line = br.readLine()) != null) {
				if (StringUtils.isBlank(line))
					stringContent.append("\n");
				else
					stringContent.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
			log.error("读取文件出现异常" + e);
		}
		String _jsonContent = "[" + stringContent.toString() + "]";
		return _jsonContent;
	}

	/**
	 * <p>
	 * TODO 判断是否待解密文件
	 * </p>
	 * 
	 * @param filePathName
	 * @return
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean isDecryptFile(String filePathName) {
		if (filePathName.endsWith(".de")) {
			if (occurTimes(filePathName, ".de") > 1)// 去掉由于JOB异常中断导致生成的文件
				return false;
			return true;
		}
		return false;
	}

	/**
	 * <p>
	 * TODO 判断字符串str中包含e的个数
	 * </p>
	 * 
	 * @param str
	 * @param e
	 * @return
	 * @author lidongfu_2005@sina.com
	 */
	public static int occurTimes(String str, String e) {
		int pos = -2;
		int n = 0;
		while (pos != -1) {
			if (pos == -2) {
				pos = -1;
			}
			pos = str.indexOf(e, pos + 1);
			if (pos != -1) {
				n++;
			}
		}
		return n;
	}

	/**
	 * <p>TODO 创建初始化密码</p>
	 * @return
	 * @author lidongfu_2005@sina.com
	 * @throws Exception 
	 */
	public static String[] createInitPassword() {
		String password = Constants.MEMBER_DEFAULT_PASSWORD;
		String[] userPwds = new String[2];
		userPwds[0] = password;
		userPwds[1] = PasswordUtils.encryptPassword(password);
		return userPwds;
	}

	/**
	 * <P> 密码加密</P>
	 *  
	 * @author lidongfu_2005@sina.com
	 * @param planCode
	 * @return
	 */
	public static String encryptPassword(String planCode) {
		String password = PasswordUtils.encryptPassword(planCode);

		return password;
	}

	public static void main(String[] args) {

		System.out.println(PasswordUtils.encryptPassword("123456"));
		System.out.println(PasswordUtils.decryptPassord("Itj+3MbchNV2uqOgENvxfqH3UMIdOWClTiTjMif2goU="));
		String dd = new MessageDigestPasswordEncoder("MD5").encodePassword("123456", null);
		System.out.println(dd);
		Date dt = new Date();
		Long time = dt.getTime();
		System.out.println("time:" + time + "........................" + System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
	}
}
