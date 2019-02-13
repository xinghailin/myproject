package com.yyq.car.portal.common.mapper.product;

import com.yyq.car.portal.common.model.product.CarTransfer;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface CarTransferMapper {

    int insert(CarTransfer record);
    
    CarTransfer selectByPrimaryKey(Integer id);
    
    /**
     * 更新移库申请状态为已完结
     * @param id
     * @return
     */
    int updateStatusById(Integer id);

}