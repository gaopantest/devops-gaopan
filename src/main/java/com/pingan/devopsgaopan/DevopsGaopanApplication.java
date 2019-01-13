package com.pingan.devopsgaopan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.pingan.devopsgaopan")
public class DevopsGaopanApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevopsGaopanApplication.class, args);
    }

}

