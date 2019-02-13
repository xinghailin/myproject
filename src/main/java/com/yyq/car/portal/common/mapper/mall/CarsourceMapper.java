package com.yyq.car.portal.common.mapper.mall;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.mall.Carsource;


@UfaMapper
public interface CarsourceMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Carsource record);

	int insertSelective(Carsource record);

	Carsource selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Carsource record);

	int updateByPrimaryKey(Carsource record);

	List<Carsource> selectByCriteria(Carsource record, RowBounds rowBounds);

	List<Carsource> selectByCriteria(Carsource record);

	int countByCriteria(Carsource record);

	List<Map<String, Object>> selectByMap(Map<String, Object> map);

	int countByMap(Map<String, Object> map);

	List<Carsource> selectIssuingcompanyCarSource(Integer id);

	int updateByPrimaryKeySelectiveForEdit(Carsource record);

	int countTaskByAuditstatus();
}