package com.yyq.car.portal.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.yyq.car.portal.common.exception.PortalBizCheckedException;
import com.yyq.car.portal.common.web.constant.Constraints;


/**
 * 
 * <P> TODO 字符校验工具类</P>
 *
 * @author lidongfu_2005@sina.com
 * @date 2014-8-27 上午9:30:36
 */
public class ValidationUtils {

	/**
	 * 
	 * <p>TODO 手机号码校验</p>
	 * 
	 * @param str
	 * @return
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean isMobile(String mobiles) {
		Pattern p = Pattern.compile(Constraints.REGEXP_MOBILE_PHONE);
		Matcher m = p.matcher(mobiles);
		return m.matches();
	}

	/**
	 * 
	 * <p>TODO 验证网址Url</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean IsUrl(String str) {
		return match(Constraints.REGEXP_URL, str);
	}

	/**
	 * 
	 * <p>TODO 验证电话号码</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean IsTelephone(String str) {
		String regex = "^(//d{3,4}-)?//d{6,8}$";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO 验证输入密码条件(字符与数据同时出现)</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean IsPassword(String str) {
		String regex = "[A-Za-z]+[0-9]";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO  验证输入密码长度 (6-18位)</p>
	 * 
	 * @param  待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean IsPasswLength(String str) {
		String regex = "^//d{6,18}$";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO 验证输入邮政编号</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean IsPostalcode(String str) {
		String regex = "^//d{6}$";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO 验证输入手机号码</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean IsHandset(String str) {
		String regex = "^[1]+[3,5]+//d{9}$";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO 验证输入身份证号</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean IsIDcard(String str) {
		String regex = "(\\d{14}[0-9a-zA-Z])|(\\d{17}[0-9a-zA-Z])";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO 验证输入两位小数</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean IsDecimal(String str) {
		String regex = "^[0-9]+(.[0-9]{2})?$";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO 验证输入一年的12个月</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean IsMonth(String str) {
		String regex = "^(0?[[1-9]|1[0-2])$";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO 验证输入一个月的31天</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean IsDay(String str) {
		String regex = "^((0?[1-9])|((1|2)[0-9])|30|31)$";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO  验证日期时间</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合网址格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean isDate(String str) {
		String regex = "^((((1[6-9]|[2-9]//d)//d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]//d|3[01]))|(((1[6-9]|[2-9]//d)//d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]//d|30))|(((1[6-9]|[2-9]//d)//d{2})-0?2-(0?[1-9]|1//d|2[0-8]))|(((1[6-9]|[2-9]//d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-)) (20|21|22|23|[0-1]?//d):[0-5]?//d:[0-5]?//d$";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO  验证数字输入</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean IsNumber(String str) {
		String regex = "^[0-9]*$";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO 验证非零的正整数</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean IsIntNumber(String str) {
		String regex = "^//+?[1-9][0-9]*$";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO 验证大写字母</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean IsUpChar(String str) {
		String regex = "^[A-Z]+$";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO 验证小写字母</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean IsLowChar(String str) {
		String regex = "^[a-z]+$";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO  验证验证输入字母</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean IsLetter(String str) {
		String regex = "^[A-Za-z]+$";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO 验证验证输入汉字</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean IsChinese(String str) {
		String regex = "^[/u4e00-/u9fa5],{0,}$";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO </p>
	 * 
	 * @param str
	 * @return
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean isIP(String str) {
		String num = "(25[0-5]|2[0-4]//d|[0-1]//d{2}|[1-9]?//d)";
		String regex = "^" + num + "//." + num + "//." + num + "//." + num + "$";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO 验证邮箱</p>
	 * 
	 * @param 待验证的字符串
	 * @return 如果是符合的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean isEmail(String str) {
		String regex = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
		return match(regex, str);
	}

	public static boolean isName(String str) {
		String regex = "[\u4E00-\u9FA5]{2,4}";
		return match(regex, str);
	}

	/**
	 * 
	 * <p>TODO 电话号码验证</p>
	 * 
	 * @param str
	 * @return
	 * @author lidongfu_2005@sina.com
	 */
	public static boolean isPhone(String str) {
		Pattern p1 = null, p2 = null;
		Matcher m = null;
		boolean b = false;
		p1 = Pattern.compile("^[0][1-9]{2,3}-[0-9]{5,10}$"); // 验证带区号的
		p2 = Pattern.compile("^[1-9]{1}[0-9]{5,8}$"); // 验证没有区号的
		if (str.length() > 9) {
			m = p1.matcher(str);
			b = m.matches();
		} else {
			m = p2.matcher(str);
			b = m.matches();
		}
		return b;
	}

	/**
	 * 
	 * <p>TODO 正则表达式字符串  </p>
	 * 
	 * @param regex
	 * @param str
	 * @return
	 * @author lidongfu_2005@sina.com
	 */
	private static boolean match(String regex, String str) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}

	/**
	 * 
	 * <p>检测对象是否为空，空时报PortalBizCheckedException异常</p>
	 * @param object
	 * @param content
	 * @author wangzh
	 */
	public static void notNull(Object object, String content) {
		if (object == null) {
			throw new PortalBizCheckedException(content);
		}
	}

	public static void main(String[] args) {
		String str = "/^((1[1-5])|(2[1-3])|(3[1-7])|(4[1-6])|(5[0-4])|(6[1-5])|71|(8[12])|91)\\d{4}((19\\d{2}(0[13-9]|1[012])(0[1-9]|[12]\\d|30))|(19\\d{2}(0[13578]|1[02])31)|(19\\d{2}02(0[1-9]|1\\d|2[0-8]))|(19([13579][26]|[2468][048]|0[48])0229))\\d{3}(\\d|X|x)?$/";
		System.out.println(match(str, "422324198310146050"));
		System.out.println("身高" + IsDecimal("178"));
		System.out.println(isEmail("xiaoyuzhang@spex.com.cn"));
		System.out.println(isEmail("1042974462@qq.com"));
		System.out.println(isEmail("Yc.-it@d.com.cns"));
		System.out.println(match("^(.){1,25}$", "中国（海运）集团总公司团委集团总公司团委司团委团委司团委"));
		String regex = "[A-Za-z]+[0-9]";
		System.out.println("日期：" + match(Constraints.REGEXP_COMPATCT_DATE, "20141015"));
		System.out.println("密码强度：" + match(Constraints.REGEXP_PASSWORD, "20d2332342*&2432"));
	}

}
