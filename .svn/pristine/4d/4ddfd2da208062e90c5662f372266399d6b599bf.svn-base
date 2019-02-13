package com.yyq.car.portal.common.mapper.auth;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.dto.AuthUserDTO;
import com.yyq.car.portal.common.model.auth.RoleAccount;
import com.yyq.car.portal.common.model.auth.User;

@UfaMapper
public interface UserMapper {
	 int deleteByPrimaryKey(Integer id);
	    
	    int insert(User record);
	    
	    int insertSelective(User record);
	    
	    User selectByPrimaryKey(Integer id);
	    
	    int updateByPrimaryKeySelective(User record);
	    
	    int updateByPrimaryKey(User record);
	    
	    List<User> selectByCriteria(User record, RowBounds rowBounds);
	    List<User> selectByCriteria(User record);
	    
	    List<User> selectByCriteria(AuthUserDTO record,RowBounds rowBounds);
	    
	    int countByCriteria(AuthUserDTO record);
	    
	    List<RoleAccount> selectByUserId(Integer id) ;
	    
	    
	    User selectByLoginInfo(@Param("userName")String userName);
	    
	    List<User> selectByIds(List<Integer> users);
	    
	    int batchUpdatePwdByIds(Map<String, Object> maps);
	    /**
	     * 查询拥有门店管理权限的账户
	     * @return
	     */
	    List<User> queryName();
	    
	    
	    List<User> selectListByName(@Param("loginname")String loginname);
}