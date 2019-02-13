/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.util.alipay.AlipayConstants
 * Created By: Jonathan 
 * Created on: 2014年11月18日 下午3:43:39
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.util.alipay;

/**
 * <P>支付宝支付状态</P>
 * @author Jonathan
 */
public interface AlipayConstants {

	/**
	 * 交易成功，且可对该交易做操作，如：多级分润、退款等
	 */
	final static String TRADE_SUCCESS = "TRADE_SUCCESS";

	/**
	 * 交易成功且结束，即不可再做任何操作
	 */
	final static String TRADE_FINISHED = "TRADE_FINISHED";

	/**
	 * 在指定时间段内未支付时关闭的交易, 在交易完成全额退款成功时关闭的交易。
	 */
	final static String TRADE_CLOSED = "TRADE_CLOSED";

	/**
	 * 交易创建，等待买家付款。
	 */
	final static String WAIT_BUYER_PAY = "WAIT_BUYER_PAY";

	/**
	 * 等待卖家收款（买家付款后，如果卖家账号被冻结）。
	 */
	final static String TRADE_PENDING = "TRADE_PENDING";
}
