package com.example.demo.repository;

import com.example.demo.dataobject.ProductCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;


//作用，提供springboot上下文，提供一个可运行程序
@SpringBootTest
class ProductCategoryRepositoryTest {
    //自动装配
    @Autowired
    private ProductCategoryRepository repository;

    @Test
//    @Transactional  // @Transaction 防止懒加载机制
    @Lazy(value = false)
    public void findOneTest() {

        ProductCategory productCategory = repository.getOne(2);
        System.out.println(productCategory.toString());

    }


}