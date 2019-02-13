package com.yyq.car.portal.common.mapper.biz;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.biz.Bizrisk;


@UfaMapper
public interface BizriskMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Bizrisk record);

	int insertSelective(Bizrisk record);

	Bizrisk selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Bizrisk record);

	int updateByPrimaryKey(Bizrisk record);

	List<Bizrisk> selectByCriteria(Bizrisk record, RowBounds rowBounds);

	List<Bizrisk> selectByCriteria(Bizrisk record);

	int countByCriteria(Bizrisk record);

	int setMarriageNullByPrimaryKey(Integer id);
}