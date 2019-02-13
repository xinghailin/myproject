package com.yyq.car.portal.common.mapper.jnd;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.jnd.Jndsubbuy;


@UfaMapper
public interface JndsubbuyMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Jndsubbuy record);

	int insertSelective(Jndsubbuy record);

	Jndsubbuy selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Jndsubbuy record);

	int updateByPrimaryKey(Jndsubbuy record);

	List<Jndsubbuy> selectByCriteria(Jndsubbuy record, RowBounds rowBounds);

	List<Jndsubbuy> selectByCriteria(Jndsubbuy record);

	int countByCriteria(Jndsubbuy record);

	List<Map<String, Object>> selectJoinApplyPay(Map<String, Object> map);

	int updateByPrimaryKeySelectiveSpecial(Jndsubbuy record);

	List<Map<String, Object>> selectLstForApay(Map<String, Object> map);

	int countForApay(Map<String, Object> map);

	Map<String, Object> selectForApayById(Map<String, Object> map);

	String querysubbuyidBysubneedid(int suneedid);

	List<Map<String, Object>> selectLstForContract(Map<String, Object> map);

	int countForContract(Map<String, Object> map);

	Map<String, Object> selectForContractById(Map<String, Object> map);

	/**
	 * 
	 * <p>根据合同查询采购详情页</p>
	 * @param map
	 * @return
	 * @author wangzh
	 */
	List<Map<String, Object>> selectJoinContract(Map<String, Object> map);
}