package com.dyz.service.impl;

import com.dyz.bean.Student;
import com.dyz.service.FeignService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @program: aispringcolud
 * @description:
 * @author: 狗十三
 * @create: 2019-09-06 16:48
 **/
@Service
@Component
public class FeignServiceImpl implements FeignService{

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器正在抢救中..";
    }
}
