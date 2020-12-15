package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @USER: Tian
 * @DATE: 2020/12/15 10:06
 */
@RestController
@RequestMapping("/meal")
public class MealController {
    @Autowired
    private MealService mealService;
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public BaseResp findById(@RequestBody Map map){
        return mealService.findById((Integer) map.get("id"));
    }
}
