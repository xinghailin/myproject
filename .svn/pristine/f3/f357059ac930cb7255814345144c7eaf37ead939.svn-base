package com.yyq.car.portal.common.mapper.mall;

import com.yyq.car.portal.common.model.mall.mallUser;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface mallUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(mallUser record);

    int insertSelective(mallUser record);

    mallUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(mallUser record);

    int updateByPrimaryKey(mallUser record);

    List<mallUser> selectByCriteria(mallUser record, RowBounds rowBounds);

    List<mallUser> selectByCriteria(mallUser record);

    int countByCriteria(mallUser record);
}