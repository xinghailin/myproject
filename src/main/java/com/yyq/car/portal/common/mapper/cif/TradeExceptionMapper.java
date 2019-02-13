package com.yyq.car.portal.common.mapper.cif;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.cif.TradeException;


@UfaMapper
public interface TradeExceptionMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(TradeException record);

	int insertSelective(TradeException record);

	TradeException selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(TradeException record);

	int updateByPrimaryKey(TradeException record);

	List<TradeException> selectByCriteria(TradeException record, RowBounds rowBounds);

	List<TradeException> selectByCriteria(TradeException record);

	int countByCriteria(TradeException record);

}