package com.yyq.car.portal.common.mapper.cif;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.cif.Meet;


@UfaMapper
public interface MeetMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Meet record);

	int insertSelective(Meet record);

	Meet selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Meet record);

	int updateByPrimaryKey(Meet record);

	List<Meet> selectByCriteria(Meet record, RowBounds rowBounds);

	List<Meet> selectByCriteria(Meet record);

	int countByCriteria(Meet record);

	List<Map<String, Object>> selectByPhone(Meet record);

	List<Map<String, Object>> selectMeetLstByAccId(Map<String, Object> map);

	int countMeetLstByAccId(Map<String, Object> map);
}