package com.dyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @program: aispringcolud
 * @description:
 * @author: 狗十三
 * @create: 2019-09-05 23:57
 **/
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String []args){
        SpringApplication.run(ZuulApplication.class,args);
    }
}
