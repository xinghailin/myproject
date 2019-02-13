package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.BizCarAccessory;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface BizCarAccessoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizCarAccessory record);

    int insertSelective(BizCarAccessory record);

    BizCarAccessory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BizCarAccessory record);

    int updateByPrimaryKey(BizCarAccessory record);

    List<BizCarAccessory> selectByCriteria(BizCarAccessory record, RowBounds rowBounds);

    List<BizCarAccessory> selectByCriteria(BizCarAccessory record);

    int countByCriteria(BizCarAccessory record);

	List<Map<String, Object>> selectByCriteriaGroupByVin(Map<String, Object> paraMap);

	void deleteByPrimaryKeySelective(BizCarAccessory bizCarAccessory);

	int countByCriteriaGroupByVin(Map<String, Object> paraMap);
	int carAccseeoryAuditCount();
}