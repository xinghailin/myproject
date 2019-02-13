package com.yyq.car.portal.common.mapper.product;

import com.yyq.car.portal.common.model.product.prosupplycartable;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface prosupplycartableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(prosupplycartable record);

    int insertSelective(prosupplycartable record);

    prosupplycartable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(prosupplycartable record);

    int updateByPrimaryKey(prosupplycartable record);

    List<prosupplycartable> selectByCriteria(prosupplycartable record, RowBounds rowBounds);

    List<prosupplycartable> selectByCriteria(prosupplycartable record);

    int countByCriteria(prosupplycartable record);
    
    
    List<prosupplycartable> selectAllByCriteria(prosupplycartable record, RowBounds rowBounds);

    int countAllByCriteria(prosupplycartable record);
    
    
    int countSupplyCarTable(Map<String, Object> map);
}