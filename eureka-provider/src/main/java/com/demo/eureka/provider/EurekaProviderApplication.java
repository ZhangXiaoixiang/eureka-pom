package com.demo.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//依赖service扫描(扫描多了就失效了,注意)
@SpringBootApplication(scanBasePackages="com"/*,exclude = DataSourceAutoConfiguration.class*/)
@EnableEurekaClient
public class EurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class, args);
        System.out.println("提供者发布服务: http://localhost:8761");
    }

}

