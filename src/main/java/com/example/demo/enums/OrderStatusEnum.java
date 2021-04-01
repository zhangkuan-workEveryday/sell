package com.example.demo.enums;


import lombok.Getter;

@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1, "完结"),
    CANCEL(2,"已取消");

    /*订单的状态码*/
    private Integer code;

    /*订单对应的信息*/
    private String msg;

    private OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
