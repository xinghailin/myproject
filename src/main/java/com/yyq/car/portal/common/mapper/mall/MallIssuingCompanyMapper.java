package com.yyq.car.portal.common.mapper.mall;

import com.yyq.car.portal.common.model.mall.MallIssuingCompany;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface MallIssuingCompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MallIssuingCompany record);

    int insertSelective(MallIssuingCompany record);

    MallIssuingCompany selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MallIssuingCompany record);

    int updateByPrimaryKey(MallIssuingCompany record);

    List<MallIssuingCompany> selectByCriteria(MallIssuingCompany record, RowBounds rowBounds);

    List<MallIssuingCompany> selectByCriteria(MallIssuingCompany record);

    int countByCriteria(MallIssuingCompany record);
}