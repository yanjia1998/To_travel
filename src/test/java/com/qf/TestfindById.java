package com.qf;

import com.qf.commen.BaseResponse;
import com.qf.dao.CityMapper;
import com.qf.pojo.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Wang on 2020/12/14 17:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestfindById {

    @Autowired
    CityMapper cityMapper;

    /*@Test
    public void testfindById(){
        BaseResponse byId = cityMapper.findById(1);
        System.out.println("byId = " + byId);
    }*/
}
