package com.vita.controller;/**
 * Created by tawift on 2018/12/6.
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vita.entity.Ground;
import com.vita.entity.UserInfo;
import com.vita.model.JSONResult;
import com.vita.model.PageVo;
import com.vita.service.GroundService;
import com.vita.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("ground/")
public class GroundController {

    @Autowired
    GroundService groundService;

    /**
     *
     * @return
     */
    @RequestMapping(value = "/findGroundByPage", method = {RequestMethod.POST})
    public JSONResult<PageInfo<Ground>> findGroundByPage(Ground ground, PageVo pageVo) {
        PageHelper.startPage(pageVo.getPage(), pageVo.getLimit());

        List<Ground> list =  groundService.selectGroundByCondition(ground);

        PageInfo<Ground> pageInfo = new PageInfo<Ground>(list);

        JSONResult<PageInfo<Ground>> rst = new JSONResult<>(pageInfo);

        return rst;
    }

}
