package com.yyq.car.portal.common.mapper.cif;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.cif.Purchasebill;


@UfaMapper
public interface PurchasebillMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Purchasebill record);

	int insertSelective(Purchasebill record);

	Purchasebill selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Purchasebill record);

	int updateByPrimaryKey(Purchasebill record);

	List<Purchasebill> selectByCriteria(Purchasebill record, RowBounds rowBounds);

	List<Purchasebill> selectByCriteria(Purchasebill record);

	int countByCriteria(Purchasebill record);

	List<Purchasebill> selectByCriteriaBMV(Purchasebill record);

	List<Purchasebill> selectOverdueLst();

	int updateOverdueLst();
}