package com.yyq.car.portal.common.mapper.biz;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

import com.yyq.car.portal.common.dto.CarFinanceDto;
import com.yyq.car.portal.common.dto.CarFinanceShopDto;
import com.yyq.car.portal.common.model.product.Car;

@UfaMapper
public interface CarFinanceMapper {
    int deleteByPrimaryKey(String id);

    int insert(CarFinanceDto record);

    int insertSelective(CarFinanceDto record);

    CarFinanceDto selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CarFinanceDto record);

    int updateByPrimaryKey(CarFinanceDto record);

    /*List<CarFinanceDto> selectByCriteria(CarFinanceDto record, RowBounds rowBounds);*/

    List<CarFinanceDto> selectByCriteria(CarFinanceDto record);

   
    
   
    List<CarFinanceDto> selectByMaxDate();
    
    
    List<CarFinanceDto> selectCarByCarFinance(CarFinanceDto record);
    int countCarByCarFinance(CarFinanceDto record);
    
    
    List<CarFinanceShopDto>  selectListShopByUser(int id);
    
    
    List<Map<String, Object>> selectStoreCarByCriteria(CarFinanceShopDto record, RowBounds rowBounds);
    
    int countStoreCarByCriteria(CarFinanceShopDto record);
    
}