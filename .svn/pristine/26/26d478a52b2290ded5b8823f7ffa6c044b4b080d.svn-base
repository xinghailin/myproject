package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.dto.CarFinanceDto;
import com.yyq.car.portal.common.dto.CarFinanceShopDto;
import com.yyq.car.portal.common.model.biz.PayMoneyInterest;
import com.yyq.car.portal.common.model.product.Shop;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface PayMoneyInterestMapper {
    int deleteByPrimaryKey(String id);

    int insert(PayMoneyInterest record);

    int insertSelective(PayMoneyInterest record);

    PayMoneyInterest selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PayMoneyInterest record);

    int updateByPrimaryKey(PayMoneyInterest record);

    List<PayMoneyInterest> selectByCriteria(PayMoneyInterest record, RowBounds rowBounds);

    List<PayMoneyInterest> selectByCriteria(PayMoneyInterest record);

    int countByCriteria(PayMoneyInterest record);
    
    
    List<CarFinanceShopDto>  selectListShopByUser(String username);
    List<CarFinanceDto> selectCarByCarFinanceShop(CarFinanceShopDto record);
    
    int countCarByCarFinanceShop(CarFinanceShopDto record);
    List<CarFinanceDto> findAllListCarByShopid(CarFinanceShopDto record);
    
    
   
   /* List<Shop> selectListByShoptermid(Shop record);*/
    List<CarFinanceDto> findShopListByParameter(CarFinanceShopDto record);
    int countShopByParameter(CarFinanceShopDto record);
    
    
    List<CarFinanceDto> findCarListByShopid(CarFinanceShopDto record);
    List<CarFinanceDto> findAllCarListByShopid(CarFinanceShopDto record);// 不分页
    int countCarListByShopid(CarFinanceShopDto record);
    
}