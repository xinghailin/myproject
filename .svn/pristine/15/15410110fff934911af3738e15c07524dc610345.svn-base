package com.yyq.car.portal.common.web.initialization;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.yyq.car.portal.common.constant.Constants;
import com.yyq.car.portal.common.constant.MasterDataType;
import com.yyq.car.portal.common.mapper.comm.BrandMapper;
import com.yyq.car.portal.common.mapper.comm.LocationMapper;
import com.yyq.car.portal.common.mapper.comm.MasterDataMapper;
import com.yyq.car.portal.common.model.comm.Brand;
import com.yyq.car.portal.common.model.comm.Location;
import com.yyq.car.portal.common.model.comm.MasterData;
import com.yyq.car.portal.common.util.CachFactory;
import com.yyq.car.portal.common.util.MasterDataComparator;


/**
  * 
  *  <P> 加载所属组织数据  码表基础数据初始化</P>
  *  
  * @author lidongfu_2005@sina.com
  *  @date 2014年9月25日 上午11:54:52
 */
// @Component
public class InitializeDataProcessor// implements
// BeanPostProcessor
{

	@Autowired
	private MasterDataMapper masterDataMapper;

	@Autowired
	private LocationMapper locationMapper;

	@Autowired
	private BrandMapper brandMapper;

	public void initMethod() {
		// 码表基础数据初始化
		if (CachFactory.getInstance().get(Constants.MASTER_DATA_LIST) == null) {
			// 基础数据类型
			MasterDataType[] ms = MasterDataType.values();
			Map<String, Object> pMap = new HashMap<String, Object>();
			Map<String, Object> noSortMap = new HashMap<String, Object>();
			for (MasterDataType s : ms) {
				MasterData masterData = new MasterData();
				Map<String, Object> childMap = new HashMap<String, Object>();
				MasterDataComparator masterMap = new MasterDataComparator(childMap);
				masterData.setType(s.getValue());
				List<MasterData> typeList = masterDataMapper.selectByCriteria(masterData);
				for (MasterData m : typeList) {
					childMap.put(m.getCode(), m);
				}
				Map<String, Object> sortedMap = new TreeMap<String, Object>(masterMap);
				sortedMap.putAll(childMap);
				pMap.put(s.getValue(), sortedMap);
				noSortMap.put(s.getValue(), childMap);
			}
			CachFactory.getInstance().put(Constants.MASTER_DATA_LIST, pMap);
			CachFactory.getInstance().put(Constants.MASTER_DATA_NO_SORT, noSortMap);
			// 地区
			if (CachFactory.getInstance().get(Constants.DATA_LOCATION) == null) {
				Location location = new Location();
				List<Location> listLoc = locationMapper.selectByCriteria(location);
				CachFactory.getInstance().put(Constants.DATA_LOCATION, listLoc);
				// 省份
				location.setType(Constants.LOCATION_TYPE_PROVINCE);
				List<Location> listProvinceLoc = locationMapper.selectByCriteria(location);
				CachFactory.getInstance().put(Constants.DATA_PROVINCE, listProvinceLoc);
				// 城市
				location.setType(Constants.LOCATION_TYPE_CITY);
				List<Location> listCityLoc = locationMapper.selectByCriteria(location);
				CachFactory.getInstance().put(Constants.DATA_CITY, listCityLoc);
			}
			// 品牌
			if (CachFactory.getInstance().get(Constants.DATA_BRAND) == null) {
				Brand brand = new Brand();
				List<Brand> list = brandMapper.selectByCriteria(brand);
				CachFactory.getInstance().put(Constants.DATA_BRAND, list);
			}
		}
	}

	/**
	 * <p>刷新缓存</p>
	 * @author wangzh
	 */
	public void refreshcache() {
		CachFactory.getInstance().clear();
		initMethod();
	}

	// @Override
	// public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException
	// {
	// // 码表基础数据初始化
	// if (CachFactory.getInstance().get(Constants.MASTER_DATA_LIST) == null) {
	// // 基础数据类型
	// MasterDataType[] ms = MasterDataType.values();
	// Map<String, Object> pMap = new HashMap<String, Object>();
	// Map<String, Object> noSortMap = new HashMap<String, Object>();
	// for (MasterDataType s : ms) {
	// MasterData masterData = new MasterData();
	// Map<String, Object> childMap = new HashMap<String, Object>();
	// MasterDataComparator masterMap = new MasterDataComparator(childMap);
	// masterData.setType(s.getValue());
	// List<MasterData> typeList = masterDataMapper.selectByCriteria(masterData);
	// for (MasterData m : typeList) {
	// childMap.put(m.getCode(), m);
	// }
	// Map<String, Object> sortedMap = new TreeMap<String, Object>(masterMap);
	// sortedMap.putAll(childMap);
	// pMap.put(s.getValue(), sortedMap);
	// noSortMap.put(s.getValue(), childMap);
	// }
	// CachFactory.getInstance().put(Constants.MASTER_DATA_LIST, pMap);
	// CachFactory.getInstance().put(Constants.MASTER_DATA_NO_SORT, noSortMap);
	// }
	// return arg0;
	// }
	//
	// @Override
	// public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException
	// {
	// return arg0;
	// }

	/*
	 * (non-Javadoc)
	 * @see
	 * org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework
	 * .context.ApplicationContext)
	 * @author wangzh
	 */
}
