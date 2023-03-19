package com.toby.springboot.controller;

import com.toby.springboot.service.HelloService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello(String name) {

        if (StringUtils.hasText(name)) {
            return helloService.sayHello(name);
        }
        throw new IllegalArgumentException();
    }
}
