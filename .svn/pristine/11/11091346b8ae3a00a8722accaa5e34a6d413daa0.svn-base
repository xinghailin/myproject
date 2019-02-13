package com.yyq.car.portal.common.mapper.product;

import com.yyq.car.portal.common.model.product.prosupplycar;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface prosupplycarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(prosupplycar record);

    int insertSelective(prosupplycar record);

    prosupplycar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(prosupplycar record);

    int updateByPrimaryKey(prosupplycar record);

    List<prosupplycar> selectByCriteria(prosupplycar record, RowBounds rowBounds);

    List<prosupplycar> selectByCriteria(prosupplycar record);

    int countByCriteria(prosupplycar record);

	List<prosupplycar> selectsupplycar(Integer id);

	/**
	 * 配车审核通过
	 * @param id
	 */
	void updatemovelibrarypass(Integer id);

	void updatemovelibrarynopass(Integer id);

	List<Map<String, Object>> moveLibraryListDetails(Map<String, Object> pmap);

	int countMoveLibraryListDetails(Map<String, Object> pmap);
}