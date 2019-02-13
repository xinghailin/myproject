package com.yyq.car.portal.common.mapper.biz;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.biz.Bizcontract;


@UfaMapper
public interface BizcontractMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Bizcontract record);

	int insertSelective(Bizcontract record);

	Bizcontract selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Bizcontract record);

	int updateByPrimaryKey(Bizcontract record);

	List<Bizcontract> selectByCriteria(Bizcontract record, RowBounds rowBounds);

	List<Bizcontract> selectByCriteria(Bizcontract record);

	int countByCriteria(Bizcontract record);

	List<Map<String, Object>> selectByMap(Map<String, Object> pmap);

	int countByMap(Map<String, Object> pmap);

	List<Bizcontract> selectByCriteriaforSMS(List<String> dates);

	int updateBySmsUidSelective(Bizcontract record);

	int updateByPrimaryKeyandstatusnull(Bizcontract record);

	List<Map<String, Object>> selectpandectByMap(Map<String, Object> pmap);

	int countpandectByMap(Map<String, Object> pmap);

	List<Map<String, Object>> selectAllByMap(Map<String, Object> pmap);

	int countAllByMap(Map<String, Object> pmap);

	int countTaskByMap(Map<String, Object> pmap);
}