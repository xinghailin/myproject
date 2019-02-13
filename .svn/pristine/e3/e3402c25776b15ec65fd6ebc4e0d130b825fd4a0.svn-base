/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.service.auth.UserDetailsService
 * Created By: Jonathan 
 * Created on: 2014-8-8 下午4:20:44
 * Copyright © 2008-2014 NATIE All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.service.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.ufa.log.Logger;
import org.ufa.log.LoggerFactory;

import com.yyq.car.portal.common.constant.LoginType;
import com.yyq.car.portal.common.dto.AccountDTO;
import com.yyq.car.portal.common.mapper.auth.RoleMapper;
import com.yyq.car.portal.common.mapper.cif.AccountMapper;
import com.yyq.car.portal.common.model.auth.Role;


/**
 * <P>TODO</P>
 * @author Jonathan
 */
@Service("userDetailsService")
public class CustomizedUserDetailsService implements UserDetailsService {

	final private Logger logger = LoggerFactory.getLogger(CustomizedUserDetailsService.class);

	@Autowired
	private AccountMapper accountMapper;

	@Autowired
	private RoleMapper roleMapper;

	/*
	 * (non-Javadoc)
	 * @see
	 * org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.
	 * lang.String)
	 * @author Jonathan
	 */
	@Override
	public UserDetails loadUserByUsername(String loginName) throws UsernameNotFoundException {
		logger.debug("进入CustomizedUserDetailsService.loadUserByUsername, 用户登录名:{}", loginName);
		LoginType loginType = LoginType.MOBILE;
		// if (loginName.contains("@")) { // 邮箱名登录
		// loginType = LoginType.EMAIL;
		// } else if (loginName.matches("^1[3-9]\\d{9}$")) {// 手机号码登录
		// loginType = LoginType.MOBILE;
		// } else {
		// loginType = LoginType.NICK_NAME;// 昵称登录
		// }
		logger.debug("根据用户名:{},登录类型:{}检索用户信息", loginName, loginType.getName());
		AccountDTO accountDTO = accountMapper.selectByLoginInfo(loginName, loginType.getValue());

		if (accountDTO == null) {
			logger.debug("根据用户名:{},登录类型:{}未找到用户信息", loginName, loginType.getName());
			throw new UsernameNotFoundException("error.authentication.usernameorpassword.username");
		}
		// AccountDTO accountDTO = new AccountDTO();
		// BeanCopierUtils.copyProperties(account, accountDTO);
		accountDTO.setLoginName(loginName);
		accountDTO.setLoginType(loginType);
		List<Role> roles = roleMapper.selectByAccountId(accountDTO.getId());
		Collection<GrantedAuthority> authorities = loadUserAuthorities(roles);
		accountDTO.getAuthorities().addAll(authorities);
		return accountDTO;
	}

	/**
	 * <p>获取账户角色信息</p>
	 * @param roles
	 * @return
	 * @author Jonathan
	 */
	private Collection<GrantedAuthority> loadUserAuthorities(List<Role> roles) {
		final Set<GrantedAuthority> gas = new HashSet<GrantedAuthority>(roles.size());
		for (Role role : roles) {
			gas.add(new SimpleGrantedAuthority(StringUtils.trim(role.getName())));
		}
		return gas;
	}

}
