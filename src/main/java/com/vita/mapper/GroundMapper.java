package com.vita.mapper;

import com.vita.entity.Ground;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GroundMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ground record);

    int insertSelective(Ground record);

    Ground selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ground record);

    int updateByPrimaryKey(Ground record);
}