package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.Bizpayplan;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface BizpayplanMapper {
    int deleteByPrimaryKey(String id);

    int insert(Bizpayplan record);

    int insertSelective(Bizpayplan record);

    Bizpayplan selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Bizpayplan record);

    int updateByPrimaryKey(Bizpayplan record);

    List<Bizpayplan> selectByCriteria(Bizpayplan record, RowBounds rowBounds);

    List<Bizpayplan> selectByCriteria(Bizpayplan record);

    int countByCriteria(Bizpayplan record);
    
    /**
     * 修改时先删除
     * @param id
     */
	void deleteByleasebackid(Integer id);

	List<Bizpayplan> selectByleasebackid1(Integer id);

	List<Bizpayplan> selectByleasebackid2(Integer id);

	List<Bizpayplan> selectByPaytime(Bizpayplan record);

	void updateBySmsUidAndTimeSelective(Bizpayplan b);

    
	List<Bizpayplan> selectByPaytimeForPay(Bizpayplan record);
}