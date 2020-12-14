package com.qf.service.impl;

import com.qf.commen.BaseResponse;
import com.qf.dao.ScenicBaseResponse;
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
    ScenicBaseResponse scenicBaseResponse;

    @Override
    public BaseResponse findAll() {
        BaseResponse baseResponse = new BaseResponse();
        List<Scenic> all = scenicBaseResponse.findAll();
        baseResponse.setData(all);
        baseResponse.setMessage("查询全部成功");
        baseResponse.setCode(200);
        return baseResponse;
    }
}
