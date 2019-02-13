package com.yyq.car.portal.common.mapper.mall;

import com.yyq.car.portal.common.model.mall.mallAreaBrand;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface mallAreaBrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(mallAreaBrand record);

    int insertSelective(mallAreaBrand record);

    mallAreaBrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(mallAreaBrand record);

    int updateByPrimaryKey(mallAreaBrand record);

    List<mallAreaBrand> selectByCriteria(mallAreaBrand record, RowBounds rowBounds);

    List<mallAreaBrand> selectByCriteria(mallAreaBrand record);

    int countByCriteria(mallAreaBrand record);

	List<Map<String, Object>> selectBrand(Map<Object, Object> map);

	int countBrand(Map<Object, Object> map);
	
	int updateStatus(mallAreaBrand record);
	
}