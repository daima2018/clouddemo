package com.dpf.cloud;

import com.dpf.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(value = "CLOUDDEMO-DEPT",configuration = MyRule.class)
public class DeptConsumer8080_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer8080_App.class,args);
    }
}
