package com.yyq.car.portal.common.mapper.comm;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.comm.AppVersion;


@UfaMapper
public interface AppVersionMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(AppVersion record);

	int insertSelective(AppVersion record);

	AppVersion selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(AppVersion record);

	int updateByPrimaryKey(AppVersion record);

	List<AppVersion> selectByCriteria(AppVersion record, RowBounds rowBounds);

	List<AppVersion> selectByCriteria(AppVersion record);

	int countByCriteria(AppVersion record);

	/**
	 * 
	 * <P> 获取最新版本 </P>
	 *
	 * @author lidongfu_2005@sina.com
	 * @return
	 */
	AppVersion selectNewVersion(@Param("type") String type);

}