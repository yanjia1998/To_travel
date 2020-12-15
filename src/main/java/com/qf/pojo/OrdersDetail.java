package com.qf.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class OrdersDetail {

    private Integer id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date departureDate;
    private Integer userId;
    private Integer scenicId;
    private String userEmail;
    private Integer userFlag;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date userForbid;
    private String userHead;
    private String userName;
    private String userPassword;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date userRegist;
    private String userSex;
    private Double scenicCost;
    private String scenicDesc;
    private String scenicName;
    private String scenicPic;
}
