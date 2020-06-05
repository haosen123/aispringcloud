package com.cloudlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy            //设置该类为网关启动类
@EnableAutoConfiguration    //帮助Spring boot应用所有符合条件的@Configuration配置加载到当前Spring Boot创建并使用到Ioc容器
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
