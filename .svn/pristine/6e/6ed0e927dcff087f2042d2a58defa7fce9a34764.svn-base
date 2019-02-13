package com.yyq.car.portal.common.util;

import java.util.HashMap;
import java.util.Map;


/**
 * 
  *  <P> 静态缓存</P>
  *
  * @author lidongfu_2005@sina.com
  *  @date 2014年9月25日 下午1:34:52
 */
public class CachFactory {

	private static CachFactory cachFactory = new CachFactory();

	private Map<String, Object> factoryMap = new HashMap<String, Object>();

	private CachFactory() {

	}

	public static CachFactory getInstance() {
		return cachFactory;
		// return CachInnerClass.instance;
	}

	/**
	 * 
	  *  <P> 使用静态内部类 只在第一次被引用时加载</P>
	  *
	  * @author lidongfu_2005@sina.com
	  *  @date 2014年9月25日 下午1:37:34
	 */
	// static class CachInnerClass {
	// private static CachFactory instance = new CachFactory();
	// }

	/**
	 * <P> 将对象数据放入缓存</P>
	 *
	 * @author lidongfu_2005@sina.com
	 * @param key
	 * @param value
	 */
	public void put(String key, Object value) {
		factoryMap.put(key, value);
	}

	/**
	 * <P>  判断是否存在key为cachName的map</P>
	 *
	 * @author lidongfu_2005@sina.com
	 * @param cachName
	 * @return
	 */
	public boolean isExist(String key) {
		if (factoryMap.containsKey(key)) {
			return true;
		}
		return false;
	}

	/**
	 * <P> 获取key的对象 </P>
	 *
	 * @author lidongfu_2005@sina.com
	 * @param key
	 * @return
	 */
	public Object get(String key) {
		if (factoryMap.containsKey(key)) {
			return factoryMap.get(key);
		}
		return null;
	}

	/**
	 * <p>清空</p>
	 * @author wangzh
	 */
	public void clear() {
		factoryMap.clear();
	}
}
