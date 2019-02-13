package com.yyq.car.portal.common.mapper.biz;

import com.yyq.car.portal.common.model.biz.BizInvoiceFile;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.ufa.mybatis.stereotype.UfaMapper;

@UfaMapper
public interface BizInvoiceFileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizInvoiceFile record);

    int insertSelective(BizInvoiceFile record);

    BizInvoiceFile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BizInvoiceFile record);

    int updateByPrimaryKey(BizInvoiceFile record);

    List<BizInvoiceFile> selectByCriteria(BizInvoiceFile record, RowBounds rowBounds);

    List<BizInvoiceFile> selectByCriteria(BizInvoiceFile record);

    int countByCriteria(BizInvoiceFile record);
}