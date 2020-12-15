package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.CityRepository;
import com.qf.pojo.City;
import com.qf.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Created by Wang on 2020/12/14 14:12
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityRepository cityRepository;

    @Autowired
    CityMapper cityMapper;

    @Override
    public BaseResp findAll(Integer page,Integer size) {
        PageRequest pageRequest = new PageRequest(page - 1, size);
        Page<City> all = cityRepository.findAll(pageRequest);

        BaseResp baseResp = new BaseResp();
       // List<City> all = cityRepository.findAll();
        baseResp.setCode(200);
        baseResp.setMessage("查询全部成功");
        baseResp.setData(all);
        baseResp.setTotal(all.getTotalElements());
        return baseResp;
    }


}
