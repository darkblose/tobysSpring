package com.toby.springboot;

import com.toby.springboot.annotation.MySpringBootAnnotation;
import org.springframework.boot.SpringApplication;

@MySpringBootAnnotation
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}