/*******************************************************************************
 * Project   : portal-ms
 * Class Name: com.yyq.portal.ms.app.service.RoleService
 * Created By: Jonathan 
 * Created on: 2014-6-5 下午4:21:25
 * Copyright © 2008-2014 NATIE All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.service.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.ufa.security.model.UfaBaseRole;
import org.ufa.security.service.api.IRoleService;

import com.yyq.car.portal.common.exception.PortalBizUnCheckedException;
import com.yyq.car.portal.common.mapper.auth.RoleAccountMapper;
import com.yyq.car.portal.common.mapper.auth.RoleMapper;
import com.yyq.car.portal.common.mapper.product.ShopMapper;
import com.yyq.car.portal.common.model.auth.Menu;
import com.yyq.car.portal.common.model.auth.Role;
import com.yyq.car.portal.common.model.product.Shop;
import com.yyq.car.portal.common.util.RowBoundsUtils;


/**
 * <P>角色服务类</P>
 * @author Jonathan
 */
@Service("roleService")
public class RoleService implements IRoleService {

	@Autowired
	private RoleMapper roleMapper;

	@Autowired
	private RoleAccountMapper roleAccountMapper;

	@Autowired
	private ShopMapper shopMapper;

	/**
	 * <p>查询所有门店</p>
	 * @return
	 * @author wangzh
	 */
	public List<Shop> queryAllShop() {
		return shopMapper.selectByCriteria(new Shop());
	}

	public void add(Role role) {
		// 重名检测
		Role temp = new Role();
		temp.setName(role.getName());
		int c = roleMapper.countByCriteria(temp);
		if (c > 0) {
			throw new PortalBizUnCheckedException("角色名称已存在！");
		}
		int result = roleMapper.insert(role);
		if (result == 0) {
			throw new PortalBizUnCheckedException("新增角色失败");
		}
	}

	/**
	 * <p>分页查询角色信息</p>
	 * @param role
	 * @param start
	 * @param end
	 * @author Jonathan
	 */
	public List<Role> queryByCriteria(Role role, int start, int end) {
		return roleMapper.selectByCriteria(role, RowBoundsUtils.getRowBounds(start, end));
	}

	public Integer countByCriteria(Role role) {
		return roleMapper.countByCriteria(role);
	}

	/**
	 * <p>根据主键roleId查询角色信息</p>
	 * @param roleId
	 * @return 角色对象
	 * @author Jonathan
	 */
	public Role queryByRoleId(Integer roleId) {
		return roleMapper.selectByPrimaryKey(roleId);
	}

	/**
	 * <p>更新角色对象</p>
	 * @param role
	 * @author Jonathan
	 */
	public int update(Role role) {
		// 重名检测
		int c = roleMapper.countByNameForEdit(role);
		if (c > 0) {
			throw new PortalBizUnCheckedException("角色名称已存在！");
		}
		return roleMapper.updateByPrimaryKeySelective(role);
	}

	/**
	 * <p>删除角色</p>
	 * @param id
	 * @return
	 * @author Jonathan
	 */
	public Integer delete(Integer id) {
		return roleMapper.deleteByPrimaryKey(id);
	}

	/**
	 * <p>设置角色对应的资源权限</p>
	 * @param role
	 * @param resources
	 * @author Jonathan
	 */
	@Transactional(propagation = Propagation.REQUIRED, timeout = 3)
	public void configResource(Integer role, Integer[] resources) {
		roleMapper.deleteResourceByRoleId(role);
		if (resources != null && resources.length > 0) {
			for (Integer resource : resources) {
				roleMapper.insertRoleResource(role, resource);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.ufa.security.service.api.IRoleService#getAllRoles()
	 * @author Jonathan
	 */
	@Override
	public List<? extends UfaBaseRole> getAllRoles() {
		return roleMapper.selectAllUfaBaseRole();
	}

	/**
	 * <p>初始化门户角色</p>
	 * @param accountId
	 * @author Jonathan
	 */
	@Transactional(propagation = Propagation.REQUIRED, timeout = 3)
	public void initAccountRole(Integer accountId) {
		roleAccountMapper.insertRoleAccount(20001, accountId);
	}

	/**
	 * 
	 * <P> 根据用户ID获取该用户的菜单 </P>
	 *
	 * @author lidongfu_2005@sina.com
	 * @param userId
	 * @return
	 */

	public List<Menu> userMenuQueryByUserId(Integer userId) {
		return roleMapper.selectMenuByUserId(userId);
	}

	/**
	 * 
	 * <P> 根据角色获取菜单 </P>
	 *
	 * @author lidongfu_2005@sina.com
	 * @param roleId
	 * @return
	 */
	public List<Menu> menuQueryByRole(Integer roleId) {
		return roleMapper.selectMenuByRoleId(roleId);
	}

	/**
	 * 
	 * <P> 获取所有菜单 </P>
	 *
	 * @author lidongfu_2005@sina.com
	 * @return
	 */
	public List<Menu> selectAllMenu() {
		return roleMapper.selectAllMenu();
	}

	/**
	 * 
	 * <P> 配置角色菜单权限 </P>
	 *
	 * @author lidongfu_2005@sina.com
	 * @param role
	 * @param resources
	 */
	@Transactional(propagation = Propagation.REQUIRED, timeout = 3)
	public void configMenu(Integer roleId, Integer[] menuItems) {
		roleMapper.deleteByRoleMenu(roleId);
		if (menuItems != null && menuItems.length > 0) {
			for (Integer menuId : menuItems) {
				roleMapper.insertRoleMenu(roleId, menuId);
			}
		}
	}
}
