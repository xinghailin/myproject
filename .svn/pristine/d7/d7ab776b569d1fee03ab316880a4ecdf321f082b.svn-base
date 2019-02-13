package com.yyq.car.portal.common.mapper.comm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.comm.Banner;


@UfaMapper
public interface BannerMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Banner record);

	int insertSelective(Banner record);

	Banner selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Banner record);

	int updateByPrimaryKey(Banner record);

	List<Banner> selectByCriteria(Banner record, RowBounds rowBounds);

	List<Banner> selectByCriteria(Banner record);

	int countByCriteria(Banner record);

	List<Map<String, Object>> selectBySort();

	List<Map<String, Object>> APPselectBySort();

	List<Map<String, Object>> selectBySortMs(@Param(value = "start") Integer start, @Param(value = "size") Integer size);

	int updateDtoByPrimaryKeySelective(Banner banner);
}