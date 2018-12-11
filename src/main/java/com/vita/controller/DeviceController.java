package com.vita.controller;/**
 * Created by tawift on 2018/12/6.
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vita.entity.BookOrder;
import com.vita.entity.Device;
import com.vita.model.JSONResult;
import com.vita.model.OrderListVo;
import com.vita.model.OrderVo;
import com.vita.model.PageVo;
import com.vita.service.DeviceService;
import com.vita.service.OrderService;
import io.swagger.annotations.ApiOperation;
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
@RequestMapping("device/")
public class DeviceController {

    @Autowired
    DeviceService deviceService;

    /**
     *
     * @return
     */
    @RequestMapping(value = "/findDeviceByPage", method = {RequestMethod.POST})
    public JSONResult<PageInfo<Device>> findDeviceByPage(Device device, PageVo pageVo) {
        PageHelper.startPage(pageVo.getPage(), pageVo.getLimit());

        List<Device> taskList =  deviceService.selectDeviceByCondition(device);

        PageInfo<Device> pageInfo = new PageInfo<Device>(taskList);

        JSONResult<PageInfo<Device>> rst = new JSONResult<>(pageInfo);

        return rst;
    }

    /**
     * 添加设备
     * @param device
     * @return
     */
    @RequestMapping(value = "addDevice", method = { RequestMethod.POST})
    public JSONResult<String> addDevice(Device device) {

        deviceService.insert(device);

        return new JSONResult<>();
    }

    /**
     * 更新设备
     * @param device
     * @return
     */
    @RequestMapping(value = "updateDevice", method = { RequestMethod.POST})
    public JSONResult<String> updateDevice(Device device) {

        deviceService.updateByPrimaryKey(device);

        return new JSONResult<>();
    }

    /**
     * 删除设备
     * @return
     */
    @RequestMapping(value = "deleteDevice", method = { RequestMethod.POST})
    public JSONResult<String> deleteDevice(String id) {

        deviceService.deleteByPrimaryKey(Integer.parseInt(id));

        return new JSONResult<>();
    }

}
