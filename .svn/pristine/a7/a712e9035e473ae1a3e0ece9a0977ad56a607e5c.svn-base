package com.yyq.car.portal.common.mapper.cif;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.dto.ContractDto;
import com.yyq.car.portal.common.model.cif.contract;


@UfaMapper
public interface contractMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(contract record);

	int insertSelective(contract record);

	contract selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(contract record);

	int updateByPrimaryKey(contract record);

	List<contract> selectByCriteria(contract record, RowBounds rowBounds);

	List<contract> selectByCriteria(contract record);

	int countByCriteria(contract record);

	/**
	 * 购车合同详情
	 * <p>TODO</p>
	 * @param record
	 * @return
	 * @author mjy
	 */
	List<ContractDto> contractQuery(ContractDto record);

	/**
	 * 购车合同数量
	 * <p>TODO</p>
	 * @param record
	 * @return
	 * @author mjy
	 */
	int contractQueryNum(ContractDto record);

	/**
	 * 
	 * <p>TODO</p>
	 * @param record
	 * @return
	 * @author mjy
	 */
	ContractDto contractQueryDetails(ContractDto record);

}