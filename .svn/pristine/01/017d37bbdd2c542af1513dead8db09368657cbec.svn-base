package com.yyq.car.portal.common.mapper.product;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.dto.Cartypedto;
import com.yyq.car.portal.common.model.product.CarType;


@UfaMapper
public interface CarTypeMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(CarType record);

	int insertSelective(CarType record);

	CarType selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(CarType record);

	int updateByPrimaryKey(CarType record);

	List<CarType> selectByCriteria(CarType record, RowBounds rowBounds);

	List<CarType> selectByCriteria(CarType record);

	int countByCriteria(CarType record);

	CarType queryCarByid(CarType record);

	List<Map<String, Object>> findAllCarTypeByBrand(Map<String, Object> map);

	// 根据型号查询车辆列表
	List<Map<String, Object>> findCarTypeByModel(Map<String, Object> map);

	// 根据型号分组查询上架车型
	List<Map<String, Object>> groupfindAllCarTypeByBrand(Map<String, Object> map);

	Map<String, Object> queryCarTypeById(Integer id);

	List<Map<String, Object>> queryCarBrand();

	List<Map<String, Object>> selectByCriteriaForMsPage(Map<String, Object> map);

	int countByCriteriaForMsPage(Map<String, Object> map);

	List<Map<String, Object>> queryCarType();

	List<Map<String, Object>> queryCarTypeModel(CarType record);

	List<Map<String, Object>> queryCarTypeVersion(CarType record);

	String queryCarByidputaway(Integer id);

	int updateParamById(Integer id);

	int updateParam(Integer id);

	Cartypedto selectdtoByPrimaryKey(Integer id);
}