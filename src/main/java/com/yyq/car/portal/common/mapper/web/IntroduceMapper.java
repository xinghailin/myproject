package com.yyq.car.portal.common.mapper.web;

import com.yyq.car.portal.common.model.web.Introduce;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface IntroduceMapper {
    int deleteByPrimaryKey(String id);

    int insert(Introduce record);

    int insertSelective(Introduce record);

    Introduce selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Introduce record);

    int updateByPrimaryKey(Introduce record);

    List<Introduce> selectByCriteria(Introduce record, RowBounds rowBounds);

    List<Introduce> selectByCriteria(Introduce record);

    int countByCriteria(Introduce record);
}