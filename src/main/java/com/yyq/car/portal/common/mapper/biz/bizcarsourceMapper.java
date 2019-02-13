package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.bizcarsource;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface bizcarsourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(bizcarsource record);

    int insertSelective(bizcarsource record);

    bizcarsource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(bizcarsource record);

    int updateByPrimaryKey(bizcarsource record);

    List<bizcarsource> selectByCriteria(bizcarsource record, RowBounds rowBounds);

    List<bizcarsource> selectByCriteria(bizcarsource record);

    int countByCriteria(bizcarsource record);
    int carSourceAuditCount();
}