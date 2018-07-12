package com.dpf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Config_eureka7001_App {

    public static void main(String[] args) {
        SpringApplication.run(Config_eureka7001_App.class,args);
    }
}
