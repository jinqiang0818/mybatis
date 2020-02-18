package com.example.mybatis.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


//配置druid必须加的注解，如果不加，访问页面打不开，filter和servlet、listener之类的需要单独进行注册才能使用，spring boot里面提供了该注解起到注册作用@MapperScan("microservice.qssj.mapper")
// 必须加这个，不加报错，如果不加，也可以在每个mapper上添加@Mapper注释，//这里还要添加一个总的注解，具体忘记了
@MapperScan("com.example.mybatis.mybatis.dao")
@ServletComponentScan
@SpringBootApplication
public class MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }

}
