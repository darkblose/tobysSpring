package com.toby.springboot.controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class HelloControllerTest {
    @Test
    public void success() throws Exception {
        // given
        HelloController helloController = new HelloController(name -> name);
        // when
        String result = helloController.hello("Test");
        // then
        assertThat(result).isEqualTo("Test");
    }

    @Test
    public void exception() throws Exception {
        // given
        HelloController helloController = new HelloController(name -> name);
        // when
        // then
        assertThatThrownBy(() -> {
            helloController.hello(null);
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> {
            helloController.hello("");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}