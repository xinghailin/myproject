/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.service.auth.SecurityHelper
 * Created By: Jonathan 
 * Created on: 2014-8-9 下午3:11:02
 * Copyright © 2008-2014 NATIE All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.service.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.yyq.car.portal.common.constant.Constants;
import com.yyq.car.portal.common.dto.AccountDTO;
import com.yyq.car.portal.common.dto.UserDTO;
import com.yyq.car.portal.common.exception.PortalBizCheckedException;


/**
 * <P>账户信息工具类</P>
 * @author Jonathan
 */
public class SecurityHelper {

	/**
	 * <p>获得登录账户信息</p>
	 * @return
	 * @author Jonathan
	 */
	public static AccountDTO getAccount() {

		final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (null != authentication) {
			Object details = authentication.getPrincipal();
			if (details instanceof AccountDTO) {
				return (AccountDTO) details;
			}
		}
		return null;
	}

	/**
	 * <p>获取用户昵称</p>
	 * @return
	 * @author Jonathan
	 */
	public static String getNickname() {
		final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (null != authentication) {
			Object details = authentication.getPrincipal();
			if (details instanceof AccountDTO) {
				return StringUtils.defaultString(((AccountDTO) details).getNickname());
			}
		}
		return StringUtils.EMPTY;
	}

	/**
	 * <p>获取用户账户ID</p>
	 * @return
	 * @author Jonathan
	 */
	public static Integer getAccountId() {
		final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (null != authentication) {
			Object details = authentication.getPrincipal();
			if (details instanceof AccountDTO) {
				return ((AccountDTO) details).getId();
			}
		}
		return null;
	}

	/**
	 * <p>获取会员性别</p>
	 * @return
	 * @author Jonathan
	 */
	public static String getGender() {
		final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (null != authentication) {
			Object details = authentication.getPrincipal();
			if (details instanceof AccountDTO) {
				return ((AccountDTO) details).getGender();
			}
		}
		return null;
	}

	public static Integer getOrgId() {
		final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (null != authentication) {
			Object details = authentication.getPrincipal();
			if (details instanceof AccountDTO) {
				return ((AccountDTO) details).getOrgId();
			}
		}
		return null;
	}

	/**
	 * <P> 获得后台登录用户</P>
	 * 
	 * @author lidongfu_2005@sina.com
	 * @return
	 */
	public static UserDTO getAdminUserInfo() {
		// final Authentication authentication =
		// SecurityContextHolder.getContext().getAuthentication();
		// if (null != authentication) {
		// Object details = authentication.getPrincipal();
		// if (details instanceof UserDTO) {
		// return (UserDTO) details;
		// }
		// }
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		Object acc = session.getAttribute(Constants.ACCOUNT_INFO);
		if (acc == null) {
			throw new PortalBizCheckedException("未登录或登录信息已失效，请重新登录!");
		}
		return (UserDTO) acc;
	}

	public static UserDTO getAdminUserInfoForInit() {
		final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (null != authentication) {
			Object details = authentication.getPrincipal();
			if (details instanceof UserDTO) {
				return (UserDTO) details;
			}
		}
		return null;
	}
}
