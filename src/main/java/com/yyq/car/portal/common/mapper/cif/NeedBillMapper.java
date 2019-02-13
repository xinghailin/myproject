package com.yyq.car.portal.common.mapper.cif;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.cif.NeedBill;
import com.yyq.car.portal.common.model.cif.Purchasebill;


@UfaMapper
public interface NeedBillMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(NeedBill record);

	int insertSelective(NeedBill record);

	NeedBill selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(NeedBill record);

	int updateByPrimaryKey(NeedBill record);

	List<NeedBill> selectByCriteria(NeedBill record, RowBounds rowBounds);

	List<NeedBill> selectByCriteria(NeedBill record);

	int countByCriteria(NeedBill record);

	List<Map<String, Object>> selectByCriteriaForMs(Map<String, Object> map);

	List<Map<String, Object>> queryOfferbill(Map<String, Object> map);

	Purchasebill queryOfferbilldetails(int id);

	int countByCriteriaForMs(Map<String, Object> map);

	int countOfferbill(Map<String, Object> map);

	List<Map<String, Object>> selectNeedLstByAccId(Map<String, Object> map);

	int countNeedLstByAccId(Map<String, Object> map);
}