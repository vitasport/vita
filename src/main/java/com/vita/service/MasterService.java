package com.vita.service;/**
 * Created by tawift on 2018/12/6.
 */

import com.vita.entity.Device;
import com.vita.entity.Master;
import com.vita.mapper.DeviceMapper;
import com.vita.mapper.MasterMapper;
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
public class MasterService {

    @Autowired
    MasterMapper masterMapper;

    /**
     * Master列表查询
     * @return
     */
    public List<Master> selectMasterByCondition(Master master) {
        List<Master> list = masterMapper.selectMasterByCondition(master);
        return list;
    }

}
