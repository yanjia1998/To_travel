package com.qf.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * @USER: Tian
 * @DATE: 2020/12/15 9:37
 */
@Data
@Entity
@Table(name = "meal")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "meal_name")
    private String mealName;
    @Column(name = "meal_price")
    private Double mealPrice;
    @Column(name = "meal_intro")
    private String mealIntro;
    @Column(name = "meal_pic")
    private String mealPic;
    @Column(name = "meal_explain")
    private String mealExplain;
    @Column(name = "meal_booking")
    private String mealBooking;
    @Column(name = "meal_pic1")
    private String mealPic1;
    @Column(name = "meal_pic2")
    private String mealPic2;
}
