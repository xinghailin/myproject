/*******************************************************************************
 * Project   : portal-back
 * Class Name: com.yyq.portal.back.constant.Constants
 * Created By: Jonathan 
 * Created on: 2014-6-24 下午2:53:02
 * Copyright © 2008-2014 NATIE All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.constant;

/**
 * <P>TODO</P>
 * @author lidongfu
 */
public class Constants {

	public static final String ACCOUNT_RESULT_FILE_PREFIX = "bank_account_result";
	public static final String ACCOUNT_RESULT_FILE_SUFIX = "txt";

	public static final String USER_PWD_SECRET_KEY = "sYVIi/BXfu6SWjc9PC/jlA==";// 用户密码秘钥
	public static final String USER_PWD_SECRET_IV = "sYVIi/BXfu6SWjc9";

	public static final String ACCOUNT_INFO = "accountInfo";

	public static final String USER_NICK_PREFIX = "yyq";

	public static final Integer SMS_SEND_STATUS_NO = 0; // 短信待发送状态 0.待发送
	public static final Integer SMS_SEND_STATUS_YES = 1; // 短信待发送状态 1.已发送

	public static final Integer SITE_MESSAGE_TYPE_INSTATION = 1;// site_message状态：1.系统消息 2.手机推送消息
																// 3.私信
	public static final Integer SITE_MESSAGE_TYPE_PHONE = 2;// site_message状态：1.系统消息 2.手机推送消息 3.私信
	public static final Integer SITE_MESSAGE_TYPE_PRIVATE = 3;// site_message状态：1.系统消息 2.手机推送消息 3.私信

	public static final String ORG_DEFAULT_PASSWORD = "123456";// 团体单位的默认登录密码

	public static final String LOCATION_TYPE_PROVINCE = "0"; // 省市区 0省
	public static final String LOCATION_TYPE_CITY = "1"; // 省市区 1市
	public static final String LOCATION_TYPE_DISTRICT = "2"; // 省市区 2区

	public static final String ORG_LIST = "org_list";// 认证组织
	public static final String MASTER_DATA_LIST = "master_data_list";// 基础数据
	public static final String MASTER_DATA_NO_SORT = "master_data_no_sort";// 基础数据 无排序
	public static final String DATA_LOCATION = "data_location";// 地区数据
	public static final String DATA_PROVINCE = "data_province";// 省份
	public static final String DATA_CITY = "data_city";// 城市
	public static final String DATA_DISTRICT = "data_district";// 区域
	public static final String DATA_BRAND = "data_brand";// 品牌数据

	public static final String RESOURCE_STATUS_Y = "1";// 资源状态 1.有效 2.无效
	public static final String RESOURCE_STATUS_N = "0";// 资源状态 1.有效 2.无效

	public static final String AUTHCODE_TYPE_REGISTER = "1";// 验证码类型 1.登录之前：注册
	public static final String AUTHCODE_TYPE_FIND_PASSWORD = "2";// 验证码类型 1.登录之前：找回密码
	public static final String AUTHCODE_TYPE_BIND_MOBILE = "3";// 验证码类型 1.登录之后：更改绑定手机
	public static final String AUTHCODE_TYPE_OTHER = "4";// 验证码类型 1.登录之后：其他

	public static final Integer SMS_TEMPLATE_REGISTER_VERIFY_CODE = 10; // 注册验证码模板ID
	public static final Integer SMS_TEMPLATE_FIND_PASSWORD = 11; // 找回密码短信模板ID
	public static final Integer SMS_TEMPLATE_REGISTER_COMPLETE = 12; // 注册完成短信模板ID
	public static final Integer SMS_TEMPLATE_BIND_MOBILE = 13; // 更改绑定手机短信模板ID

	public static final Integer AUTHCODE_STATUS_Y = 1;// 验证码状态 1.有效 0.无效
	public static final Integer AUTHCODE_STATUS_N = 0;// 验证码状态 1.有效 0.无效
	// 交易状态：0.失败，1.成功
	public static final Integer TRADE_STATUS_Y = 1;
	public static final Integer TRADE_STATUS_N = 0;
	// 邀请是否有效 0.无效，1.有效
	public static final Integer INVITE_VALID_Y = 1;
	public static final Integer INVITE_VALID_N = 0;
	// 0 其它地址 1 默认配送地址
	public static final Integer DELIVERY_ISDEFAULT_Y = 1;
	public static final Integer DELIVERY_ISDEFAULT_N = 0;

	public static final String TRADE_REMARK_EXPRIED = "ORDER_EXPRIED";

	public static final String LOCATION_PROVINCE = "1";// 省市列表类型：1.省或直辖市
	public static final String LOCATION_CITY = "2";// 省市列表类型：2.非直辖市或区

	public static final String MEMBER_GENDER_M = "M"; // 会员性别 M 男
	public static final String MEMBER_GENDER_F = "F"; // 会员性别 F 女

	public static final Integer EMAIL_USE_STATUS_N = 1; // 邮件使用状态 1.未使用 0.已使用
	public static final Integer EMAIL_USE_STATUS_Y = 0; // 邮件使用状态 1.未使用 0.已使用

