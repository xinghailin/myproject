package com.yyq.car.portal.common.mapper.web;

import com.yyq.car.portal.common.model.web.Purchasetitle;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface PurchasetitleMapper {
    int deleteByPrimaryKey(String id);

    int insert(Purchasetitle record);

    int insertSelective(Purchasetitle record);

    Purchasetitle selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Purchasetitle record);

    int updateByPrimaryKey(Purchasetitle record);

    List<Purchasetitle> selectByCriteria(Purchasetitle record, RowBounds rowBounds);

    List<Purchasetitle> selectByCriteria(Purchasetitle record);

    int countByCriteria(Purchasetitle record);
}