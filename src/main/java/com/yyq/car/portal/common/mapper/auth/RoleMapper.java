package com.yyq.car.portal.common.mapper.auth;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;
import org.ufa.security.model.UfaBaseRole;

import com.yyq.car.portal.common.model.auth.Menu;
import com.yyq.car.portal.common.model.auth.Role;


@UfaMapper
public interface RoleMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Role record);

	int insertSelective(Role record);

	Role selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Role record);

	int updateByPrimaryKey(Role record);

	List<Role> selectByCriteria(Role record, RowBounds rowBounds);

	List<Role> selectByCriteria(Role record);

	int countByCriteria(Role record);

	/**
	 * <p>删除该角色的所有资源权限</p>
	 * @param role
	 * @author Jonathan
	 */
	void deleteResourceByRoleId(Integer role);

	/**
	 * <p>为角色添加资源权限</p>
	 * @param role
	 * @param resources
	 * @author Jonathan
	 */
	void insertRoleResource(@Param("role") Integer role, @Param("resource") Integer resource);

	/**
	 * <P> 添加角色账户关联</P>
	 *
	 * @author lidongfu_2005@sina.com
	 * @param roleId
	 * @param accountId
	 */
	int insertRoleAccount(@Param("roleId") Integer roleId, @Param("accountId") Integer accountId);

	/**
	 * <P> 根据账户ID删除该账户的所有角色</P>
	 *
	 * @author lidongfu_2005@sina.com
	 * @param accountId
	 */
	int deleteByRoleAccount(@Param("accountId") Integer accountId);

	/**
	 * <p>TODO</p>
	 * @param id
	 * @return
	 * @author Jonathan
	 */
	List<Role> selectByAccountId(@Param("accountId") Integer accountId);

	/**
	 * <P>根据用户ID查询该角色 </P>
	 *
	 * @author lidongfu_2005@sina.com
	 * @param userId
	 * @return
	 */
	List<Role> selectByUserId(@Param("userId") Integer userId);

	/**
	 * <p>TODO</p>
	 * @return
	 * @author Jonathan
	 */
	List<? extends UfaBaseRole> selectAllUfaBaseRole();

	/**
	 * 
	 * <P> 根据用户ID获取该用户的菜单  </P>
	 * 
	 * @author lidongfu_2005@sina.com
	 * @param userId
	 * @return
	 */
	List<Menu> selectMenuByUserId(@Param("userId") Integer userId);

	/**
	 * 
	 * <P> 根据角色获取菜单 </P>
	 *
	 * @author lidongfu_2005@sina.com
	 * @param roleId
	 * @return
	 */
	List<Menu> selectMenuByRoleId(@Param("roleId") Integer roleId);

	/**
	 * 
	 * <P> 获取所有菜单 </P>
	 *
	 * @author lidongfu_2005@sina.com
	 * @return
	 */
	List<Menu> selectAllMenu();

	/**
	 * 
	 * <P> </P>
	 *
	 * @author lidongfu_2005@sina.com
	 * @param roleId
	 * @param menuId
	 */
	void insertRoleMenu(@Param("roleId") Integer roleId, @Param("menuId") Integer menuId);

	/**
	 * 
	 * <P> 根据角色删除菜单关联 </P>
	 *
	 * @author lidongfu_2005@sina.com
	 * @param menuId
	 */
	void deleteByRoleMenu(@Param("roleId") Integer roleId);

	/**
	 * 
	 * <p>编辑保存时重名检测</p>
	 * @param record
	 * @return
	 * @author wangzh
	 */
	int countByNameForEdit(Role record);
}