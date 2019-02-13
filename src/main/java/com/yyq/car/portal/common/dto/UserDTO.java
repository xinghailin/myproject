package com.yyq.car.portal.common.dto;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import net.sf.json.JSONArray;

import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.yyq.car.portal.common.constant.AccountStatus;
import com.yyq.car.portal.common.model.auth.Menu;
import com.yyq.car.portal.common.model.auth.User;
import com.yyq.car.portal.common.util.PasswordUtils;


/**
  *  <P> 用户登录DTO</P>
  *
  * @author lidongfu_2005@sina.com
  *  @date 2014年10月11日 下午1:55:24
 */
public class UserDTO extends User implements UserDetails, CredentialsContainer {

	// private static final long serialVersionUID = 1L;

	private static final long serialVersionUID = -7743401582967059905L;

	private String loginName;

	private Collection<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();

	List<Menu> menuList;

	JSONArray jsonarray;

	List<Menu> taskmenu;


	public List<Menu> getTaskmenu() {
		return taskmenu;
	}

	public void setTaskmenu(List<Menu> taskmenu) {
		this.taskmenu = taskmenu;
	}

	public JSONArray getJsonarray() {
		return jsonarray;
	}

	public void setJsonarray(JSONArray jsonarray) {
		this.jsonarray = jsonarray;
	}

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

	@Override
	public void eraseCredentials() {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		return PasswordUtils.decryptPassord(super.getPassword());
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return super.getLoginName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return !AccountStatus.LOCKED.getValue().equals(getStatus());
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return AccountStatus.ENABLE.getValue().equals(getStatus());
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

}
