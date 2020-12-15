package com.qf.service;

import com.qf.common.BaseResp;
import com.qf.pojo.Meal;

/**
 * @USER: Tian
 * @DATE: 2020/12/15 9:54
 */

public interface MealService {
    BaseResp findById(Integer id);
}
