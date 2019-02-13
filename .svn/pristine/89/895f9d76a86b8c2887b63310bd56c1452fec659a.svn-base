package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.Casestep;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface CasestepMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Casestep record);

    int insertSelective(Casestep record);

    Casestep selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Casestep record);

    int updateByPrimaryKey(Casestep record);

    List<Casestep> selectByCriteria(Casestep record, RowBounds rowBounds);

    List<Casestep> selectByCriteria(Casestep record);

    int countByCriteria(Casestep record);
}