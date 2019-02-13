package com.yyq.car.portal.common.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import org.ufa.core.service.BaseService;

import com.yyq.car.portal.common.constant.CacheDataType;
import com.yyq.car.portal.common.constant.Constants;
import com.yyq.car.portal.common.constant.MasterDataType;
import com.yyq.car.portal.common.dto.MasterDataDTO;
import com.yyq.car.portal.common.mapper.comm.MasterDataMapper;
import com.yyq.car.portal.common.model.comm.MasterData;
import com.yyq.car.portal.common.util.CachFactory;
import com.yyq.car.portal.common.util.MasterDataComparator;


/**
 * <P>基础数据服务</P>
 * @author Jonathan
 */

// @Service
public class MasterDataService extends BaseService {
	@Autowired
	private MasterDataMapper masterDataMapper;

	/**
	 * <p>基础数据查询</p>
	 * @author lidongfu
	 */
	public void reflushMasterData() {
		// 基础数据类型
		MasterDataType[] ms = MasterDataType.values();
		Map<String, Object> pMap = new HashMap<String, Object>();
		// 无排序
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
	}

	/**
	 * <p>根据类型查询基础数据</p>
	 * @param type
	 * @return
	 * @author Jonathan
	 */
	@Cacheable(value = { CacheDataType.MASTER_DATA }, key = "#type")
	@Transactional(readOnly = true)
	public List<MasterDataDTO> queryByDataType(String type) {
		logger.debug("开始从数据库中查询基础数据,类型为:{}", type);
		List<MasterDataDTO> list = masterDataMapper.selectByDataType(type);
		logger.debug("返回基础数据:{}", list);
		return list;
	}

}
