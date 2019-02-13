package com.yyq.car.portal.common.mapper.cif;

import com.yyq.car.portal.common.model.cif.Communicate;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface CommunicateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Communicate record);

    int insertSelective(Communicate record);

    Communicate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Communicate record);

    int updateByPrimaryKey(Communicate record);

    List<Communicate> selectByCriteria(Communicate record, RowBounds rowBounds);

    List<Communicate> selectByCriteria(Communicate record);

    int countByCriteria(Communicate record);

}