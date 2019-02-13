package com.yyq.car.portal.common.dto;

import java.util.List;
import java.util.Map;

import com.lmax.disruptor.EventFactory;


/**
 * 
 * <P>群发送短信</P>
 * @author lidongfu
 */
public class FSmsEntry {

	public static final EventFactory<FSmsEntry> FACTORY = new EventFactory<FSmsEntry>() {
		public FSmsEntry newInstance() {
			return new FSmsEntry();
		}
	};

	public Map<String, Map<String, String>> mobileMap;
	public Integer templateId;
	public Integer bizObjectId;
	public long time;
	
	//以下参数用于无需模板的短信群发
	public List<String> mobileList;//手机号列表
	public String content;//短信内容
}
