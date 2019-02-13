package com.yyq.car.portal.common.mapper.cif;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.dto.LoginInfoDTO;
import com.yyq.car.portal.common.model.cif.Login;


@UfaMapper
public interface LoginMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Login record);

	int insertSelective(Login record);

	Login selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Login record);

	int updateByPrimaryKey(Login record);

	List<Login> selectByCriteria(Login record, RowBounds rowBounds);

	List<Login> selectByCriteria(Login record);

	int countByCriteria(Login record);

	/**
	 * <p>根据登录名和登录类型查询登录信息</p>
	 * @param loginName
	 * @param loginType
	 * @return
	 * @author Jonathan
	 */
	LoginInfoDTO selectLoginInfo(@Param("loginName") String loginName, @Param("loginType") Integer loginType,@Param("mType") Integer mType);

	// 根据账号ID和登录类型修改登录名
	int updateLoginNameByAccId(Login record);
}