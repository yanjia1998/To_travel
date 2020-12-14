package com.qf.service;

import com.qf.commen.BaseResponse;
import com.qf.pojo.City;

import java.util.List;

/**
 * Created by Wang on 2020/12/14 14:12
 */
public interface CityService {

    BaseResponse findAll();

    BaseResponse findById(Integer id);
}
