package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.PayMoneyDetails;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface PayMoneyDetailsMapper {
    int deleteByPrimaryKey(String id);

    int insert(PayMoneyDetails record);

    int insertSelective(PayMoneyDetails record);

    PayMoneyDetails selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PayMoneyDetails record);

    int updateByPrimaryKey(PayMoneyDetails record);

    List<PayMoneyDetails> selectByCriteria(PayMoneyDetails record, RowBounds rowBounds);

    List<PayMoneyDetails> selectByCriteria(PayMoneyDetails record);

    int countByCriteria(PayMoneyDetails record);
}