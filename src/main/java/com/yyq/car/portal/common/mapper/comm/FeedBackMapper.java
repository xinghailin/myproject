package com.yyq.car.portal.common.mapper.comm;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.comm.FeedBack;


@UfaMapper
public interface FeedBackMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(FeedBack record);

	int insertSelective(FeedBack record);

	FeedBack selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(FeedBack record);

	int updateByPrimaryKey(FeedBack record);

	List<FeedBack> selectByCriteria(FeedBack record, RowBounds rowBounds);

	List<FeedBack> selectByCriteria(FeedBack record);

	int countByCriteria(FeedBack record);
}