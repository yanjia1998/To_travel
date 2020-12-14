package com.qf.dao;

import com.qf.pojo.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Wang on 2020/12/14 14:09
 */
public interface CityBaseResponse extends JpaRepository<City,Integer> {


}
