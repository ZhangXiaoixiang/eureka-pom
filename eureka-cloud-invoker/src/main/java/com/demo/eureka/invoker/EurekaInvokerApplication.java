package com.demo.eureka.invoker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaInvokerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaInvokerApplication.class, args);
        System.out.println("----------------------------没有加入监测的-----------------------------");
        System.out.println("服务调用者: http://localhost:9000/router");

        System.out.println("测试不成功补救调试:http://localhost:8080/person/10086");
        System.out.println("服务调用者: http://localhost:9000/getPlayerInfoList");

    }

}

