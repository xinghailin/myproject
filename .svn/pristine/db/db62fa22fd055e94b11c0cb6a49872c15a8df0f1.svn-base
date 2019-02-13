package com.yyq.car.portal.common.mapper.mallcontract;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.dto.JndCarorderDetailDTO;
import com.yyq.car.portal.common.model.mallcontract.JndCarorderDetail;
import com.yyq.car.portal.common.vo.MallSealApplyVO;

@UfaMapper
public interface JndCarorderDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(JndCarorderDetail record);

    int insertSelective(JndCarorderDetail record);

    JndCarorderDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(JndCarorderDetail record);

    int updateByPrimaryKey(JndCarorderDetail record);

    List<JndCarorderDetail> selectByCriteria(JndCarorderDetail record, RowBounds rowBounds);

    List<JndCarorderDetail> selectByCriteria(JndCarorderDetail record);

    int countByCriteria(JndCarorderDetail record);
    
    List<JndCarorderDetailDTO> selectDetailByCriteria(MallSealApplyVO record);

    int countDetailByCriteria(MallSealApplyVO record);

	List<Map<String, Object>> matchingVin(String subordercode);
}