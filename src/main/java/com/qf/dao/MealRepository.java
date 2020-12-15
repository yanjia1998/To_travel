package com.qf.dao;

import com.qf.pojo.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @USER: Tian
 * @DATE: 2020/12/15 9:53
 */

public interface MealRepository extends JpaRepository<Meal,Integer> {
}
