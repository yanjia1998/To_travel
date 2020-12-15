package com.qf.dao;

import com.qf.pojo.Scenic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Wang on 2020/12/14 14:42
 */
public interface ScenicRepository extends JpaRepository<Scenic,Integer> {

    List<Scenic> findByScenicNameLike(String scenicName);
}
