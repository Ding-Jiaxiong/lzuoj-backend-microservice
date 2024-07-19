package com.dingjiaxiong.lzuojbackendjudgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.dingjiaxiong")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.dingjiaxiong.lzuojbackendserviceclient.service"})
public class LzuojBackendJudgeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LzuojBackendJudgeServiceApplication.class, args);
    }

}