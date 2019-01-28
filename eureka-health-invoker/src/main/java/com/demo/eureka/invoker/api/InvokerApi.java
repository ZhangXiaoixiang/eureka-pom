package com.demo.eureka.invoker.api;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * InvokerApi
 *
 * @author 10905 2019/1/26
 * @version 1.0
 */
@RestController
@Configuration
public class InvokerApi {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTempalte(){
        return  new RestTemplate();
    }


    @RequestMapping(value = "/router",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public String router(){
        RestTemplate restTemplate=getRestTempalte();
//        服务名称调用
        String json = restTemplate.getForObject("http://provider/person/10086", String.class);
        return json;

    }
    @RequestMapping(value = "/getPlayerInfoList",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getPlayerInfoList(){
        RestTemplate restTemplate=getRestTempalte();
//        服务名称调用
        String json = restTemplate.getForObject("http://provider/getPlayerInfoList/1/5", String.class);
        return json;

    }







}
