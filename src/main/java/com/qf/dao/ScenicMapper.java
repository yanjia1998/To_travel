package com.qf.dao;

import com.qf.pojo.Scenic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Wang on 2020/12/15 11:40
 */
@Mapper
public interface ScenicMapper {

    List<Scenic> byScenicName(@Param("scenicName")String scenicName);
}
