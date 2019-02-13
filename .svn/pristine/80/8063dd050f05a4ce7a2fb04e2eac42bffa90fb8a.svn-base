package com.yyq.car.portal.common.mapper.comm;

import com.yyq.car.portal.common.model.comm.MessageTemplate;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface MessageTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MessageTemplate record);

    int insertSelective(MessageTemplate record);

    MessageTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MessageTemplate record);

    int updateByPrimaryKey(MessageTemplate record);

    List<MessageTemplate> selectByCriteria(MessageTemplate record, RowBounds rowBounds);

    List<MessageTemplate> selectByCriteria(MessageTemplate record);

    int countByCriteria(MessageTemplate record);
}