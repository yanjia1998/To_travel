package com.qf.dao;

import com.qf.pojo.Scenic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Wang on 2020/12/14 16:44
 */
@Mapper
public interface CityMapper {

    List<Scenic> findById(@Param("id")Integer id);
}
