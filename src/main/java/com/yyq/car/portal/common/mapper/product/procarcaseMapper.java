package com.yyq.car.portal.common.mapper.product;

import com.yyq.car.portal.common.model.product.procarcase;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface procarcaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(procarcase record);

    int insertSelective(procarcase record);

    procarcase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(procarcase record);

    int updateByPrimaryKey(procarcase record);

    List<procarcase> selectByCriteria(procarcase record, RowBounds rowBounds);

    List<procarcase> selectByCriteria(procarcase record);

    int countByCriteria(procarcase record);
}