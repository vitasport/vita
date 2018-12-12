package com.vita.service;/**
 * Created by tawift on 2018/12/6.
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vita.entity.BookOrder;
import com.vita.entity.Device;
import com.vita.mapper.BookOrderMapper;
import com.vita.mapper.DeviceMapper;
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
public class DeviceService {

    @Autowired
    DeviceMapper deviceMapper;

    /**
     * 订单管理列表查询
     * @return
     */
    public List<Device> selectDeviceByCondition(Device device) {
        List<Device> list = deviceMapper.selectDeviceByCondition(device);
        return list;
    }

    public int insert(Device record)
    {
        return deviceMapper.insert(record);
    }

    public int deleteByPrimaryKey(Integer id)
    {
        return deviceMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKey(Device record)
    {
        return deviceMapper.updateByPrimaryKey(record);
    }
}
