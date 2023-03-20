package com.toby.springboot.service;

import com.toby.springboot.decorator.HelloDecorator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloServiceTest {
    @Test
    public void simpleHelloService() throws Exception {
        // given
        SimpleHelloService helloService = new SimpleHelloService();
        // when
        String ret = helloService.sayHello("Test");
        // then
        assertThat(ret).isEqualTo("Hello Test");
    }

    @Test
    public void helloDecorator() throws Exception {
        // given
        HelloDecorator helloDecorator = new HelloDecorator(name -> name);
        // when
        String ret = helloDecorator.sayHello("Test");
        // then
        assertThat(ret).isEqualTo("*Test*");
    }
}