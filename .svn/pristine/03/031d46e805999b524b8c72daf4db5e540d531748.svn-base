package com.yyq.car.portal.common.mapper.biz;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.biz.Riskcase;


@UfaMapper
public interface RiskcaseMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Riskcase record);

	int insertSelective(Riskcase record);

	Riskcase selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Riskcase record);

	int updateByPrimaryKey(Riskcase record);

	List<Riskcase> selectByCriteria(Riskcase record, RowBounds rowBounds);

	List<Riskcase> selectByCriteria(Riskcase record);

	int countByCriteria(Riskcase record);

	List<Map<String, Object>> selectByMap(Map<String, Object> map);

	int countByMap(Map<String, Object> map);

	List<Map<String, Object>> selectOtherByMap(Map<String, Object> map);

	int countOtherByMap(Map<String, Object> map);

	List<Map<String, Object>> selectsaleborrowforriskcase(Map<String, Object> map);

	int countsaleborrowforriskcase(Map<String, Object> map);

	int countTaskByMap(Map<String, Object> map);
}