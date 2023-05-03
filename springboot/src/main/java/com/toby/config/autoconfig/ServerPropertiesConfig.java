package com.toby.config.autoconfig;

import com.toby.config.annotation.MyAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@MyAutoConfiguration
public class ServerPropertiesConfig {

    @Bean
    public ServerProperties serverProperties(Environment environment) {
        ServerProperties serverProperties = new ServerProperties();
        serverProperties.setContextPath(environment.getProperty("contextPath"));
        serverProperties.setPort(Integer.parseInt(environment.getProperty("port")));
        return serverProperties;
    }
}
