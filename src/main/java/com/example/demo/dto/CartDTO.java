package com.example.demo.dto;

import lombok.Data;

@Data  //生成的构造器的参数，为对应的不为空的属性和fianl的属性
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}