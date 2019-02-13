package com.yyq.car.portal.common.mapper.kr;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.kr.Krcar;


@UfaMapper
public interface KrcarMapper {
	int deleteByPrimaryKey(String id);

	int insert(Krcar record);

	int insertSelective(Krcar record);

	Krcar selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(Krcar record);

	int updateByPrimaryKey(Krcar record);

	List<Krcar> selectByCriteria(Krcar record, RowBounds rowBounds);

	List<Krcar> selectByCriteria(Krcar record);

	int countByCriteria(Krcar record);

	List<Krcar> lookAllByCriteria(Krcar record);

	int countlookAllByCriteria(Krcar record);

	String findSummoneyByIds(List<String> ids);

	// String findALLIntSummoney(Krcar record);

	int updateOurCarByids(Map<String, Object> map);

	String findSummoneyByPoolid(Krcar dto);

	List<Krcar> lookcheckByParameter(Krcar record);

	int countlookcheckByParameter(Krcar record);

	List<Krcar> checkByParameter(Krcar record);

	int countcheckByParameter(Krcar record);

	// 最原始的查询
	List<Krcar> selectPrimaryByCriteria(Krcar record, RowBounds rowBounds);

	List<Krcar> findLstByIds(List ids);

	List<Krcar> outByParameter(Krcar record);

	int countoutByParameter(Krcar record);

	int countinpool(String vin);
}