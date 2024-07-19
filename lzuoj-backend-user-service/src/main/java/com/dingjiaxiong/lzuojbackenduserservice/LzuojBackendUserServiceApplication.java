package com.dingjiaxiong.lzuojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.dingjiaxiong.lzuojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.dingjiaxiong")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.dingjiaxiong.lzuojbackendserviceclient.service"})
public class LzuojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LzuojBackendUserServiceApplication.class, args);
    }

}
