package com.lingyi.biz.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 咕噜科
 * ClassName: CapricornStartServer
 * date: 2022-06-08 21:59
 * Description:
 * version 1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.lingyi")
@MapperScan(basePackages = "com.lingyi.biz.integration.dao")
public class CapricornStartServer {
    public static void main(String[] args) {
        SpringApplication.run(CapricornStartServer.class);
        System.out.println("==Server start now==");
    }
}
