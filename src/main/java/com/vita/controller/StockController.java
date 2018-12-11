package com.vita.controller;/**
 * Created by tawift on 2018/12/7.
 */

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageInfo;
import com.vita.entity.Stock;
import com.vita.model.JSONResult;
import com.vita.model.StockVo;
import com.vita.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

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
 * @Date : Create in 2018/12/7 13:41
 */
@RestController
@RequestMapping("stock")
public class StockController {

    @Autowired
    StockService stockService;

    /**
     * 库存查询
     *
     * @param vo
     * @return
     */
    @RequestMapping("list")
    public JSONResult<JSONArray> list(@RequestBody @Valid StockVo vo, BindingResult br) {
        return stockService.list(vo);
    }
}
