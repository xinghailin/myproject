package com.yyq.car.portal.common.mapper.product;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.product.CarTypePic;


@UfaMapper
public interface CarTypePicMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(CarTypePic record);

	int insertSelective(CarTypePic record);

	CarTypePic selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(CarTypePic record);

	int updateByPrimaryKey(CarTypePic record);

	List<CarTypePic> selectByCriteria(CarTypePic record, RowBounds rowBounds);

	List<CarTypePic> selectByCriteria(CarTypePic record);

	int countByCriteria(CarTypePic record);

	/**
	 * 分页选车查询
	 * <p>TODO</p>
	 * @param record
	 * @return
	 * @author mjy
	 */

	List<Map<String, String>> selectBySort(Integer id);

	int deleteByCarType(Integer carType);
}