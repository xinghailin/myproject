package com.yyq.car.portal.common.mapper.jnd;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.jnd.Jndapplypay;


@UfaMapper
public interface JndapplypayMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Jndapplypay record);

	int insertSelective(Jndapplypay record);

	Jndapplypay selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Jndapplypay record);

	int updateByPrimaryKey(Jndapplypay record);

	List<Jndapplypay> selectByCriteria(Jndapplypay record, RowBounds rowBounds);

	List<Jndapplypay> selectByCriteria(Jndapplypay record);

	int countByCriteria(Jndapplypay record);

	int selectSumBySubbuyId(Map<String, Object> map);

	Map<String, Object> getApplypayMultiById(Integer id);

	List<Map<String, Object>> selectApayLst(Map<String, Object> map);

	int countApay(Map<String, Object> map);

	int updateByPrimaryKeySelectiveSpecial(Jndapplypay record);

	int updateTranscostNullByPrimaryKey(Integer id);
}