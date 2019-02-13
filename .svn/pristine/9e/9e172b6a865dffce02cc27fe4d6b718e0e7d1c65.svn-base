package com.yyq.car.portal.common.mapper.cif;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.cif.Bargain;


@UfaMapper
public interface BargainMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Bargain record);

	int insertSelective(Bargain record);

	Bargain selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Bargain record);

	int updateByPrimaryKey(Bargain record);

	List<Bargain> selectByCriteria(Bargain record, RowBounds rowBounds);

	List<Bargain> selectByCriteria(Bargain record);

	int countByCriteria(Bargain record);

	/**
	 * 查询所有帮我砍价人员的信息
	 * @param record
	 * @return
	 */
	List<Bargain> selectBargain(String initiatorId);

	/**
	 * 查询朋友是否砍过
	 * @param record
	 * @return
	 */
	Bargain selectFriend(Bargain record);

	/**
	 * 计算已经砍了多少钱
	 * @param initiatorId
	 * @return
	 */
	BigDecimal selectAllMoney(String initiatorId);

	/**
	 * 统计已经砍了的人数
	 * @param initiatorId
	 * @return
	 */
	int countBargainNum(String initiatorId);
}