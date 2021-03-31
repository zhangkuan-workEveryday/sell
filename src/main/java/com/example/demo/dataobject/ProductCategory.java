package com.example.demo.dataobject;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
//java 持久化 api 中的注解，表明这是一个实体类，可以和@Table（name = ""）使用
//在Java data jpa中可以使用
@Entity
public class ProductCategory {
    @Id //表明主键，没有就会报错
    @GeneratedValue(strategy = GenerationType.IDENTITY)//表明主键的自增，就不会重复。
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    /**要含有默认无参构造函数和有参构造函数，否则会报错**/
    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
