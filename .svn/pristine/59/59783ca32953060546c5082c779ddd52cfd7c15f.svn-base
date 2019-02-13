package com.yyq.car.portal.common.mapper.kr;

import com.yyq.car.portal.common.model.kr.Krpool;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface KrpoolMapper {
    int deleteByPrimaryKey(String id);

    int insert(Krpool record);

    int insertSelective(Krpool record);

    Krpool selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Krpool record);

    int updateByPrimaryKey(Krpool record);

    List<Krpool> selectByCriteria(Krpool record, RowBounds rowBounds);

    List<Krpool> selectByCriteria(Krpool record);

    int countByCriteria(Krpool record);
    List<Krpool> findAllPoolList();
}