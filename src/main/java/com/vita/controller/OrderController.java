package com.vita.controller;/**
 * Created by tawift on 2018/12/6.
 */

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.vita.entity.BookOrder;
import com.vita.model.JSONResult;
import com.vita.model.OrderListVo;
import com.vita.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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
 * @Date : Create in 2018/12/6 09:53
 */

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    OrderService orderService;


    @RequestMapping(value = "list", method = {RequestMethod.GET})
    public JSONResult<PageInfo<BookOrder>> orderList(@Valid OrderListVo vo, BindingResult br) {
        return orderService.list(vo);
    }
}
