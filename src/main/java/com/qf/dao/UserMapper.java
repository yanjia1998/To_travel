package com.qf.dao;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User findByEmail(@Param("email") String email);

    User findUserName(@Param("userName") String userName);

    int registry(User user);

    void updateUser(User user);
}
