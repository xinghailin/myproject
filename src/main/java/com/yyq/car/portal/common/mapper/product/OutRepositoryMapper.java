package com.yyq.car.portal.common.mapper.product;

import com.yyq.car.portal.common.model.product.OutRepository;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface OutRepositoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OutRepository record);

    int insertSelective(OutRepository record);

    OutRepository selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OutRepository record);

    int updateByPrimaryKey(OutRepository record);

    List<OutRepository> selectByCriteria(OutRepository record, RowBounds rowBounds);

    List<OutRepository> selectByCriteria(OutRepository record);

    int countByCriteria(OutRepository record);
}