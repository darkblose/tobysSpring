package com.toby.config.autoconfig;

import com.toby.config.annotation.MyConfigurationProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MyConfigurationProperties(prefix = "server")
public class ServerProperties {
    private String contextPath;
    private int port;
}
