package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.SmsReport;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface SmsReportMapper {
    int deleteByPrimaryKey(String uid);

    int insert(SmsReport record);

    int insertSelective(SmsReport record);

    SmsReport selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(SmsReport record);

    int updateByPrimaryKey(SmsReport record);

    List<SmsReport> selectByCriteria(SmsReport record, RowBounds rowBounds);

    List<SmsReport> selectByCriteria(SmsReport record);

    int countByCriteria(SmsReport record);
}