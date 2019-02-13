package com.yyq.car.portal.common.mapper.comm;

import com.yyq.car.portal.common.model.comm.ShortMessage;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface ShortMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShortMessage record);

    int insertSelective(ShortMessage record);

    ShortMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShortMessage record);

    int updateByPrimaryKey(ShortMessage record);

    List<ShortMessage> selectByCriteria(ShortMessage record, RowBounds rowBounds);

    List<ShortMessage> selectByCriteria(ShortMessage record);

    int countByCriteria(ShortMessage record);

	/**
	 * <p>TODO</p>
	 * @param code
	 * @param value
	 * @author Jonathan
	 */
	void updateSmsDeliveryReport(@Param("resultCode") String resultCode, @Param("status") Integer status);
}