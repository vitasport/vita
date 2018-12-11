package com.vita.mapper;

import com.vita.entity.OrderGround;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderGroundMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderGround record);

    int insertSelective(OrderGround record);

    OrderGround selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderGround record);

    int updateByPrimaryKey(OrderGround record);
}