/*******************************************************************************
 * Project   : portal-ms
 * Class Name: com.yyq.portal.ms.app.service.ResourceService
 * Created By: Jonathan 
 * Created on: 2014-6-17 下午2:40:15
 * Copyright © 2008-2014 NATIE All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.service.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ufa.security.model.UfaBaseResource;
import org.ufa.security.service.api.IResourceService;

import com.yyq.car.portal.common.mapper.auth.ResourceMapper;
import com.yyq.car.portal.common.model.auth.Resource;
import com.yyq.car.portal.common.util.RowBoundsUtils;


/**
 * <P>资源服务类</P>
 * @author Jonathan
 */
@Service
public class ResourceService implements IResourceService{

	@Autowired
	private ResourceMapper resourceMapper;

	/**
	 * <p>新增资源</p>
	 * @param resource
	 * @return
	 * @author Jonathan
	 */
	public int add(Resource resource) {
		return resourceMapper.insert(resource);
	}

	/**
	 * <p>分页查询资源信息</p>
	 * @param resource
	 * @param start
	 * @param end
	 * @return
	 * @author Jonathan
	 */
	public List<Resource> queryByCriteria(Resource resource, int start, int end) {
		return resourceMapper.selectByCriteria(resource, RowBoundsUtils.getRowBounds(start, end));
	}

	/**
	 * <p>按条件统计资源总数</p>
	 * @param resource
	 * @return
	 * @author Jonathan
	 */
	public Integer countByCriteria(Resource resource) {
		return resourceMapper.countByCriteria(resource);
	}
	
	
	/**
	 * <p>根据ID删除资源</p>
	 * @param id
	 * @return
	 * @author Jonathan
	 */
	public Integer delete(Integer id){
		return resourceMapper.deleteByPrimaryKey(id);
	}

	/**
	 * <p>根据主键查询资源信息</p>
	 * @param id
	 * @return
	 * @author Jonathan
	 */
	public Resource query(Integer id) {
		return resourceMapper.selectByPrimaryKey(id);
	}

	/**
	 * <p>更新资源信息</p>
	 * @param resource
	 * @return
	 * @author Jonathan
	 */
	public int update(Resource resource) {
		return resourceMapper.updateByPrimaryKeySelective(resource);
	}

	/**
	 * <p>查询角色所属的资源</p>
	 * @param id
	 * @return
	 * @author Jonathan
	 */
	public List<Resource> queryByRoleId(Integer id) {
		return resourceMapper.selectByRoleId(id);
	}

	/**
	 * <p>查询资源信息</p>
	 * @param resource
	 * @return
	 * @author Jonathan
	 */
	public List<Resource> queryByCriteria(Resource resource) {
		return resourceMapper.selectByCriteria(resource);
	}

	/* (non-Javadoc)
	 * @see org.ufa.security.service.api.IResourceService#findByRoleID(java.lang.Long)
	 * @author Jonathan
	 */
	@Override
	public List<? extends UfaBaseResource> findByRoleID(Long id, String appId) {
		return resourceMapper.selectUfaBaseResourceByRoleId(id, appId);
	}
	
	/**
	 * 验证资源名称和URI是否重复
	 */
	public int checkResourceNameOrUriIFExists(Resource resource){
		return resourceMapper.checkIfExists(resource);
	}

}
