package com.yyq.car.portal.common.mapper.comm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.ufa.mybatis.stereotype.UfaMapper;


@UfaMapper
public interface GetDataByTypeMapper {

	List<Map> getDataByTypeMessage(String type);

	// 关联comm_masterdata_pic表查询图片
	List<Map> getDataByTypePic();

	/**
	 * <p>TODO</p>
	 * @param provinceId
	 * @return
	 * @author mjy
	 */
	List<Map> getCityAndProvinceMessage(@Param("provinceId") String provinceId);

	/**
	 * <p>TODO</p>
	 * @return
	 * @author mjy
	 */
	List<Map> getProvincesMessage();

	List<Map> getAreaMessage(String id);

	List<Map> getAllBrand();

	List<Map> getAllBrandMemberRelate(Integer memberId);

}