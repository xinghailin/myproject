package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.Bizriskfile;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface BizriskfileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bizriskfile record);

    int insertSelective(Bizriskfile record);

    Bizriskfile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bizriskfile record);

    int updateByPrimaryKey(Bizriskfile record);

    List<Bizriskfile> selectByCriteria(Bizriskfile record, RowBounds rowBounds);

    List<Bizriskfile> selectByCriteria(Bizriskfile record);

    int countByCriteria(Bizriskfile record);
}