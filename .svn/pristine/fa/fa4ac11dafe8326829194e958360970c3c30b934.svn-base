package com.yyq.car.portal.common.mapper.comm;

import com.yyq.car.portal.common.model.comm.InterestTalk;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface InterestTalkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InterestTalk record);

    int insertSelective(InterestTalk record);

    InterestTalk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InterestTalk record);

    int updateByPrimaryKey(InterestTalk record);

    List<InterestTalk> selectByCriteria(InterestTalk record, RowBounds rowBounds);

    List<InterestTalk> selectByCriteria(InterestTalk record);

    int countByCriteria(InterestTalk record);
}