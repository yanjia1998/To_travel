package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.service.ScenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Wang on 2020/12/14 14:45
 */
@RestController
@RequestMapping("/scenic")
public class ScenicController {
    @Autowired
    ScenicService scenicService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public BaseResp findAll(){
        return scenicService.findAll();
    }

    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public BaseResp findById(Integer id){
        return scenicService.findById(id);
    }
}
