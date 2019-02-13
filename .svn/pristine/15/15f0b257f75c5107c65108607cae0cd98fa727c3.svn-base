package com.yyq.car.portal.common.util;

import java.util.Comparator;
import java.util.Map;

import com.yyq.car.portal.common.model.comm.MasterData;


/**
  * 
  *  <P> 基础数据排序</P>
  *
  * @author lidongfu_2005@sina.com
  *  @date 2014年9月29日 下午4:09:13
 */
public class MasterDataComparator implements Comparator<String> {
	Map<String, Object> mdMap;

	public MasterDataComparator(Map<String, Object> mdMap) {
		this.mdMap = mdMap;
	}

	public int compare(String key1, String key2) {
		MasterData mdObj1 = (MasterData) mdMap.get(key1);
		MasterData mdObj2 = (MasterData) mdMap.get(key2);
		if (mdObj1.getSortNum() != null && mdObj2.getSortNum() != null) {
			// 根据sortNum升序排列
			return mdObj1.getSortNum().intValue() - mdObj2.getSortNum().intValue();
		} else {
			return 0;
		}
	}

}
