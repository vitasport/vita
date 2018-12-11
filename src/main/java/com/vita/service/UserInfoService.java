package com.vita.service;/**
 * Created by tawift on 2018/12/6.
 */

import com.vita.entity.Device;
import com.vita.entity.UserInfo;
import com.vita.mapper.DeviceMapper;
import com.vita.mapper.UserInfoMapper;
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
public class UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    /**
     * 订单管理列表查询
     * @return
     */
    public List<UserInfo> selectUserInfoByCondition(UserInfo userInfo) {
        List<UserInfo> list = userInfoMapper.selectUserInfoByCondition(userInfo);
        return list;
    }

}
