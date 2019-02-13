package com.yyq.car.portal.common.mapper.comm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.comm.Recommend;


@UfaMapper
public interface RecommendMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Recommend record);

	int insertSelective(Recommend record);

	Recommend selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Recommend record);

	int updateByTypeidSelective(Recommend record);
	int updateByPrimaryKey(Recommend record);

	List<Recommend> selectByCriteria(Recommend record, RowBounds rowBounds);

	List<Recommend> selectByCriteria(Recommend record);

	int countByCriteria(Recommend record);
	List<Map<String, Object>>APPselectBySort(Map<String, Integer> map);
	List<Map<String, Object>> selectBySort(Map<String, Integer> map);

	 Integer queryByTypeId(Integer typeid);
	 //统计是否有已经推荐的品牌车型
	 Integer countByBrandAndModel(Recommend record);
}