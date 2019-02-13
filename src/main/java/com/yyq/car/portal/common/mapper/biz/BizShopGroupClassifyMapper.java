package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.BizShopGroupClassify;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface BizShopGroupClassifyMapper {
    int deleteByPrimaryKey(String id);

    int insert(BizShopGroupClassify record);

    int insertSelective(BizShopGroupClassify record);

    BizShopGroupClassify selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BizShopGroupClassify record);

    int updateByPrimaryKey(BizShopGroupClassify record);

    List<BizShopGroupClassify> selectByCriteria(BizShopGroupClassify record, RowBounds rowBounds);

    List<BizShopGroupClassify> selectByCriteria(BizShopGroupClassify record);

    int countByCriteria(BizShopGroupClassify record);
    
    
    int deleteSelective(BizShopGroupClassify record);
}