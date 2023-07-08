package com.hainiuxy;

import org.omg.CORBA.StringHolder;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo12_TreeMap {
    public static void main(String[] args) {
        TreeMap<Student, String> map = new TreeMap<Student, String>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //名字长度
                int num = o1.getName().length() - o2.getName().length();
                //年龄大小
                if (num == 0) {
                    num = o1.getAge() - o2.getAge();
                }
                if (num == 0) {
                    num = o1.getName().compareTo(o2.getName());
                }
                return num;
            }
        });

        map.put(new Student("Tom", 20), "北京");
        map.put(new Student("Jerry", 21), "上海");
        map.put(new Student("Jack", 22), "天津");
        map.put(new Student("Jack", 20), "广州");
        map.put(new Student("Jack", 20), "重庆");

        map.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });

    }


}
