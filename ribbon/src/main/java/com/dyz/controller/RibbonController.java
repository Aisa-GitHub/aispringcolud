package com.dyz.controller;

import com.dyz.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @program: aispringcolud
 * @description:
 * @author: 狗十三
 * @create: 2019-09-06 14:35
 **/
@RestController
@RequestMapping
public class RibbonController {
   @Autowired
    private RestTemplate restTemplate;

   @GetMapping("/findAll")
   public Collection<Student> findAll(){
       return restTemplate.getForObject("http://provider/student/findAll",Collection.class);
   }

   @GetMapping("/index")
    public String index(){
       return restTemplate.getForObject("http://provider/student/index",String.class);
   }
}
