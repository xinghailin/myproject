package com.yyq.car.portal.common.mapper.jnd;

import com.yyq.car.portal.common.model.jnd.jndfreight;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface jndfreightMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(jndfreight record);

    int insertSelective(jndfreight record);

    jndfreight selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(jndfreight record);

    int updateByPrimaryKey(jndfreight record);

    List<jndfreight> selectByCriteria(jndfreight record, RowBounds rowBounds);

    List<jndfreight> selectByCriteria(jndfreight record);

    int countByCriteria(jndfreight record);

	int carFreightApplyAuditNum();
}