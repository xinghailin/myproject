package com.yyq.car.portal.common.mapper.jnd;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.jnd.Jndbuy;


@UfaMapper
public interface JndbuyMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Jndbuy record);

	int insertSelective(Jndbuy record);

	Jndbuy selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Jndbuy record);

	int updateByPrimaryKey(Jndbuy record);

	List<Jndbuy> selectByCriteria(Jndbuy record, RowBounds rowBounds);

	List<Jndbuy> selectByCriteria(Jndbuy record);

	int countByCriteria(Jndbuy record);

	List<Map<String, Object>> selectPurchaseLst(Map<String, Object> map);

	int countPurchase(Map<String, Object> map);

	int insertSelectiveWithKey(Jndbuy record);

	int countTaskPurchase(Map<String, Object> map);

}