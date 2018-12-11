package com.vita.mapper;

import com.vita.entity.Ground;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GroundMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ground record);

    int insertSelective(Ground record);

    Ground selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ground record);

    int updateByPrimaryKey(Ground record);

    List<Ground> selectGroundByCondition(Ground ground);
}