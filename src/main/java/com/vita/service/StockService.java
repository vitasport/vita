package com.vita.service;/**
 * Created by tawift on 2018/12/7.
 */

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.vita.entity.Stock;
import com.vita.model.JSONResult;
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
    CustomOrderMapper customOrderMapper;


    /**
     * 库存查询
     *
     * @param vo
     * @return
     */
    public JSONResult<JSONArray> list(StockVo vo) {
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
}
