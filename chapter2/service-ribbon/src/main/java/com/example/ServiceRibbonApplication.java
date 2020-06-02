package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 通过@EnableDiscoveryClient向服务中心注册；并且向程序的ioc注入一个bean
 * @author xiaobu
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonApplication.class, args);
    }


    /***
     * @author xiaobu
     * @date 2018/11/6 11:32
     * @return org.springframework.web.client.RestTemplate
     * @descprition restTemplate;并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
     * @version 1.0
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
