package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.BizShopGroupInterme;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface BizShopGroupIntermeMapper {
    int deleteByPrimaryKey(String id);

    int insert(BizShopGroupInterme record);

    int insertSelective(BizShopGroupInterme record);

    BizShopGroupInterme selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BizShopGroupInterme record);

    int updateByPrimaryKey(BizShopGroupInterme record);

    List<BizShopGroupInterme> selectByCriteria(BizShopGroupInterme record, RowBounds rowBounds);

    List<BizShopGroupInterme> selectByCriteria(BizShopGroupInterme record);

    int countByCriteria(BizShopGroupInterme record);
    
    
    int deleteSelective(BizShopGroupInterme record);
}