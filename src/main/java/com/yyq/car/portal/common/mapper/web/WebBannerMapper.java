package com.yyq.car.portal.common.mapper.web;

import com.yyq.car.portal.common.model.web.WebBanner;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface WebBannerMapper {
    int deleteByPrimaryKey(String id);

    int insert(WebBanner record);

    int insertSelective(WebBanner record);

    WebBanner selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WebBanner record);

    int updateByPrimaryKey(WebBanner record);

    List<WebBanner> selectByCriteria(WebBanner record, RowBounds rowBounds);

    List<WebBanner> selectByCriteria(WebBanner record);

    int countByCriteria(WebBanner record);
}