package com.yyq.car.portal.common.mapper.mallcontract;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.dto.MallOrderDetailDTO;
import com.yyq.car.portal.common.model.mallcontract.MallOrderDetail;
import com.yyq.car.portal.common.vo.MallOrderDetailVO;

@UfaMapper
public interface MallOrderDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(MallOrderDetail record);

    int insertSelective(MallOrderDetail record);

    MallOrderDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MallOrderDetail record);

    int updateByPrimaryKey(MallOrderDetail record);

    List<MallOrderDetail> selectByCriteria(MallOrderDetail record, RowBounds rowBounds);

    List<MallOrderDetail> selectByCriteria(MallOrderDetail record);

    int countByCriteria(MallOrderDetail record);
    
    
    List<MallOrderDetailDTO> selectList(MallOrderDetailVO vo);

    int countList(MallOrderDetailVO vo);
    //根据code 查询  未创建合同    的订单list
    List<MallOrderDetail> selectListBycodes(List<String> code);
    
    
    List<MallOrderDetail> checkboxList(MallOrderDetailVO vo);

    int countcheckboxList(MallOrderDetailVO vo);
}