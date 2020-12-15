package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.OrdersMapper;
import com.qf.dao.OrdersRepository;
import com.qf.pojo.Orders;
import com.qf.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrdersRepository ordersRepository;

    @Autowired
    OrdersMapper ordersMapper;
    @Override
    public BaseResp deleteById(Integer id) {
        ordersRepository.deleteById(id);

        BaseResp BaseResp = new BaseResp();
        BaseResp.setCode(200);
        BaseResp.setMessage("删除成功");
        return BaseResp;
    }

    @Override
    public BaseResp findByUserId(Integer page,Integer size,Integer userId) {
        PageRequest pageRequest = new PageRequest(page - 1, size);
        List<Orders> byUserId = ordersMapper.findByUserId(userId);

        BaseResp BaseResp = new BaseResp();
        if(byUserId != null){
            BaseResp.setMessage("根据userId查询订单成功");
            BaseResp.setCode(200);
            BaseResp.setData(byUserId);

            BaseResp.setTotal(Long.parseLong(byUserId.size()+""));
        }else{
            BaseResp.setMessage("根据userId查询订单失败");
            BaseResp.setCode(2001);
        }
        return BaseResp;
    }
}
