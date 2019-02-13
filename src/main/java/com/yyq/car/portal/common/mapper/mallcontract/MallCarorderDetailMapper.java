package com.yyq.car.portal.common.mapper.mallcontract;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.mallcontract.MallCarorderDetail;


@UfaMapper
public interface MallCarorderDetailMapper {
	int deleteByPrimaryKey(String id);

	int insert(MallCarorderDetail record);

	int insertSelective(MallCarorderDetail record);

	MallCarorderDetail selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(MallCarorderDetail record);

	int updateByPrimaryKey(MallCarorderDetail record);

	List<MallCarorderDetail> selectByCriteria(MallCarorderDetail record, RowBounds rowBounds);

	List<MallCarorderDetail> selectByCriteria(MallCarorderDetail record);

	int countByCriteria(MallCarorderDetail record);

	/**
	 * 
	 * <p>查询流水表检测是否子订单所有的车都已走完5个步骤</p>
	 * @param subordercode
	 * @return
	 * @author wangzh
	 */
	List<Map<String, Object>> selectForOrderstatus(String subordercode);
}