package com.yyq.car.portal.common.mapper.jnd;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.jnd.jndSite;

@UfaMapper
public interface jndSiteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(jndSite record);

    int insertSelective(jndSite record);

    jndSite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(jndSite record);

    int updateByPrimaryKey(jndSite record);

    List<jndSite> selectByCriteria(jndSite record, RowBounds rowBounds);

    List<jndSite> selectByCriteria(jndSite record);

    int countByCriteria(jndSite record);

	jndSite querycurrency(jndSite jnd);

	List<jndSite> selectArea(Map<Object, Object> map);

	int countArea(Map<Object, Object> map);
}