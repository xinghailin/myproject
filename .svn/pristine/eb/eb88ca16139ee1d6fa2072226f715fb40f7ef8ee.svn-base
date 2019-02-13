package com.yyq.car.portal.common.mapper.biz;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.biz.Bizzeropurchase;


@UfaMapper
public interface BizzeropurchaseMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Bizzeropurchase record);

	int insertSelective(Bizzeropurchase record);

	Bizzeropurchase selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Bizzeropurchase record);

	int updateByPrimaryKey(Bizzeropurchase record);

	List<Bizzeropurchase> selectByCriteria(Bizzeropurchase record, RowBounds rowBounds);

	List<Bizzeropurchase> selectByCriteria(Bizzeropurchase record);

	int countByCriteria(Bizzeropurchase record);

	List<Map<String, Object>> selectByMap(Map<String, Object> record);

	int countByMap(Map<String, Object> record);

	List<Map<String, Object>> selectBaseByMap(Map<String, Object> record);

	int countBaseByMap(Map<String, Object> record);

	int countTaskByNode(@Param("node") int node);// 通过节点获取代办任务数量
}