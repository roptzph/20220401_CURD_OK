package com.lccw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lccw.mapper")  //不写不行。但此处写mapper包，写类名称启动就失败
public class Curd0331Application {

    public static void main(String[] args) {
        SpringApplication.run(Curd0331Application.class, args);
    }

}
