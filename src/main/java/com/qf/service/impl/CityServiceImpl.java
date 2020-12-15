package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.CityMapper;
import com.qf.dao.CityRepository;
import com.qf.pojo.City;
import com.qf.pojo.Scenic;
import com.qf.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

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

        BaseResp BaseResp = new BaseResp();
       // List<City> all = cityRepository.findAll();
        BaseResp.setCode(200);
        BaseResp.setMessage("查询全部成功");
        BaseResp.setData(all);
        BaseResp.setTotal(all.getTotalElements());
        return BaseResp;
    }

    @Override
    public BaseResp findById(Integer id) {
        BaseResp BaseResp = new BaseResp();
        List<Scenic> byId = cityMapper.findById(id);
        if (byId!=null){
            BaseResp.setCode(200);
            BaseResp.setMessage("根据城市id查询城市所有景点成功");
            BaseResp.setData(byId);
            return BaseResp;
        }
            BaseResp.setCode(201);
            BaseResp.setMessage("查询失败");
            return BaseResp;
    }
}
