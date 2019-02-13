package com.yyq.car.portal.common.mapper.product;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.product.Store;


@UfaMapper
public interface StoreMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Store record);

	int insertSelective(Store record);

	Store selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Store record);

	int updateByPrimaryKey(Store record);

	List<Store> selectByCriteria(Store record, RowBounds rowBounds);

	List<Store> selectByCriteria(Store record);

	int countByCriteria(Store record);

	List<Store> jndstore();
	List<Store> cStoreid();
	//国外地区登录时查询相应的仓库
	List<Store> userjndstore(Integer type);

	List<Store> selectByCountry(Store st);
}