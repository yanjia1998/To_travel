package com.qf.service;

import com.qf.common.BaseResp;

/**
 * Created by Wang on 2020/12/14 14:12
 */
public interface CityService {

    BaseResp findAll(Integer page,Integer size);

    BaseResp findById(Integer id);
}
