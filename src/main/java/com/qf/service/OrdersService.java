package com.qf.service;

import com.qf.common.BaseResp;

public interface OrdersService {
    BaseResp deleteById(Integer id);

    BaseResp findByUserId(Integer page, Integer size, Integer userId);
}
