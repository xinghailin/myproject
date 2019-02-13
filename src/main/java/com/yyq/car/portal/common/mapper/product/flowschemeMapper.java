package com.yyq.car.portal.common.mapper.product;

import com.yyq.car.portal.common.model.product.flowscheme;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface flowschemeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(flowscheme record);

    int insertSelective(flowscheme record);

    flowscheme selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(flowscheme record);

    int updateByPrimaryKeyWithBLOBs(flowscheme record);

    int updateByPrimaryKey(flowscheme record);

    List<flowscheme> selectByCriteria(flowscheme record, RowBounds rowBounds);

    List<flowscheme> selectByCriteria(flowscheme record);

    int countByCriteria(flowscheme record);
}