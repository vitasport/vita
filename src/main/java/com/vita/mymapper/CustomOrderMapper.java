package com.vita.mymapper;

import com.vita.entity.BookOrder;
import com.vita.entity.Stock;
import com.vita.model.OrderListVo;
import com.vita.model.StockVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by tawift on 2018/12/6.
 */
@Mapper
public interface CustomOrderMapper {

    List<BookOrder> orderList(OrderListVo vo);

    List<Stock> stockList(StockVo vo);
}
