package com.yyq.car.portal.common.mapper.comm;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.comm.AuthCode;


@UfaMapper
public interface AuthCodeMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(AuthCode record);

	int insertSelective(AuthCode record);

	AuthCode selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(AuthCode record);

	int updateByPrimaryKey(AuthCode record);

	List<AuthCode> selectByCriteria(AuthCode record, RowBounds rowBounds);

	List<AuthCode> selectByCriteria(AuthCode record);

	int countByCriteria(AuthCode record);

	// 检查验证码是否失效
	int checkEfficucyAuthCode(AuthCode authCode);

	// 检查验证码是否已经发送
	int checkIsHadSend(AuthCode authCode);

	// 根据账号ID删除验证码记录
	int deleteRecordsByAccountId(Integer accountId);

	/**
	 * <p>更新验证码状态(注:更新是做有效性校验)</p>
	 * @param authCodeId
	 * @return
	 * @author Jonathan
	 */
	int updateAuthCodeStatus(int authCodeId);
}