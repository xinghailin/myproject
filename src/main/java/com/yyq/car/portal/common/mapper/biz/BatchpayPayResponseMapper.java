package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.BatchpayPayResponse;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface BatchpayPayResponseMapper {
    int deleteByPrimaryKey(String id);

    int insert(BatchpayPayResponse record);

    int insertSelective(BatchpayPayResponse record);

    BatchpayPayResponse selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BatchpayPayResponse record);

    int updateByPrimaryKeyWithBLOBs(BatchpayPayResponse record);

    int updateByPrimaryKey(BatchpayPayResponse record);

    List<BatchpayPayResponse> selectByCriteria(BatchpayPayResponse record, RowBounds rowBounds);

    List<BatchpayPayResponse> selectByCriteria(BatchpayPayResponse record);

    int countByCriteria(BatchpayPayResponse record);
}