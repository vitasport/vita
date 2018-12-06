package com.vita.mapper;

import com.vita.entity.Stock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
}