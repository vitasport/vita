package com.vita.service;/**
 * Created by tawift on 2018/12/7.
 */

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.vita.entity.Stock;
import com.vita.enums.CodeEnum;
import com.vita.mapper.StockMapper;
import com.vita.model.BaseVo;
import com.vita.model.JSONResult;
import com.vita.model.StockListVo;
import com.vita.model.StockVo;
import com.vita.mymapper.CustomOrderMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
 * @Date : Create in 2018/12/7 14:09
 */
@Slf4j
@Service
public class StockService {

    @Autowired
    StockMapper stockMapper;

    @Autowired
    CustomOrderMapper customOrderMapper;


    /**
     * 库存查询
     *
     * @param vo
     * @return
     */
    public JSONResult<JSONArray> list(StockListVo vo) {
        List<Stock> list = customOrderMapper.stockList(vo);
        Map<String, List<Stock>> map = list.stream().collect(Collectors.groupingBy(Stock::getGroundName));
        JSONArray data = new JSONArray();
        for (Map.Entry<String, List<Stock>> entry : map.entrySet()) {
            JSONObject json = new JSONObject();
            json.put("groundName", entry.getKey());
            json.put("list", entry.getValue());
            data.add(json);
        }
        return new JSONResult<>(data);
    }

    public JSONResult<JSONObject> stockInfo(BaseVo vo){
        Stock stock = stockMapper.selectByPrimaryKey(vo.getId());
        if(stock == null)
            return new JSONResult<>(CodeEnum.C404, "请求参数错误");
        JSONObject data = (JSONObject)JSONObject.toJSON(stock);
        if("N".equals(stock.getStatus())){
            Map<String,Object> map = customOrderMapper.selectBookOrderInfo(stock.getOrderId());
            data.putAll(map);
        }
        return new JSONResult<>(data);
    }

    public JSONResult<String> lock(StockVo vo) {
        Stock stock = stockMapper.selectByPrimaryKey(vo.getId());
        if(stock.getStatus().equals("Y")){
            Stock ups = new Stock();
            ups.setVersion(stock.getVersion());
            ups.setId(stock.getId());
            ups.setOperId(vo.getOperId());
            ups.setOperName(vo.getOperName());
            ups.setStatus("L");
            int i = customOrderMapper.lockStock(ups);
            if(i == 1)
                return new JSONResult<>();
        }
        return new JSONResult<>(400,"锁场失败，当前场次已被预定");
    }

    public JSONResult<String> update(StockVo vo){
        Stock stock = stockMapper.selectByPrimaryKey(vo.getId());
        if(stock.getStatus().equals("Y")){
            Stock ups = new Stock();
            ups.setVersion(stock.getVersion());
            ups.setPrice(vo.getPrice());
            ups.setId(stock.getId());
            ups.setOperId(vo.getOperId());
            ups.setOperName(vo.getOperName());
            int i = customOrderMapper.lockStock(ups);
            if(i == 1)
                return new JSONResult<>();
        }
        return new JSONResult<>(400,"锁场失败，当前场次已被预定");
    }
}
