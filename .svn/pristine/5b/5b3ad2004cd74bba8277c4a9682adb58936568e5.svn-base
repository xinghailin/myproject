package com.yyq.car.portal.common.mapper.comm;

import com.yyq.car.portal.common.dto.MasterDataDTO;
import com.yyq.car.portal.common.model.comm.MasterData;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface MasterDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MasterData record);

    int insertSelective(MasterData record);

    MasterData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MasterData record);

    int updateByPrimaryKey(MasterData record);

    List<MasterData> selectByCriteria(MasterData record, RowBounds rowBounds);

    List<MasterData> selectByCriteria(MasterData record);

    int countByCriteria(MasterData record);
	/**
	 * <p>根据类型查询</p>
	 * @param value
	 * @return
	 * @author Jonathan
	 */
	List<MasterDataDTO> selectByDataType(String value);

}