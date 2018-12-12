package com.vita.controller;/**
 * Created by tawift on 2018/12/7.
 */

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.vita.model.BaseVo;
import com.vita.model.JSONResult;
import com.vita.model.StockListVo;
import com.vita.model.StockVo;
import com.vita.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
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
    public JSONResult<JSONArray> list(@RequestBody @Valid StockListVo vo, BindingResult br) {
        return stockService.list(vo);
    }

    @RequestMapping("info")
    public JSONResult<JSONObject> stockInfo(@Valid BaseVo vo, BindingResult br){
        return stockService.stockInfo(vo);
    }

    /**
     * 库存查询
     *
     * @param vo
     * @return
     */
    @RequestMapping("lock")
    public JSONResult<String> lock(@RequestBody @Valid StockVo vo, BindingResult br) {
        return stockService.lock(vo);
    }

    /**
     * 库存修改
     *
     * @param vo
     * @return
     */
    @RequestMapping("update")
    public JSONResult<String> update(@RequestBody @Valid StockVo vo, BindingResult br) {
        return stockService.update(vo);
    }


}
