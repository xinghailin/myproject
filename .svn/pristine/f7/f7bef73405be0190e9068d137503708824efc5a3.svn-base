package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.Bizsaleborrow;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface BizsaleborrowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bizsaleborrow record);

    int insertSelective(Bizsaleborrow record);

    Bizsaleborrow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bizsaleborrow record);

    int updateByPrimaryKey(Bizsaleborrow record);

    List<Bizsaleborrow> selectByCriteria(Bizsaleborrow record, RowBounds rowBounds);

    List<Bizsaleborrow> selectByCriteria(Bizsaleborrow record);

    int countByCriteria(Bizsaleborrow record);
    
    
    List<Bizsaleborrow> selectAllByCriteria(Bizsaleborrow record, RowBounds rowBounds);

    int countAllByCriteria(Bizsaleborrow record);

	int updateCount(Map<String, Object> map);
}