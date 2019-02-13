package com.yyq.car.portal.common.mapper.jnd;

import com.yyq.car.portal.common.model.jnd.Contractapplypay;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface ContractapplypayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Contractapplypay record);

    int insertSelective(Contractapplypay record);

    Contractapplypay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Contractapplypay record);

    int updateByPrimaryKey(Contractapplypay record);

    List<Contractapplypay> selectByCriteria(Contractapplypay record, RowBounds rowBounds);

    List<Contractapplypay> selectByCriteria(Contractapplypay record);

    int countByCriteria(Contractapplypay record);

	List<Map<String, Object>> addselectApayLst(Map<String, Object> paraMap);

	int addcountApay(Map<String, Object> paraMap);

	List<Map<String, Object>> selectApayLst(Map<String, Object> paraMap);

	int countApay(Map<String, Object> paraMap);

	int contractApplypayNoPassUpdateCount(Map<String, Object> map);

	int contractApplypayAuditCount();
}