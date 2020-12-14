package com.qf.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Wang on 2020/12/14 14:07
 */
@Data
@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "city_name")
    private String cityName;
}
