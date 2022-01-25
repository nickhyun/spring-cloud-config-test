package com.nicky.nickyconfigclient;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "nick")
public class NickyConfig {
    private String base1;
    private String base2;
    private String alpha;
    private String beta;

}
