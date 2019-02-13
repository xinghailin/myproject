package com.yyq.car.portal.common.mapper.mallcontract;

import com.yyq.car.portal.common.model.mallcontract.MallSealApply;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface MallSealApplyMapper {
    int deleteByPrimaryKey(String id);

    int insert(MallSealApply record);

    int insertSelective(MallSealApply record);

    MallSealApply selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MallSealApply record);

    int updateByPrimaryKeyWithBLOBs(MallSealApply record);

    int updateByPrimaryKey(MallSealApply record);

    List<MallSealApply> selectByCriteria(MallSealApply record, RowBounds rowBounds);

    List<MallSealApply> selectByCriteria(MallSealApply record);

    int countByCriteria(MallSealApply record);
}