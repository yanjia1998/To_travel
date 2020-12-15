package com.qf.service;

import com.qf.common.BaseResp;

/**
 * Created by Wang on 2020/12/14 14:43
 */
public interface ScenicService {

//查全部景点
    BaseResp findAll(Integer page,Integer size);
//    景点详情
    BaseResp findById(Integer id);
//模糊查询
    BaseResp findByScenicNameLike(String scenicName);


}
