package com.yyq.car.portal.common.dto;

import java.util.Map;

import com.lmax.disruptor.EventFactory;


/**
 * 
 * <P>发送短信</P>
 * @author lidongfu
 */
public class SmsEntry {

	public static final EventFactory<SmsEntry> FACTORY = new EventFactory<SmsEntry>() {
		public SmsEntry newInstance() {
			return new SmsEntry();
		}
	};

	public Map<String, String> parameters;
	public String mobileNo;
	public Integer templateId;
	public Integer bizObjectId;
	public long time;
}
