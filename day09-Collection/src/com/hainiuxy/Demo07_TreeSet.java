package com.hainiuxy;

import java.util.TreeSet;

public class Demo07_TreeSet   {
    public static void main(String[] args) {
        // 保证元素唯一 要对元素排序  字符串的自然顺序

        TreeSet<Teacher> set= new TreeSet<>();

        Teacher t1 = new Teacher("Tom", 20);
        Teacher t2 = new Teacher("Lily", 21);
        Teacher t3 = new Teacher("John", 22);
        Teacher t4 = new Teacher("Lucy", 21);
        Teacher t5 = new Teacher("Jerry", 25);
        Teacher t6 = new Teacher("Jerry", 25);
        set.add(t1);
        set.add(t2);
        set.add(t3);
        set.add(t4);
        set.add(t5);
        set.add(t6);
        for (Teacher t : set) {
            System.out.println(t);
        }


        }


    }

