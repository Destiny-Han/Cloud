package com.qf.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : 韩博
 * @program : Cloud
 * @description :
 * @create : 2020-11-24 19:54:00
 */
@SpringBootApplication//启动类
@EnableDiscoveryClient//发现和注册服务
@EnableFeignClients//启动OpenFeign 实现服务的远程调用
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
