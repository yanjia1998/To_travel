package com.qf.dao;

import com.qf.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrdersMapper {

    List<Orders> findByUserId(@Param("userId")Integer userId);
}
