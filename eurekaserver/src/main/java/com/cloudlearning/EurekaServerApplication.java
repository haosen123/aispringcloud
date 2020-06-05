package com.cloudlearning;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//声明该类Spring boot服务的入口
@SpringBootApplication
//声明该类是一个EurekaServer 微服务，提供服务注册和服务发现的功能
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
