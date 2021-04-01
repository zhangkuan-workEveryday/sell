package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//这是项目的启动类：类面包含@Configuration, @ComponentScan, @Import
//这是个主配置类：能将次配置类当作是个bean组件加载进来。
@SpringBootApplication
public class SellApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellApplication.class, args);
    }

}
