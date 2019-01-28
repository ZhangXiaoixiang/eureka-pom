package com.demo.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

//依赖service扫描(扫描多了就失效了,注意)
@SpringBootApplication(scanBasePackages="com"/*,exclude = DataSourceAutoConfiguration.class*/)
@EnableEurekaClient
public class EurekaProviderApplication {

    public static void main(String[] args) {

        System.out.println("提供者发布服务: http://localhost:服务端口号");
        System.out.println("请输入提供者端口号:8080还是8081");
        Scanner scanner=new Scanner(System.in);
        String port = scanner.next();
       new SpringApplicationBuilder().properties("server.port="+port).run(args);

    }

}

