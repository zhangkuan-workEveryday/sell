package com.example.demo.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;

    /**名字.**/
    private String productName;

    /**单价.**/
    private BigDecimal productPrice;

    /**库存*/
    private String productDescription;
    private Integer productStock;

   /**小图**/
    private String productIcon;

    /** 状态, 0表示正常，1下架 **/
    private Integer productStatus;

    /**类目编号*/
    private Integer categoryType;


}
