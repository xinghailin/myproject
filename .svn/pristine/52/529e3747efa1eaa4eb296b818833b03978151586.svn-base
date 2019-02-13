package com.yyq.car.portal.common.mapper.wholesale;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.dto.WholesaleCarDTO;
import com.yyq.car.portal.common.model.wholesale.WholesaleCar;


@UfaMapper
public interface wholesaleCarMapper {
	int deleteByPrimaryKey(String id);

	int insert(WholesaleCar record);

	int insertSelective(WholesaleCar record);

	WholesaleCar selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(WholesaleCar record);

	int updateByPrimaryKey(WholesaleCar record);

	List<WholesaleCar> selectByCriteria(WholesaleCar record, RowBounds rowBounds);

	List<WholesaleCar> selectByCriteria(WholesaleCar record);

	int countByCriteria(WholesaleCar record);

	List<WholesaleCarDTO> selectListCarForStoreByParameter(WholesaleCarDTO record);

	int countListCarForStoreByParameter(WholesaleCarDTO record);

	List<WholesaleCarDTO> selectListCarForFinanceByParameter(WholesaleCarDTO record);

	int countListCarForFinanceByParameter(WholesaleCarDTO record);

	WholesaleCarDTO selectCarAllByPrimaryKey(String id);

	int countTaskByMap(Map<String, Object> pmap);
}