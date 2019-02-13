package com.yyq.car.portal.common.mapper.jnd;

import com.yyq.car.portal.common.model.jnd.Jndcontract;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface JndcontractMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Jndcontract record);

	int insertSelective(Jndcontract record);

	Jndcontract selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Jndcontract record);

	int updateByPrimaryKey(Jndcontract record);

	List<Jndcontract> selectByCriteria(Jndcontract record, RowBounds rowBounds);

	List<Jndcontract> selectByCriteria(Jndcontract record);

	int countByCriteria(Jndcontract record);

	List<Map<String, Object>> selectByPara(Map<String, Object> map);

	int countByPara(Map<String, Object> map);

	int selectSumBySubbuyId(Map<String, Object> map);

	int insertSelectiveWithKey(Jndcontract record);

	// 付款申请单查看用
	List<Map<String, Object>> selectContract(Map<String, Object> paraMap);

	int countContract(Map<String, Object> paraMap);

	void updateapaylock(Jndcontract contract);

	// 付款申请单选择合同
	List<Map<String, Object>> selectContracts(Map<String, Object> paraMap);

	// ///////

	Map<String, Object> choosecontractshow(int id);

	void updatepaystatus(Integer apayid);

	Map<String, Object> selectMultiContractById(Integer id);

	int updateContract(Jndcontract record);// 编辑提交合同

	List<Jndcontract> selectcode(Object apayid);

	int countTaskByNode(@Param("node") int node);// 通过节点获取代办任务数量
}