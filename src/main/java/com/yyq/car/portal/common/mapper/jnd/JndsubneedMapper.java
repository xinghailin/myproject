package com.yyq.car.portal.common.mapper.jnd;

import com.yyq.car.portal.common.model.jnd.Jndsubneed;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface JndsubneedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Jndsubneed record);

    int insertSelective(Jndsubneed record);

    Jndsubneed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jndsubneed record);

    int updateByPrimaryKey(Jndsubneed record);

    List<Jndsubneed> selectByCriteria(Jndsubneed record, RowBounds rowBounds);

    List<Jndsubneed> selectByCriteria(Jndsubneed record);

    int countByCriteria(Jndsubneed record);

	List<Map<String, Object>> jndsubneedlst(int id);

	void dletejndsubneeds(int id);

	List<Map<String, Object>> judsubneedid(int id);
}