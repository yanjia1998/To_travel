package com.qf.pojo;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Wang on 2020/12/14 14:34
 */
@Data
@Entity
@Table(name = "scenic")
public class Scenic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "scenic_name")
    private String scenicName;

    @Column(name = "scenic_cost")
    private BigDecimal scenicCost;

    @Column(name = "scenic_pic")
    private String scenicPic;

    @Column(name = "scenic_desc")
    private String scenicDesc;
}
