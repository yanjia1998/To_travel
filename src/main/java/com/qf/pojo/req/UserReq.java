package com.qf.pojo.req;

import lombok.Data;

/**
 * Created by 54110 on 2020/12/11.
 */
@Data
public class UserReq {

    private  Integer id;
    private String userName;
    private  String sex;
    private String password;
    private  String email;

    private String code;
}
