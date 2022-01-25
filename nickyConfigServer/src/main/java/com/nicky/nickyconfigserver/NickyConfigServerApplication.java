package com.nicky.nickyconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class NickyConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NickyConfigServerApplication.class, args);
    }

}
