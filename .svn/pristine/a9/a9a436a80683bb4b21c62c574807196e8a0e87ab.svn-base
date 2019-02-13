package com.yyq.car.portal.common.mapper.comm;

import com.yyq.car.portal.common.model.comm.Areaprice;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface AreapriceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Areaprice record);

    int insertSelective(Areaprice record);

    Areaprice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Areaprice record);

    int updateByPrimaryKey(Areaprice record);

    List<Areaprice> selectByCriteria(Areaprice record, RowBounds rowBounds);

    List<Areaprice> selectByCriteria(Areaprice record);

    int countByCriteria(Areaprice record);
}