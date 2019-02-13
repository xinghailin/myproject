package com.yyq.car.portal.common.mapper.web;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.web.Purchaseareapic;

@UfaMapper
public interface PurchaseareapicMapper {
    int deleteByPrimaryKey(String id);

    int insert(Purchaseareapic record);

    int insertSelective(Purchaseareapic record);

    Purchaseareapic selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Purchaseareapic record);

    int updateByPrimaryKey(Purchaseareapic record);

    List<Purchaseareapic> selectByCriteria(Purchaseareapic record, RowBounds rowBounds);

    List<Purchaseareapic> selectByCriteria(Purchaseareapic record);

    int countByCriteria(Purchaseareapic record);
    
    
    List<Map<String, Object>> selectByCriteriaByparentid(Map<String, Object> record);

    int countByCriteriaByparentid(Map<String, Object> record);
}