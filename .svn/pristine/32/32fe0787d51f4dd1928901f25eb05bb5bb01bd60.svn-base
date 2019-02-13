package com.yyq.car.portal.common.mapper.cif;

import com.yyq.car.portal.common.model.cif.InitialFinalPayment;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface InitialFinalPaymentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InitialFinalPayment record);

    int insertSelective(InitialFinalPayment record);

    InitialFinalPayment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InitialFinalPayment record);

    int updateByPrimaryKey(InitialFinalPayment record);

    List<InitialFinalPayment> selectByCriteria(InitialFinalPayment record, RowBounds rowBounds);

    List<InitialFinalPayment> selectByCriteria(InitialFinalPayment record);

    int countByCriteria(InitialFinalPayment record);
}