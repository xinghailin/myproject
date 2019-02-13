package com.yyq.car.portal.common.mapper.comm;

import com.yyq.car.portal.common.model.comm.Abrand;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface AbrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Abrand record);

    int insertSelective(Abrand record);

    Abrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Abrand record);

    int updateByPrimaryKey(Abrand record);

    List<Abrand> selectByCriteria(Abrand record, RowBounds rowBounds);

    List<Abrand> selectByCriteria(Abrand record);
    
    List<Map<String, Object>> queryBrand(String brandinitial);
    
    int countByCriteria(Abrand record);

	void deleteAll();

	List<Abrand> queryBrandinitial();
	List<Map<String, Object>>APPqueryBrandinitial();

	void addAbrandlist(List<Abrand> bandlist);
}