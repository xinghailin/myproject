package com.yyq.car.portal.common.mapper.jnd;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.jnd.Jndneed;


@UfaMapper
public interface JndneedMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Jndneed record);

	int insertSelective(Jndneed record);

	Jndneed selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Jndneed record);

	int updateByPrimaryKey(Jndneed record);

	List<Jndneed> selectByCriteria(Jndneed record, RowBounds rowBounds);

	List<Jndneed> selectByCriteria(Jndneed record);

	int countByCriteria(Jndneed record);

	void insertSelectivejndneed(Jndneed jndneed);

	void updateMallStatus(Jndneed jndn);

	List<Jndneed> selectByEqualField(Jndneed record);
}