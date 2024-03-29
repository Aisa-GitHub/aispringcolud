package com.dyz.service.impl;

import com.dyz.bean.Student;
import com.dyz.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: aispringcolud
 * @description:
 * @author: 狗十三
 * @create: 2019-09-05 12:48
 **/
@Service
public class StudentServiceImpl implements StudentService {
     private static Map<Long,Student> studentMap;

     static{
       studentMap =  new HashMap<>();
       studentMap.put(1l,new Student(1L,"张三",22));
       studentMap.put(2l,new Student(2L,"李四",23));
       studentMap.put(3l,new Student(3L,"王五",24));
     }
    @Override
    public Collection<Student> findAll() {

        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
      studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
      studentMap.remove(id);
    }
}
