package com.yyq.car.portal.common.mapper.jnd;

import com.yyq.car.portal.common.model.jnd.Jndfile;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface JndfileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Jndfile record);

    int insertSelective(Jndfile record);

    Jndfile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jndfile record);

    int updateByPrimaryKey(Jndfile record);

    List<Jndfile> selectByCriteria(Jndfile record, RowBounds rowBounds);

    List<Jndfile> selectByCriteria(Jndfile record);

    int countByCriteria(Jndfile record);

	String querylocation(Jndfile jndfile);
}