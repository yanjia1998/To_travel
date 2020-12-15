package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrdersController {

    @Autowired
    OrdersService ordersService;

    @RequestMapping(value = "/deleteById",method = RequestMethod.POST)
    public BaseResp deleteById(@RequestBody Map map){
        return ordersService.deleteById((Integer)map.get("id"));
    }
    @RequestMapping(value = "/findByUserId",method = RequestMethod.POST)
    public BaseResp findByUserId(@RequestBody Map map){
        return ordersService.findByUserId((Integer)map.get("page"),(Integer)map.get("size"),(Integer)map.get("userId"));
    }

}
