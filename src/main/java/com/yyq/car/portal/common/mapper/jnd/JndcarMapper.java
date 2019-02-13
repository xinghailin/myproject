package com.yyq.car.portal.common.mapper.jnd;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.jnd.Jndcar;


@UfaMapper
public interface JndcarMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Jndcar record);

	int insertSelective(Jndcar record);

	Jndcar selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Jndcar record);

	int updateByPrimaryKey(Jndcar record);

	List<Jndcar> selectByCriteria(Jndcar record, RowBounds rowBounds);

	List<Jndcar> selectByCriteria(Jndcar record);

	int countByCriteria(Jndcar record);

	List<Jndcar> selectByCriteriaParamMap(Map<String, Object> map);

	int countByCriteriaParamMap(Map<String, Object> map);

	int queryidByVin(String vin);

	Jndcar selectcarPrice(Jndcar jndcar);

	String vinVerify(String vin);

	int updateByPrimaryKeyStatus1(int id);

	String enginenumVerify(String enginenum);

	void updatecarprice(Jndcar jndcar);
	int carNeedInStorageNum(Map<String, Object> map);

	Jndcar matchingVin(Jndcar car);
	

}