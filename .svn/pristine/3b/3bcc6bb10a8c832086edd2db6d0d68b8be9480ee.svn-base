package com.yyq.car.portal.common.mapper.auth;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.auth.LoginRole;

@UfaMapper
public interface LoginRoleMapper {
    int deleteByPrimaryKey(LoginRole key);

    int insert(LoginRole record);

    int insertSelective(LoginRole record);

    List<LoginRole> selectByCriteria(LoginRole record, RowBounds rowBounds);

    List<LoginRole> selectByCriteria(LoginRole record);

    int countByCriteria(LoginRole record);
}