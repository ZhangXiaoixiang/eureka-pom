package com.demo.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {

        System.out.println("注册与发现服务控制台:请选择slave1 \t http://localhost:8761还是:\nslave2 \t http://localhost:8761");
        Scanner scanner=new Scanner(System.in);
        String profiles = scanner.next();
//        加载选择的服务器
        new SpringApplicationBuilder(EnableEurekaServer.class).properties(profiles).run(args);

    }

}

