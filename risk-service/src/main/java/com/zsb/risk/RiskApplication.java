package com.zsb.risk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.zsb.risk.mapper")
public class RiskApplication {
    public static void main(String[] args) {
        SpringApplication.run(RiskApplication.class, args);
    }
}
