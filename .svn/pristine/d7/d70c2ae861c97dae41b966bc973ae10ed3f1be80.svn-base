/*******************************************************************************
 * Project   : notify
 * Class Name: com.natie.notify.provider.api.ICarrierSmsService
 * Created By: Jonathan 
 * Created on: 2013-8-16 上午10:36:13
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.service.sms.provider;

import java.util.List;

import com.yyq.car.portal.common.dto.SmsDeliveryResult;
import com.yyq.car.portal.common.dto.SmsStatusReport;


/**
 * <P>TODO</P>
 * @author Jonathan
 */
public interface ISmsProvider {

	/**
	 * <p>TODO</p>
	 * @param content
	 * @param mobile
	 * @author Jonathan
	 */
	List<SmsDeliveryResult> send(String content, List<String> mobile);

	/**
	 * <p>TODO</p>
	 * @param content
	 * @param mobile
	 * @author Jonathan
	 */
	SmsDeliveryResult send(String content, String mobile);

	List<SmsStatusReport> querySmsStatusReport();
}
