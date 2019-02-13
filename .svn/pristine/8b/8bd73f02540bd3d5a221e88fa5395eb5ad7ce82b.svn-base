package com.yyq.car.portal.common.mapper.jnd;

import com.yyq.car.portal.common.model.jnd.JndfreightcarKey;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface JndfreightcarMapper {
    int deleteByPrimaryKey(JndfreightcarKey key);

    void deletefreight(int freid);
    int insert(JndfreightcarKey record);

    int insertSelective(JndfreightcarKey record);

    List<JndfreightcarKey> selectByCriteria(JndfreightcarKey record, RowBounds rowBounds);

    List<JndfreightcarKey> selectByCriteria(JndfreightcarKey record);

    int countByCriteria(JndfreightcarKey record);
}