package com.vita.mapper;

import com.vita.entity.BookOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookOrder record);

    int insertSelective(BookOrder record);

    BookOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookOrder record);

    int updateByPrimaryKey(BookOrder record);
}