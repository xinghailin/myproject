package com.yyq.car.portal.common.service.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.ufa.log.Logger;
import org.ufa.log.LoggerFactory;

import com.yyq.car.portal.common.dto.UserDTO;
import com.yyq.car.portal.common.mapper.auth.RoleMapper;
import com.yyq.car.portal.common.mapper.auth.UserMapper;
import com.yyq.car.portal.common.model.auth.Role;
import com.yyq.car.portal.common.model.auth.User;
import com.yyq.car.portal.common.util.BeanCopierUtils;


/**
 * 
 * <P>
 * 后台用户登录
 * </P>
 * 
 * @author lidongfu_2005@sina.com
 * @date 2014年10月11日 下午1:47:31
 */
@Service("adminUserDetailsService")
public class AdminUserDetailsService implements UserDetailsService {

	final private Logger logger = LoggerFactory.getLogger(AdminUserDetailsService.class);

	@Autowired
	private UserMapper authUserMapper;

	@Autowired
	private RoleMapper roleMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = authUserMapper.selectByLoginInfo(username);
		if (user == null) {
			throw new UsernameNotFoundException("账号或密码错误！");
		}
		if (user.getStatus().intValue() == 0) {
			throw new DisabledException("账户不可用");
		}
		UserDTO userDTO = new UserDTO();
		BeanCopierUtils.copyProperties(user, userDTO);
		userDTO.setLoginName(username);
		List<Role> roles = roleMapper.selectByUserId(user.getId());
		Collection<GrantedAuthority> authorities = loadUserAuthorities(roles);
		userDTO.getAuthorities().addAll(authorities);
		logger.info("AdminUserDetailsService.loadUserByUsername:" + username);
		return userDTO;
	}

	private Collection<GrantedAuthority> loadUserAuthorities(List<Role> roles) {
		final Set<GrantedAuthority> gas = new HashSet<GrantedAuthority>(roles.size());
		for (Role role : roles) {
			gas.add(new SimpleGrantedAuthority(StringUtils.trim(role.getName())));
		}
		return gas;
	}
}
