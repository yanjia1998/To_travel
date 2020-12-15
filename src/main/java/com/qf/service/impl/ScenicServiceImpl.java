package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.ScenicRepository;
import com.qf.pojo.Scenic;
import com.qf.service.ScenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Wang on 2020/12/14 14:43
 */
@Service
public class ScenicServiceImpl implements ScenicService {

    @Autowired
    ScenicRepository scenicRepository;

    @Override
    public BaseResp findAll() {
        BaseResp BaseResp = new BaseResp();
        List<Scenic> all = scenicRepository.findAll();
        BaseResp.setData(all);
        BaseResp.setMessage("查询全部成功");
        BaseResp.setCode(200);
        return BaseResp;
    }
}
