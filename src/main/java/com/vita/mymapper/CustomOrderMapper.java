package com.vita.mymapper;

import com.vita.entity.BookOrder;
import com.vita.entity.Stock;
import com.vita.model.OrderListVo;
import com.vita.model.OrderVo;
import com.vita.model.StockListVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by tawift on 2018/12/6.
 */
@Mapper
public interface CustomOrderMapper {

    List<BookOrder> orderList(OrderListVo vo);

    List<Stock> stockList(StockListVo vo);

    Map<String,Object> selectBookOrderInfo(@Param("orderId")Integer orderId);

    int lockStock(Stock ups);
}
