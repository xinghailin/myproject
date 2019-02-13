package com.yyq.car.portal.common.mapper.auth;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.auth.RoleResource;

@UfaMapper
public interface RoleResourceMapper {
    int deleteByPrimaryKey(RoleResource key);

    int insert(RoleResource record);

    int insertSelective(RoleResource record);

    List<RoleResource> selectByCriteria(RoleResource record, RowBounds rowBounds);

    List<RoleResource> selectByCriteria(RoleResource record);

    int countByCriteria(RoleResource record);
}