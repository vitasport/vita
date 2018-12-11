package com.vita.controller;/**
 * Created by tawift on 2018/12/6.
 */

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vita.entity.BookOrder;
import com.vita.entity.Device;
import com.vita.model.JSONResult;
import com.vita.model.OrderListVo;
import com.vita.model.OrderVo;
import com.vita.model.PageVo;
import com.vita.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
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
 * @Date : Create in 2018/12/6 09:53
 */

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    OrderService orderService;


    /**
     *
     * @param vo
     * @param br
     * @return
     */
    @RequestMapping(value = "list", method = {RequestMethod.POST})
    public JSONResult<PageInfo<BookOrder>> orderList(@RequestBody @Valid OrderListVo vo, BindingResult br) {
        return orderService.list(vo);
    }

    /**
     * 用户查询该用户已经消费记录
     * @param vo
     * @param br
     * @return
     */
    @RequestMapping(value = "detail", method = {RequestMethod.GET})
    public JSONResult<BookOrder> detail(@Valid OrderVo vo, BindingResult br) {
        return orderService.detail(vo);
    }

    @RequestMapping(value = "/findSuccessOrderByPage", method = {RequestMethod.POST})
    public JSONResult<PageInfo<BookOrder>> findSuccessOrderByPage(BookOrder order, PageVo pageVo) {
        PageHelper.startPage(pageVo.getPage(), pageVo.getLimit());

        List<BookOrder> list =  orderService.findSuccessOrderByPage(order);

        PageInfo<BookOrder> pageInfo = new PageInfo<BookOrder>(list);

        JSONResult<PageInfo<BookOrder>> rst = new JSONResult<>(pageInfo);

        return rst;
    }
}
