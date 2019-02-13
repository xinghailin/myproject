package com.yyq.car.portal.common.mapper.mallcontract;

import com.yyq.car.portal.common.model.mallcontract.MallOrder;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface MallOrderMapper {
    int deleteByPrimaryKey(String id);

    int insert(MallOrder record);

    int insertSelective(MallOrder record);

    MallOrder selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MallOrder record);

    int updateByPrimaryKey(MallOrder record);

    List<MallOrder> selectByCriteria(MallOrder record, RowBounds rowBounds);

    List<MallOrder> selectByCriteria(MallOrder record);

    int countByCriteria(MallOrder record);
}