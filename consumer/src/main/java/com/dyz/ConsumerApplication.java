package com.dyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @program: aispringcolud
 * @description:
 * @author: 狗十三
 * @create: 2019-09-05 22:58
 **/
@SpringBootApplication
public class ConsumerApplication {
      public static  void main(String [] args){
          SpringApplication.run(ConsumerApplication.class,args);
      }

      @Bean
    public RestTemplate restTemplate(){
          return new RestTemplate();
    }
}
