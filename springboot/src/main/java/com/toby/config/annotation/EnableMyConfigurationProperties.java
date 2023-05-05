package com.toby.config.annotation;

import com.toby.config.MyConfigurationPropertiesSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(MyConfigurationPropertiesSelector.class)
public @interface EnableMyConfigurationProperties {
    Class<?> value();
}
