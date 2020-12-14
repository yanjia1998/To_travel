package com.qf.controller;

import com.qf.common.BaseResponse;
import com.qf.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Wang on 2020/12/14 14:15
 */
@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    CityService cityService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public BaseResponse findAll(){
        return cityService.findAll();
    }

    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public BaseResponse findById(Integer id){
        return cityService.findById(id);
    }
}
