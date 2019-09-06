package com.dyz.service;

import com.dyz.bean.Student;

import java.util.Collection;
import java.util.List;

public interface StudentService {
     Collection<Student> findAll();

     Student findById(long id);

     void saveOrUpdate(Student student);

     void deleteById(long id);
}
