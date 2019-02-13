package com.yyq.car.portal.common.mapper.auth;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;
import org.ufa.security.model.UfaBaseResource;

import com.yyq.car.portal.common.dto.RoleResourceDTO;
import com.yyq.car.portal.common.model.auth.Resource;
import com.yyq.car.portal.common.model.auth.RoleAccount;

@UfaMapper
public interface ResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);

    List<Resource> selectByCriteria(Resource record, RowBounds rowBounds);

    List<Resource> selectByCriteria(Resource record);

    int countByCriteria(Resource record);
	/**
	 * <p>TODO</p>
	 * @param id
	 * @return
	 * @author Jonathan
	 */
	List<Resource> selectByRoleId(Integer id);

	/**
	 * <p>TODO</p>
	 * @param id
	 * @author Jonathan
	 */
	List<UfaBaseResource>  selectUfaBaseResourceByRoleId(@Param("roleId")Long id, @Param("appId")String appId);
	
	/**
	 * 根据角色ID集合批量查询对应资源
	 */
	List<RoleResourceDTO> batchSelectResourceById(Map<String, Object> paramMap);
	
	/**
	 * 根据角色ID集合批量查询对应资源的总记录数
	 */
	int batchCountResourceById(List<RoleAccount> roles);
	
	/**
	 * 验证是否有重复资源记录存在
	 */
	int checkIfExists(Resource resource);
}