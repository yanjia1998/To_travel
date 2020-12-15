package com.qf.service;

import com.qf.common.BaseResp;

/**
 * Created by Wang on 2020/12/14 14:12
 */
public interface CityService {

//查所有城市
    BaseResp findAll(Integer page,Integer size);
//根据城市id查询城市所有景点
    BaseResp findById(Integer id);
}
