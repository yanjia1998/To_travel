package com.qf.common;

import lombok.Data;

/**
 * Created by Wang on 2020/12/14 14:10
 */
@Data
public class BaseResponse {

    private Integer code;

    private Object data;

    private String message;

    private Long total;
}