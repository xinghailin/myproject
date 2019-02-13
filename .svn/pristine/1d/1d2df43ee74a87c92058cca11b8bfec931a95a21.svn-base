package com.yyq.car.portal.common.mapper.biz;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.biz.Bizclientinfo;


@UfaMapper
public interface BizclientinfoMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Bizclientinfo record);

	int insertSelective(Bizclientinfo record);

	Bizclientinfo selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Bizclientinfo record);

	int updateByPrimaryKey(Bizclientinfo record);

	List<Bizclientinfo> selectByCriteria(Bizclientinfo record, RowBounds rowBounds);

	List<Bizclientinfo> selectByCriteria(Bizclientinfo record);

	int countByCriteria(Bizclientinfo record);

	List<Bizclientinfo> selectByCriterialike(Bizclientinfo record, RowBounds rowBounds);

	int countByCriterialike(Bizclientinfo record);

	int insertSelectiveWithKey(Bizclientinfo record);
	
	List<Bizclientinfo> selectAllByCriterialike(Bizclientinfo record, RowBounds rowBounds);

	int countAllByCriterialike(Bizclientinfo record);
	
	

}