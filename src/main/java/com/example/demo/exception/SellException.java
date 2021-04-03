package com.example.demo.exception;

import com.example.demo.enums.ResultEnum;

public class SellException extends RuntimeException{

    private Integer code;

    //默认构造器
    public SellException() {}

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
