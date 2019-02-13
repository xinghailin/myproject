package com.yyq.car.portal.common.mapper.comm;

import com.yyq.car.portal.common.model.comm.Location;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface LocationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Location record);

    int insertSelective(Location record);

    Location selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Location record);

    int updateByPrimaryKey(Location record);

    List<Location> selectByCriteria(Location record, RowBounds rowBounds);

    List<Location> selectByCriteria(Location record);

    int countByCriteria(Location record);
    
    //查询省和直辖市：用于2级联动
    List<Location> queryProvinceAndDirectlyCity();
    
}