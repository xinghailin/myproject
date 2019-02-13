package com.yyq.car.portal.common.mapper.jnd;

import com.yyq.car.portal.common.model.jnd.jndSupplier;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface jndSupplierMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(jndSupplier record);

    int insertSelective(jndSupplier record);

    jndSupplier selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(jndSupplier record);

    int updateByPrimaryKey(jndSupplier record);

    List<jndSupplier> selectByCriteria(jndSupplier record, RowBounds rowBounds);

    List<jndSupplier> selectByCriteria(jndSupplier record);

    int countByCriteria(jndSupplier record);
}