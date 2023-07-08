package com.hainiuxy;

import java.util.HashMap;

public class Demo11_HashMap {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<Student, String>();

        map.put(new Student("Tom", 20), "北京");
        map.put(new Student("Jerry", 21), "上海");
        map.put(new Student("Jack", 22), "天津");
        map.put(new Student("Jack", 20), "广州");
        map.put(new Student("Jack", 20), "重庆");
        map.forEach((k, v) -> {
            System.out.println(k + "= " + v);
        });
    }
}
