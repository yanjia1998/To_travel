package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.common.BaseResp;
import com.qf.dao.ScenicRepository;
import com.qf.pojo.Scenic;
import com.qf.service.ScenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Wang on 2020/12/14 14:43
 */
@Service
public class ScenicServiceImpl implements ScenicService {

    @Autowired
    ScenicRepository scenicRepository;

    @Override
    public BaseResp findAll(Integer page,Integer size) {
        BaseResp baseResp = new BaseResp();
        PageRequest pageRequest = new PageRequest(page - 1, size);
        Page<Scenic> all = scenicRepository.findAll(pageRequest);
        baseResp.setData(all);
        baseResp.setMessage("查询全部成功");
        baseResp.setCode(200);
        baseResp.setTotal(all.getTotalElements());
        return baseResp;
    }

    @Override
    public BaseResp findById(Integer id) {
        BaseResp baseResp = new BaseResp();
        Optional<Scenic> byId = scenicRepository.findById(id);
        if (byId.isPresent()){
            baseResp.setMessage("查询景点详情成功");
            baseResp.setCode(200);
            baseResp.setData(byId.get());
            return baseResp;
        }
        baseResp.setCode(201);
        baseResp.setMessage("查询失败");
        return baseResp;
    }

    @Override
    public BaseResp findByScenicNameLike(String scenicName,Integer page,Integer limit) {
        BaseResp baseResp = new BaseResp();
        PageHelper.startPage(page,limit);
        List<Scenic> byScenicNameLike = scenicRepository.findByScenicNameLike(scenicName);
        PageInfo<Scenic> scenicPageInfo = new PageInfo<>(byScenicNameLike);
        if (scenicPageInfo!=null){
            baseResp.setData(scenicPageInfo.getList());
            baseResp.setCode(200);
            baseResp.setMessage("模糊查询景点成功");
            baseResp.setTotal(scenicPageInfo.getTotal());
            return baseResp;
        }
        baseResp.setMessage("查询失败");
        baseResp.setData(201);
        return baseResp;
    }
}
