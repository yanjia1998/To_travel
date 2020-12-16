package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.MealRepository;
import com.qf.pojo.Meal;
import com.qf.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @USER: Tian
 * @DATE: 2020/12/15 9:55
 */
@Service
public class MealServiceImpl implements MealService {
    @Autowired
    private MealRepository mealRepository;
    BaseResp baseResp = new BaseResp();
    @Override
    public BaseResp findById(Integer id) {
        Optional<Meal> byId = mealRepository.findById(id);
        if (byId.isPresent()){
            Meal meal = byId.get();
            baseResp.setCode(200);
            baseResp.setData(meal);
            return baseResp;
        }
        baseResp.setCode(2001);
        baseResp.setMessage("查询失败");
        return baseResp;
    }
}
