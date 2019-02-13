package com.yyq.car.portal.common.mapper.cif;

import com.yyq.car.portal.common.model.cif.Seller;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface SellerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Seller record);

    int insertSelective(Seller record);

    Seller selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Seller record);

    int updateByPrimaryKey(Seller record);

    List<Seller> selectByCriteria(Seller record, RowBounds rowBounds);

    List<Seller> selectByCriteria(Seller record);

    int countByCriteria(Seller record);
}