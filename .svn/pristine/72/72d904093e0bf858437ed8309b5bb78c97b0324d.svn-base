package com.yyq.car.portal.common.mapper.jnd;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.jnd.Jndblacksupplier;


@UfaMapper
public interface JndblacksupplierMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Jndblacksupplier record);

	int insertSelective(Jndblacksupplier record);

	Jndblacksupplier selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Jndblacksupplier record);

	int updateByPrimaryKey(Jndblacksupplier record);

	List<Jndblacksupplier> selectByCriteria(Jndblacksupplier record, RowBounds rowBounds);

	List<Jndblacksupplier> selectByCriteria(Jndblacksupplier record);

	int countByCriteria(Jndblacksupplier record);

	// int countInLstByName(Map<String, Object> map);
	int countInLstByName(@Param("now") String now, @Param("name") String name);

	// 定时检测并插入黑名单
	int checkAndInsertSupplier(String now);
	List<Map<String,Object>>selectblacksupplierlist(Map<String, Object> map);
	// 定时检测并插入黑名单新需求关于合同
	int checkAndInsertSupplierNew(String now);
}