	public static String EMAIL_SENDER = "dev@yiyouquan.cn";// 邮件服务器发送方地址

	public static String EMAIL_TEMPLATE_UPDATE_EMAIL = "mail/template.vm";// 模板：修改认证邮箱

	public static String EMAIL_TEMPLATE_GET_PWD = "mail/emailGetPwd.vm";// 模板：邮件找回密码

	public static final String ACTIVITY_END_DATE = "2014-12-24";

	public static final String DONATE_DAYS = "31";

	public static final Integer START_PAGE = 1;// 分页起始页
	public static final Integer PAGE_SIZE = 10; // 分页大小

	public static final int MEMBER_AVATAR_HEIGHT = 500;

	public static final int MEMBER_AVATAR_WEIGHT = 500;

	public static final int MEMBER_IS_VIP = 1;// 会员VIP状态 1:是

	public static final int MEMBER_IS_NOT_VIP = 0;// 会员VIP状态 0:否

	public static final int MEMBER_ALBUM_START = 1;

	public static final int MEMBER_ALBUM_END = 8;

	public static final String MEMBER_DEFAULT_PASSWORD = "123456";

	public static final int PROFILE_PHOTO_MAX_SIZE = 10000000;// 相册图片最大大小10M
	public static final int PROFILE_FILE_MAX_SIZE = 10000000;// 合同文件最大大小10M
	public static final int PROFILE_VIDEO_MAX_SIZE = 524288000;//视频大小不超过500M

	public static final Integer BIZ_IS_DEFAULT = 0;

	public static final Integer STATUS_SUCCESS = 1;
	public static final Integer STATUS_FAILURE = 0;

	public static final String _STATUS_SUCCESS = "1";
	public static final String _STATUS_FAILURE = "0";

	/* 头像状态 */

	/* 帐号状态 */
	public static final Integer ACCOUNT_STATE_FREEZE = 0;// 0冻结
	public static final Integer ACCOUNT_STATE_NORMAL = 1;// 1正常
	public static final Integer ACCOUNT_STATE_DELETE = 2;// 2删除

	// 用户角色
	public static final String ROLE_SYS_ADMIN = "ROLE_SYS_ADMIN";
	public static final String ROLE_MS_USER = "ROLE_MS_USER";

	public static final String ACCOUNT_FREEZE = "freeze";

	public static final String ACCOUNT_FREEZE_Y = "0";

	public static final String ACCOUNT_FREEZE_N = "1";

	public static final String DESIGNER = "1";// 设计师
	public static final String SUPPLIER = "2";// 供应商
	public static final String DEVELOPER = "3";// 开发商
	public static final String SALES_CONSULTANT = "4";// 销售顾问
	public static final Integer ACCOUNT_SOURCE_APP = 1;// 手机注册
	public static final Integer ACCOUNT_SOURCE_MS = 2;// 后台添加即黄页会员

	public static final String IS_YELLOW_PAGE_Y = "1";
	public static final String IS_YELLOW_PAGE_N = "0";

	public static final String ACCOUNTMEMBER_SOURCE_B = "1";// 用户注册类型 1B端 2C端
	public static final String ACCOUNTMEMBER_SOURCE_C = "2";// 用户注册类型 1B端 2C端
	/* 跳转产品添加页面 1:家具 2:灯具 3:饰品 4:布艺 5:地毯 6:生活用品 7:家电 */
	public static final int ALL_PRODUCT = 0; // 下载所有产品都可导入模板
	public static final int FURNITURE = 1;
	public static final int LAMPS = 2;
	public static final int DECORATE = 3;
	public static final int CLOTH = 4;
	public static final int CARPET = 5;
	public static final int DAILY_USE = 6;
	public static final int HOUSE_HOLD = 7;

	public static final Integer MSG_DIRECTION_BACK = 1;// 消息发送方向 后台1
	public static final Integer MSG_DIRECTION_FORE = 2;// 消息发送方向 前台2

	public static final Integer HOME = 1; // 样板房类型
	public static final Integer ROOM = 2; // 房间类型
	public static final Integer PRODUCT = 3; // 产品类型
	// 交易状态：1.客户2.运营人员3.系统后台定时任务批处理
	public static final String CANCEL_TYPE_CLIENT = "1";
	public static final String CANCEL_TYPE_INNER = "2";
	public static final String CANCEL_TYPE_SYS = "3";
	public static final String JD_URL = "http://sale.jd.com/m/act/QeEI8Pu6n3l5Uy.html?t=1458885137883";

	// 京东推荐 1 推荐 ，0不推荐
	public static final Integer JD_STATUS_Y = 1;
	public static final Integer JD_STATUS_N = 0;

	public static final String RECOMMEND_CLASS_PRODUCT = "1";// 推荐类型 1产品
	public static final String RECOMMEND_CLASS_ACTIVE = "2";// 推荐类型2活动

	public static final String VERSION_1 = "1";// 版本号1

	public static final String AUTH_STATUS_FAIL = "0";// 认证失败
	public static final String AUTH_STATUS_SUCCESS = "1";// 认证成功
	public static final String AUTH_STATUS_ING = "2";// 认证中
	public static final String AUTH_STATUS_BLANK = "3";// 未认证

}
