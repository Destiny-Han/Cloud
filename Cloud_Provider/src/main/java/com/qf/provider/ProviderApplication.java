package com.qf.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : 韩博
 * @program : Cloud
 * @description :
 * @create : 2020-11-24 17:02:00
 */
@SpringBootApplication
@EnableDiscoveryClient//发现和注册服务
@MapperScan(basePackages = "com.qf.provider.dao")
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
