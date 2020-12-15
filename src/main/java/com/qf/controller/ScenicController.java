package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.service.ScenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Wang on 2020/12/14 14:45
 */
@RestController
@RequestMapping("/scenic")
public class ScenicController {
    @Autowired
    ScenicService scenicService;


    @RequestMapping(value = "/findAll/{page}/{size}",method = RequestMethod.GET)
    public BaseResp findAll(@PathVariable("page")Integer page,@PathVariable("size")Integer size){
        return scenicService.findAll(page, size);
    }

    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public BaseResp findById(Integer id){
        return scenicService.findById(id);
    }

    @RequestMapping(value = "/findByScenicNameLike",method = RequestMethod.GET)
    public BaseResp findByScenicNameLike(String scenicName){
        return scenicService.findByScenicNameLike("%"+scenicName+"%");
    }

}
