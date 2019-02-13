package com.yyq.car.portal.common.mapper.cif;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.cif.HelpFind;


@UfaMapper
public interface HelpFindMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(HelpFind record);

	int insertSelective(HelpFind record);

	HelpFind selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(HelpFind record);

	int updateByPrimaryKey(HelpFind record);

	List<HelpFind> selectByCriteria(HelpFind record, RowBounds rowBounds);

	List<HelpFind> selectByCriteria(HelpFind record);

	int countByCriteria(HelpFind record);

	List<HelpFind> selectByCriteriaStatusNull(HelpFind record);
}