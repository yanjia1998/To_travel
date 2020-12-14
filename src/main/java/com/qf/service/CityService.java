package com.qf.service;

import com.qf.common.BaseResponse;

/**
 * Created by Wang on 2020/12/14 14:12
 */
public interface CityService {

    BaseResponse findAll();

    BaseResponse findById(Integer id);
}
