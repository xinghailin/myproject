package com.yyq.car.portal.common.mapper.cif;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.dto.AccountDTO;
import com.yyq.car.portal.common.model.cif.Account;


@UfaMapper
public interface AccountMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Account record);

	int insertSelective(Account record);

	Account selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Account record);

	int updateByPrimaryKey(Account record);

	List<Account> selectByCriteria(Account record, RowBounds rowBounds);

	List<Account> selectByCriteria(Account record);

	int countByCriteria(Account record);

	/**
	 * <p>TODO</p>
	 * @return
	 * @author Jonathan
	 */
	AccountDTO selectByLoginInfo(@Param("loginName") String loginName, @Param("loginType") Integer loginType);

	/**
	 * 修改指定手机用户的密码:废弃
	 */
	// int updateLoginPassword(@Param("password")String password, @Param("accountId")Integer
	// accountId);

	/**
	 * 根据客户ID和类型获取账户ID
	 */
	int selectAccountByCustomerId(Integer customerId, Integer type);

	/**
	 * 重置密码：批量重置
	 */
	int updateBatchPwd(Map<String, Object> accountMap);

	/**
	 * 修改账号状态：根据客户类型和客户ID
	 */
	int updateByCustIdAndCustType(Account record);

	/**
	 * 根据客户类型和客户ID，批量修改账号状态
	 */
	int udpateBatchStatus(Map<String, Object> paramMap);

	/**
	 * <p>更新会员服务到期日</p>
	 * @param ext1
	 * @author Jonathan
	 */
	void updateServiceEndDate(@Param("days") String days, @Param("accountId") Integer accountId);

	/**
	 * <p>查询会员服务到期日</p>
	 */
	Date selectServiceEndDate(Integer accountId);

	/**
	 * <p>TODO</p>
	 * @return
	 * @author mjy
	 */
	int updateNoServiceDate();

}