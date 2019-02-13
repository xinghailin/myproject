package com.yyq.car.portal.common.mapper.comm;

import com.yyq.car.portal.common.model.comm.Weblocation;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface WeblocationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Weblocation record);

    int insertSelective(Weblocation record);

    Weblocation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Weblocation record);

    int updateByPrimaryKey(Weblocation record);

    List<Weblocation> selectByCriteria(Weblocation record, RowBounds rowBounds);

    List<Weblocation> selectByCriteria(Weblocation record);

    
    int countByCriteria(Weblocation record);
    
    List<Map<String, Object>>queryCity(int parent);
    
}