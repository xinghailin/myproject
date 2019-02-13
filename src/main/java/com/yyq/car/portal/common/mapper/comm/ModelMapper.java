package com.yyq.car.portal.common.mapper.comm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.comm.Model;


@UfaMapper
public interface ModelMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Model record);

	int insertSelective(Model record);

	Model selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Model record);

	int updateByPrimaryKey(Model record);

	List<Model> selectByCriteria(Model record, RowBounds rowBounds);

	List<Model> selectByCriteria(Model record);

	int countByCriteria(Model record);

	void deleteAll();

	List<Map<String, Object>> queryModel(int brandid);

	List<Map<String, Object>> queryVersion(String model);

	void addModellist(List<Model> modellist);
}