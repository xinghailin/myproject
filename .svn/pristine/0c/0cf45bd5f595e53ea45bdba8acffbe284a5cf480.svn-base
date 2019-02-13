package com.yyq.car.portal.common.mapper.cif;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.cif.Member;


@UfaMapper
public interface MemberMapper {
	int insert(Member record);

	int insertSelective(Member record);

	List<Member> selectByCriteria(Member record, RowBounds rowBounds);

	List<Member> selectByCriteria(Member record);

	int countByCriteria(Member record);

	int deleteByPrimaryKey(Integer id);

	List<Member> selectByAccountId(Integer accountId);

	int updateAvatarByMemberId(@Param("memberId") Integer memberId, @Param("avatar") String avatar);

	int updateMobileByPrimaryKey(Member record);

	int updateByPrimaryKeySelective(Member record);

	/**
	 * <p>根据主键查询记录</p>
	 * @param memberId
	 * @return
	 * @author nj
	 */
	Member selectByPrimaryKey(Integer memberId);

}