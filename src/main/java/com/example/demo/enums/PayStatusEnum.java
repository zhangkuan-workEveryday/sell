package com.example.demo.enums;

import lombok.Getter;

@Getter
public enum PayStatusEnum {
    WAIT(0,"支付等待"),
    SUCCESS(1,"支付成功");

    /*表示状态码*/
    private Integer code;

    /*表示信息*/
    private String msg;

    private PayStatusEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
