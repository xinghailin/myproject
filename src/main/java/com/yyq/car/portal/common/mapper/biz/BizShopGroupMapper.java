package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.BizShopGroup;

import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface BizShopGroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizShopGroup record);

    int insertSelective(BizShopGroup record);

    BizShopGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BizShopGroup record);

    int updateByPrimaryKey(BizShopGroup record);

    List<BizShopGroup> selectByCriteria(BizShopGroup record, RowBounds rowBounds);

    List<BizShopGroup> selectByCriteria(BizShopGroup record);

    int countByCriteria(BizShopGroup record);
    
    List<BizShopGroup> selectByFullName(BizShopGroup record);
    
    
    
}