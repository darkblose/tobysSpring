package com.toby.springboot.service;

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
}