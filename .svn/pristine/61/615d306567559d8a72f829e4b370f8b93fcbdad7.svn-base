package com.yyq.car.portal.common.mapper.comm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.comm.PriceCity;


@UfaMapper
public interface PriceCityMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(PriceCity record);

	int insertSelective(PriceCity record);

	PriceCity selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(PriceCity record);

	int updateByPrimaryKey(PriceCity record);

	List<PriceCity> selectByCriteria(PriceCity record, RowBounds rowBounds);

	List<PriceCity> selectByCriteria(PriceCity record);

	int countByCriteria(PriceCity record);

	int deleteByParams(Map<String, String> map);
}