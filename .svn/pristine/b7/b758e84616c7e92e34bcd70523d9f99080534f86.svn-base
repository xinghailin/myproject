package com.yyq.car.portal.common.mapper.comm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.comm.Brand;


@UfaMapper
public interface BrandMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Brand record);

	int insertSelective(Brand record);

	Brand selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Brand record);

	int updateByPrimaryKey(Brand record);

	List<Brand> selectByCriteria(Brand record, RowBounds rowBounds);

	List<Brand> selectByCriteria(Brand record);

	int countByCriteria(Brand record);

	/**
	 * <p>TODO</p>
	 * @return
	 * @author lkd
	 */
	List<Map<String, Object>> getBrands();

	List<Map<String, Object>> queryMembersByBrandId(Integer id);
}