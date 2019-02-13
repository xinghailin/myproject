package com.yyq.car.portal.common.mapper.auth;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.auth.Menu;
import com.yyq.car.portal.common.model.auth.RoleAccount;


@UfaMapper
public interface RoleAccountMapper {
	int deleteByPrimaryKey(RoleAccount key);

	int insert(RoleAccount record);

	int insertSelective(RoleAccount record);

	List<RoleAccount> selectByCriteria(RoleAccount record, RowBounds rowBounds);

	List<RoleAccount> selectByCriteria(RoleAccount record);

	int countByCriteria(RoleAccount record);

	// 账号ID删除该账号绑定的角色
	int deleteRoleByAccountId(Integer accountId);

	int insertRoleAccount(@Param("roleId") Integer roleId, @Param("accountId") Integer accountId);

	/**
	 * 
	 * <P> 根据用户ID获取该用户的菜单  </P>
	 * 
	 * @author lidongfu_2005@sina.com
	 * @param userId
	 * @return
	 */
	List<Menu> selectMenuByUserId(@Param("userId") Integer userId);

	List<RoleAccount> queryRoleIdByloginId(Integer accountId);

}