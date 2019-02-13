package com.yyq.car.portal.common.mapper.comm;

import com.yyq.car.portal.common.model.comm.BargainConfig;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface BargainConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BargainConfig record);

    int insertSelective(BargainConfig record);

    BargainConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BargainConfig record);

    int updateByPrimaryKey(BargainConfig record);

    List<BargainConfig> selectByCriteria(BargainConfig record, RowBounds rowBounds);

    List<BargainConfig> selectByCriteria(BargainConfig record);

    int countByCriteria(BargainConfig record);
}