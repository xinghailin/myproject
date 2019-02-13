package com.yyq.car.portal.common.mapper.product;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.dto.CarAveragePriceDto;
import com.yyq.car.portal.common.dto.carProfitDto;
import com.yyq.car.portal.common.model.product.Car;


@UfaMapper
public interface CarMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Car record);

	int insertSelective(Car record);

	Car selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Car record);

	
	int updateByPrimaryKey(Car record);
	/**
	 * 审核完毕车辆入库
	 */
	int updateCarStatus(Car record);
	List<Car> selectByCriteria(Car record, RowBounds rowBounds);
	
	List<Car> selectByCriteria(Car record);

	int countByCriteria(Car record);
	/**
	 * 获取指定车辆信息
	 * @param carId
	 * @return
	 */
	Map<String, Object> selectCarInfoById(Integer carId);

	int countByParam(Car record);

	int updateByPrimaryKeySelectiveForEdit(Car record);

	List<Car> selectByCriteriaExport(Car record);

	int unlockCarSaleStatus(Integer id);

	Car selectByCriteriaByVin(@Param("vin") String vin);

	int updateByVinForRealsale(Car record);

	int countEngineByVin(Map<String, String> map);

	/**
	 * 统计卖出车辆
	 * <p>TODO</p>
	 * @param map
	 * @return
	 * @author mjy
	 */

	int countBuyCar(Map map);

	/**
	 * 汽车销售均价
	 * <p>TODO</p>
	 * @param price
	 * @return
	 * @author mjy
	 */
	List<CarAveragePriceDto> countCarPrice(CarAveragePriceDto record, RowBounds rowBounds);

	/**
	 * 汽车销售均价统计条数
	 * <p>TODO</p>
	 * @param record
	 * @return
	 * @author mjy
	 */
	int countCarPriceCount(CarAveragePriceDto record);

	/**
	 * 汽车型号销售比例
	 * <p>TODO</p>
	 * @param record
	 * @param rowBounds
	 * @return
	 * @author mjy
	 */
	List<CarAveragePriceDto> countPopularModel(CarAveragePriceDto record, RowBounds rowBounds);

	/**
	 * 汽车型号数量
	 * <p>TODO</p>
	 * @param record
	 * @return
	 * @author mjy
	 */
	int countmodel(CarAveragePriceDto record);

	/**
	 * 统计车俩平均库龄
	 * <p>TODO</p>
	 * @param record
	 * @param rowBounds
	 * @return
	 * @author mjy
	 */
	List<CarAveragePriceDto> countAvgWarehouseAge(CarAveragePriceDto record, RowBounds rowBounds);

	/**
	 * 统计汽车数量
	 * <p>TODO</p>
	 * @param record
	 * @return
	 * @author mjy
	 */
	int countCarNumber(CarAveragePriceDto record);

	/**
	 * 统计汽车卖出和没有卖出车龄和的平均车龄
	 * <p>TODO</p>
	 * @param record
	 * @return
	 * @author mjy
	 */
	List<CarAveragePriceDto> countCarAvgAge(CarAveragePriceDto record);

	/**
	 * 计算利润
	 * <p>TODO</p>
	 * @param profit
	 * @param rowBounds
	 * @return
	 * @author mjy
	 */

	List<carProfitDto> statisProfit(carProfitDto profit);

	/**
	 * 计算卖出数量
	 * <p>TODO</p>
	 * @param profit
	 * @return
	 * @author mjy
	 */
	int countProfit(carProfitDto profit);
	/**
	 * 查询所有车辆所在地
	 * @return
	 */
	List<Car> queryCarAddress();

	void updateStatus(Car car);

	/*
	 * 金融合同审核通过时 把车辆表里的车根据车架号修改为销售绑定
	 */
	void updateByVinStatus(String vin);

	Car selectStatus(String vin);

	List<Map<String, Object>> selectcarlibrary(Map<String, Object> paraMap);

	int countselectcarlibrary(Map<String, Object> paraMap);

	List<Car> shopcar(Integer id);

	void untiesupplycar(Integer carid);

	/**
	 * 样车金融移库确定
	 * @param car2
	 */
	void sampleCarMoveShop(Car car2);

	
	/**
	 * 其他门店移库确定
	 * @param car2
	 */
	void otherCarMoveshop(Car car2);

	Car selectvendibility(String vin);

	/**
	 * 交车验车时跟换车时原来的车解绑
	 * @param carid
	 */
	void updateSaleStatus(Integer id);
	
	int inStoreAudit();

	Car matchingVin(Car car);
}