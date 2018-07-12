package com.dpf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker  //对熔断机制对支持
public class DeptProvider8002_Hystrix_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_Hystrix_App.class,args);
    }
}
