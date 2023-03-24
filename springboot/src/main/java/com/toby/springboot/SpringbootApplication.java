package com.toby.springboot;

import com.toby.config.annotation.MySpringBootApplication;
import org.springframework.boot.SpringApplication;

@MySpringBootApplication
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}