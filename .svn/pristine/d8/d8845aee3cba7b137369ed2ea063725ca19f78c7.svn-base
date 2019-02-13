package com.yyq.car.portal.common.mapper.product;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.product.Shop;


@UfaMapper
public interface ShopMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Shop record);

	int insertSelective(Shop record);

	Shop selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Shop record);

	int updateByPrimaryKey(Shop record);

	List<Shop> selectByCriteria(Shop record, RowBounds rowBounds);

	List<Shop> selectByCriteria(Shop record);

	int countByCriteria(Shop record);

	Shop findByShop(String name);

	List<Shop> selectByCriteriaExceptMc();

	List<Shop> APPselectByCriteriaExceptMc();

	int countShopNum();

	/**
	 * 
	 * <p>重名检测编辑时</p>
	 * @param record
	 * @return
	 * @author wangzh
	 */
	int countByNameForEdit(Shop record);

	int updateSpecialByPrimaryKeySelective(Shop record);

	List<Shop> selectShopsByTermid(Map<String, Object> map);

	int clearTermid(Integer termid);

	List<Shop> selectShopsByParameter(Map<String, Object> map);

	List<Shop> selectAllByCriteria(Shop shop, RowBounds rowBounds);

	int countAllByCriteria(Shop shop);

	List<Shop> selectByCriteriaOrderByInvalid(Shop record, RowBounds rowBounds);
}