package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(value = "/findAll/{page}/{size}",method = RequestMethod.GET)
    public BaseResp findAll(@PathVariable("page")Integer page, @PathVariable("size")Integer size){
        return cityService.findAll(page,size);
    }

}
