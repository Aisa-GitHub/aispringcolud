package com.dyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: aispringcolud
 * @description:
 * @author: 狗十三
 * @create: 2019-09-06 20:58
 **/
@SpringBootApplication
//声明配置中心
@EnableConfigServer
public class NativeConfigServerApplication {
       public static void main(String[]args){
           SpringApplication.run(NativeConfigServerApplication.class,args);
       }
}
