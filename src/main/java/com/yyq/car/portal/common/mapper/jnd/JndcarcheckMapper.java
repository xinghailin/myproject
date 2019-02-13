package com.yyq.car.portal.common.mapper.jnd;

import com.yyq.car.portal.common.model.jnd.Jndcarcheck;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface JndcarcheckMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Jndcarcheck record);

    int insertSelective(Jndcarcheck record);

    Jndcarcheck selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jndcarcheck record);

    int updateByPrimaryKey(Jndcarcheck record);

    List<Jndcarcheck> selectByCriteria(Jndcarcheck record, RowBounds rowBounds);

    List<Jndcarcheck> selectByCriteria(Jndcarcheck record);

    int countByCriteria(Jndcarcheck record);

	int queryjndcarcheckBycarid(int carid);
}