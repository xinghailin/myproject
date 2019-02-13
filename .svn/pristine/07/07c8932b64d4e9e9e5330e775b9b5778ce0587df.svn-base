package com.yyq.car.portal.common.mapper.mall;

import com.yyq.car.portal.common.model.mall.Mallshoppingcart;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface MallshoppingcartMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mallshoppingcart record);

    int insertSelective(Mallshoppingcart record);

    Mallshoppingcart selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mallshoppingcart record);

    int updateByPrimaryKey(Mallshoppingcart record);

    List<Mallshoppingcart> selectByCriteria(Mallshoppingcart record, RowBounds rowBounds);

    List<Mallshoppingcart> selectByCriteria(Mallshoppingcart record);

    int countByCriteria(Mallshoppingcart record);
}