package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.ProcurementWeeklyQuotation;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface ProcurementWeeklyQuotationMapper {
    int deleteByPrimaryKey(String id);

    int insert(ProcurementWeeklyQuotation record);

    int insertSelective(ProcurementWeeklyQuotation record);

    ProcurementWeeklyQuotation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ProcurementWeeklyQuotation record);

    int updateByPrimaryKey(ProcurementWeeklyQuotation record);

    List<ProcurementWeeklyQuotation> selectByCriteria(ProcurementWeeklyQuotation record, RowBounds rowBounds);

    List<ProcurementWeeklyQuotation> selectByCriteria(ProcurementWeeklyQuotation record);

    int countByCriteria(ProcurementWeeklyQuotation record);
    
    List<ProcurementWeeklyQuotation> selectByMaxDate();
}