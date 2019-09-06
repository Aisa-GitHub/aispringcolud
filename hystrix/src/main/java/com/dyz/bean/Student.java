package com.dyz.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: aispringcolud
 * @description:
 * @author: 狗十三
 * @create: 2019-09-05 12:42
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
   private long id;

   private String name;

   private int age;
}
