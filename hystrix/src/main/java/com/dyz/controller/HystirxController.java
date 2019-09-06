package com.dyz.controller;

import com.dyz.bean.Student;
import com.dyz.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @program: aispringcolud
 * @description:
 * @author: 狗十三
 * @create: 2019-09-06 20:27
 **/
@RestController
@RequestMapping("/hystirx")
public class HystirxController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignService.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignService.index();
    }
}
