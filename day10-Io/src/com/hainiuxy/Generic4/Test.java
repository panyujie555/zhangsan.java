package com.hainiuxy.Generic4;

import java.util.Comparator;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Student,String> map = new TreeMap<Student,String>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        map.put(new Student("Tom"), "aaa");
        map.put(new Student("Tony"), "dccc");
        map.put(new Student("Kevin"), "bnbb");

        map.forEach((k,v)->{
            System.out.println(k+" ="+v);
        });

    }

}
