package com.yyq.car.portal.common.mapper.mallcontract;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.mallcontract.MallDisplacementTax;


@UfaMapper
public interface MallDisplacementTaxMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(MallDisplacementTax record);

	int insertSelective(MallDisplacementTax record);

	MallDisplacementTax selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(MallDisplacementTax record);

	int updateByPrimaryKey(MallDisplacementTax record);

	List<MallDisplacementTax> selectByCriteria(MallDisplacementTax record, RowBounds rowBounds);

	List<MallDisplacementTax> selectByCriteria(MallDisplacementTax record);

	int countByCriteria(MallDisplacementTax record);

	List<MallDisplacementTax> selectRangeByCriteria(MallDisplacementTax record);
}