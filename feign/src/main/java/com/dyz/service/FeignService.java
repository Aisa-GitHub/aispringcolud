package com.dyz.service;

import com.dyz.bean.Student;
import com.dyz.service.impl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider",fallback = FeignServiceImpl.class)
public interface FeignService {
    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    @GetMapping("/student/index")
    String index();
}
