package com.yyq.car.portal.common.mapper.biz;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.biz.BizInvoice;


@UfaMapper
public interface BizInvoiceMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(BizInvoice record);

	int insertSelective(BizInvoice record);

	BizInvoice selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(BizInvoice record);

	int updateByPrimaryKey(BizInvoice record);

	List<BizInvoice> selectByCriteria(BizInvoice record, RowBounds rowBounds);

	List<BizInvoice> selectByCriteria(BizInvoice record);

	int countByCriteria(BizInvoice record);

	List<Map<String, Object>> selectByMap(Map<String, Object> map);

	int countByMap(Map<String, Object> map);

	int countTaskByMap(Map<String, Object> map);

	List<Map<String, Object>> selectBatchByMap(Map<String, Object> map);

	int countBatchByMap(Map<String, Object> map);
}