package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.InventoryQuotation;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface InventoryQuotationMapper {
    int deleteByPrimaryKey(String id);

    int insert(InventoryQuotation record);

    int insertSelective(InventoryQuotation record);

    InventoryQuotation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(InventoryQuotation record);

    int updateByPrimaryKey(InventoryQuotation record);

    List<InventoryQuotation> selectByCriteria(InventoryQuotation record, RowBounds rowBounds);

    List<InventoryQuotation> selectByCriteria(InventoryQuotation record);

    int countByCriteria(InventoryQuotation record);
    
    
    List<InventoryQuotation> selectByMaxDate();
}