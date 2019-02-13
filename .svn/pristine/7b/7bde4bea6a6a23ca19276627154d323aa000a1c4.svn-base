package com.yyq.car.portal.common.mapper.biz;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.dto.BizShopTermDto;
import com.yyq.car.portal.common.model.biz.BizShopTerm;


@UfaMapper
public interface BizShopTermMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(BizShopTerm record);

	int insertSelective(BizShopTerm record);

	BizShopTerm selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(BizShopTerm record);

	int updateByPrimaryKey(BizShopTerm record);

	List<BizShopTerm> selectByCriteria(BizShopTerm record, RowBounds rowBounds);

	List<BizShopTerm> selectByCriteria(BizShopTerm record);

	int countByCriteria(BizShopTerm record);

	List<BizShopTermDto> selectByShopTermDto(BizShopTermDto record);

	int countByShopTermDto(BizShopTermDto record);

	List<Map<String, Object>> selectBaseByMap(Map<String, Object> record);

	int countBaseByMap(Map<String, Object> record);
}