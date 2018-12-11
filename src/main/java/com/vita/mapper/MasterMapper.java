package com.vita.mapper;

import com.vita.entity.Master;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MasterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Master record);

    int insertSelective(Master record);

    Master selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Master record);

    int updateByPrimaryKey(Master record);

    List<Master> selectMasterByCondition(Master master);
}