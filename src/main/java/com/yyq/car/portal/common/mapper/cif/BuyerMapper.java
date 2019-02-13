package com.yyq.car.portal.common.mapper.cif;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.model.cif.Buyer;


@UfaMapper
public interface BuyerMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Buyer record);

	int insertSelective(Buyer record);

	Buyer selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Buyer record);

	int updateByPrimaryKey(Buyer record);

	List<Buyer> selectByCriteria(Buyer record, RowBounds rowBounds);

	List<Buyer> selectByCriteria(Buyer record);

	int countByCriteria(Buyer record);

	int insertSelectiveWithKey(Buyer record);

	List<Buyer> selectByCriterialike(Buyer record, RowBounds rowBounds);

	int countByCriterialike(Buyer record);

	List<Buyer> selectByCriterialikeForShop(Map<String, Object> map);

	int countByCriterialikeForShop(Map<String, Object> map);

	int unlockCarId(Integer id);

	/**
	 * 来店人数统计
	 * <p>TODO</p>
	 * @param map
	 * @return
	 * @author mjy
	 */
	int countComeShop(Map map);

	/**
	 * 熟客介绍统计
	 * <p>TODO</p>
	 * @param map
	 * @return
	 * @author mjy
	 */
	int countIntroduce(Map map);

	/**
	 * 统计置换人数
	 * <p>TODO</p>
	 * @param map
	 * @return
	 * @author mjy
	 */
	int countPermuteCar(Map map);

	/**
	 * 统计首次购车人数
	 * <p>TODO</p>
	 * @param map
	 * @return
	 * @author mjy
	 */
	int countFirstBuyCar(Map map);

	/**
	 * 统计添置车辆人数
	 * <p>TODO</p>
	 * @param map
	 * @return
	 * @author mjy
	 */

	int countAddCar(Map map);

	/**
	 * 只是看看车
	 * <p>TODO</p>
	 * @param map
	 * @return
	 * @author mjy
	 */
	int countLookCar(Map map);

	/**
	 * 个人用车统计
	 * <p>TODO</p>
	 * @param map
	 * @return
	 * @author mjy
	 */
	int countPersonageBuyCar(Map map);

	/**
	 * 单位用车统计
	 * <p>TODO</p>
	 * @param map
	 * @return
	 * @author mjy
	 */
	int countFirmBuyCar(Map map);

	/**
	 *统计进店已经购买人数(购买意愿) G
	 * <p>TODO</p>
	 * @param map
	 * @return
	 * @author mjy
	 */
	int countAlreadyBuyCar(Map map);

	/**
	 * 统计进店客户级别为特别高(购买意愿) H
	 * <p>TODO</p>
	 * @param map
	 * @return
	 * @author mjy
	 */
	int countVeryHighBuyCar(Map map);

	/**
	 * 统计进店客户级别为很高(购买意愿) A
	 * <p>TODO</p>
	 * @param map
	 * @return
	 * @author mjy
	 */
	int countHighBuyCar(Map map);

	/**
	 * 统计进店客户级别为(购买意愿) B
	 * <p>TODO</p>
	 * @param map
	 * @return
	 * @author mjy
	 */
	int countCenterBuyCar(Map map);

	/**
	 * 统计进店客户级别(购买意愿)C
	 * <p>TODO</p>
	 * @param map
	 * @return
	 * @author mjy
	 */
	int countBottomBuyCar(Map map);

	/**
	 * 统计进店客户不买的 N
	 * <p>TODO</p>
	 * @param map
	 * @return
	 * @author mjy
	 */
	int countNotBuyCar(Map map);


}