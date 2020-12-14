package com.qf.dao;

import com.qf.pojo.Scenic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Wang on 2020/12/14 16:44
 */
@Mapper
public interface CityMapper {

    Scenic findById(@Param("id")Integer id);
}
