package com.yyq.car.portal.common.mapper.comm;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.comm.Email;

@UfaMapper
public interface EmailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Email record);

    int insertSelective(Email record);

    Email selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Email record);

    int updateByPrimaryKey(Email record);

    List<Email> selectByCriteria(Email record, RowBounds rowBounds);

    List<Email> selectByCriteria(Email record);

    int countByCriteria(Email record);
    
    
    /******************以下为自定义sql***********************/
    //检查邮件是否已发送过
    int countByConditions(Email record);
     
}