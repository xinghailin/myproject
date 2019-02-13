package com.yyq.car.portal.common.mapper.mall;

import com.yyq.car.portal.common.model.mall.CarsourceFile;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface CarsourceFileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarsourceFile record);

    int insertSelective(CarsourceFile record);

    CarsourceFile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarsourceFile record);

    int updateByPrimaryKey(CarsourceFile record);

    List<CarsourceFile> selectByCriteria(CarsourceFile record, RowBounds rowBounds);

    List<CarsourceFile> selectByCriteria(CarsourceFile record);

    int countByCriteria(CarsourceFile record);
}