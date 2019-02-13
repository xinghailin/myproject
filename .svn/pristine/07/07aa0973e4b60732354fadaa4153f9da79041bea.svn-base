/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.service.CacheService
 * Created By: Jonathan 
 * Created on: 2014年11月25日 上午2:34:00
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.ufa.core.service.BaseService;

import com.yyq.car.portal.common.constant.CacheDataType;


/**
 * <P>缓存服务</P>
 * @author Jonathan
 */
@Service
public class EvictCacheService extends BaseService {

	@CacheEvict(value = CacheDataType.MASTER_DATA, allEntries = true)
	public void evictMasterData() {
	}

	@CacheEvict(value = CacheDataType.TAG, allEntries = true)
	public void evictTag() {
	}

	public void evictAll() {
		evictMasterData();
		evictTag();
	}
}
