package com.nongkeezhan.nkez;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nongkeezhan.nkez.dao")
public class NkezApplication {

    public static void main(String[] args) {
        SpringApplication.run(NkezApplication.class, args);
    }

}

