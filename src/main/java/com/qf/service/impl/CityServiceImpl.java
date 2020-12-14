package com.qf.service.impl;

import com.qf.commen.BaseResponse;
import com.qf.dao.CityBaseResponse;
import com.qf.dao.CityMapper;
import com.qf.pojo.City;
import com.qf.pojo.Scenic;
import com.qf.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Wang on 2020/12/14 14:12
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityBaseResponse cityBaseResponse;

    @Autowired
    CityMapper cityMapper;

    @Override
    public BaseResponse findAll() {
        BaseResponse baseResponse = new BaseResponse();
        List<City> all = cityBaseResponse.findAll();
        baseResponse.setCode(200);
        baseResponse.setMessage("查询全部成功");
        baseResponse.setData(all);
        return baseResponse;
    }

    @Override
    public BaseResponse findById(Integer id) {
        BaseResponse baseResponse = new BaseResponse();
        Scenic byId = cityMapper.findById(id);
        if (byId!=null){
            baseResponse.setCode(200);
            baseResponse.setMessage("根据城市id查询城市所有景点成功");
            baseResponse.setData(byId);
            return baseResponse;
        }
            baseResponse.setCode(201);
            baseResponse.setMessage("查询失败");
            return baseResponse;
    }
}
