package com.yyq.car.portal.common.mapper.biz;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.biz.CaseMonitor;


@UfaMapper
public interface CaseMonitorMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(CaseMonitor record);

	int insertSelective(CaseMonitor record);

	CaseMonitor selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(CaseMonitor record);

	int updateByPrimaryKey(CaseMonitor record);

	List<CaseMonitor> selectByCriteria(CaseMonitor record, RowBounds rowBounds);

	List<CaseMonitor> selectByCriteria(CaseMonitor record);

	int countByCriteria(CaseMonitor record);

	List<Map<String, Object>> selectcaseByMap(Map<String, Object> map);

	int countcaseByMap(Map<String, Object> map);

	List<Map<String, Object>> selectcase2ByMap(Map<String, Object> map);

	int countcase2ByMap(Map<String, Object> map);
}