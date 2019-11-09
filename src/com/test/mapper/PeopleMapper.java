package com.test.mapper;

import com.test.bean.People;
import com.test.bean.PeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeopleMapper {
    long countByExample(PeopleExample example);

    int deleteByExample(PeopleExample example);

    int insert(People record);

    int insertSelective(People record);

    List<People> selectByExample(PeopleExample example);

    int updateByExampleSelective(@Param("record") People record, @Param("example") PeopleExample example);

    int updateByExample(@Param("record") People record, @Param("example") PeopleExample example);
}