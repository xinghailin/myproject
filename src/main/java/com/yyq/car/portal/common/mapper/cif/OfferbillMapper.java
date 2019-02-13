package com.yyq.car.portal.common.mapper.cif;

import com.yyq.car.portal.common.model.cif.Offerbill;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface OfferbillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Offerbill record);

    int insertSelective(Offerbill record);

    Offerbill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Offerbill record);

    int updateByPrimaryKey(Offerbill record);

    List<Offerbill> selectByCriteria(Offerbill record, RowBounds rowBounds);

    List<Offerbill> selectByCriteria(Offerbill record);

    int countByCriteria(Offerbill record);
}