package com.yyq.car.portal.common.mapper.product;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.product.CarTypeLight;


@UfaMapper
public interface CarTypeLightMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(CarTypeLight record);

	int insertSelective(CarTypeLight record);

	CarTypeLight selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(CarTypeLight record);

	int updateByPrimaryKey(CarTypeLight record);

	List<CarTypeLight> selectByCriteria(CarTypeLight record, RowBounds rowBounds);

	List<CarTypeLight> selectByCriteria(CarTypeLight record);

	int countByCriteria(CarTypeLight record);

	List<Map<String, String>> selectBySort(Integer id);

	int deleteByCarType(Integer carType);
}