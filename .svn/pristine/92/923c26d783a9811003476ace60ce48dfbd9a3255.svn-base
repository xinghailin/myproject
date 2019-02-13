package com.yyq.car.portal.common.mapper.cif;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.dto.InitiatorDto;
import com.yyq.car.portal.common.model.cif.Initiator;


@UfaMapper
public interface InitiatorMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Initiator record);

	int insertSelective(Initiator record);

	Initiator selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Initiator record);

	int updateByPrimaryKeyWithBLOBs(Initiator record);

	int updateByPrimaryKey(Initiator record);

	List<Initiator> selectByCriteria(Initiator record, RowBounds rowBounds);

	List<Initiator> selectByCriteria(Initiator record);

	//查询状态为 null的所有数据
	List<Initiator> queryTimelst();
	
	int countByCriteria(Initiator record);
	
	Initiator selectByArray(String weixinId);

	int updateMoneyState(Initiator it);

	int insertSelectivewithid(Initiator record);

	 //砍价时间到修改状态为 1
	int updateBargainState(int id);
	//核销
	int confirmSell(int id);
    //后台处理完询底价后改变状态为2 就可以再次发起砍价
    int updateState(Initiator record);
    
    List<InitiatorDto> selectInitiator(InitiatorDto initiatorDto);
}