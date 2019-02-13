package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.BizCarAccessoryStatus;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface BizCarAccessoryStatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizCarAccessoryStatus record);

    int insertSelective(BizCarAccessoryStatus record);

    BizCarAccessoryStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BizCarAccessoryStatus record);

    int updateByPrimaryKey(BizCarAccessoryStatus record);

    List<BizCarAccessoryStatus> selectByCriteria(BizCarAccessoryStatus record, RowBounds rowBounds);

    List<BizCarAccessoryStatus> selectByCriteria(BizCarAccessoryStatus record);

    int countByCriteria(BizCarAccessoryStatus record);

	List<Map<String, Object>> CarAccessorydetailsList(Integer carid);
	List<Map<String, Object>> getCarAccessorydetailsList(Integer carid);
	

}