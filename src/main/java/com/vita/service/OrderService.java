package com.vita.service;/**
 * Created by tawift on 2018/12/6.
 */

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vita.entity.BookOrder;
import com.vita.mapper.BookOrderMapper;
import com.vita.model.JSONResult;
import com.vita.model.OrderListVo;
import com.vita.model.OrderVo;
import com.vita.mymapper.CustomOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * code is far away from bug with the animal protecting
 * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 *
 * @Description :
 * ---------------------------------
 * @Author : tawift
 * @Date : Create in 2018/12/6 09:57
 */
@Service
public class OrderService {

    @Autowired
    BookOrderMapper bookOrderMapper;

    @Autowired
    CustomOrderMapper customOrderMapper;


    /**
     * 订单管理列表查询
     * @param vo
     * @return
     */
    public JSONResult<PageInfo<BookOrder>> list(OrderListVo vo) {
        PageHelper.startPage(vo.getPage(),vo.getLimit());
        List<BookOrder> list = customOrderMapper.orderList(vo);
        return new JSONResult<>(new PageInfo<>(list));
    }

    /**
     * 订单详情
     * @return
     */
    public JSONResult<BookOrder> detail(OrderVo vo){
        BookOrder order = bookOrderMapper.selectByPrimaryKey(vo.getOrderId());
        return new JSONResult<>(order);
    }

    public List<BookOrder> findSuccessOrderByPage(BookOrder order)
    {
        return bookOrderMapper.findSuccessOrderByPage(order);
    }
}
