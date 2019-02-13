package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.BizBondsman;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface BizBondsmanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizBondsman record);

    int insertSelective(BizBondsman record);

    BizBondsman selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BizBondsman record);

    int updateByPrimaryKey(BizBondsman record);

    List<BizBondsman> selectByCriteria(BizBondsman record, RowBounds rowBounds);

    List<BizBondsman> selectByCriteria(BizBondsman record);

    int countByCriteria(BizBondsman record);

	void deleteByleasebackid(Integer id);
}