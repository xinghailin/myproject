package com.yyq.car.portal.common.mapper.web;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.web.Purchasearea;

@UfaMapper
public interface PurchaseareaMapper {
    int deleteByPrimaryKey(String id);

    int insert(Purchasearea record);

    int insertSelective(Purchasearea record);

    Purchasearea selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Purchasearea record);

    int updateByPrimaryKey(Purchasearea record);

    List<Purchasearea> selectByCriteria(Purchasearea record, RowBounds rowBounds);

    List<Purchasearea> selectByCriteria(Purchasearea record);

    int countByCriteria(Purchasearea record);
    
    
    List<Map<String, Object>> selectByCriteriaBytype(Map<String, Object> record);

    int countByCriteriaBytype(Map<String, Object> record);
}