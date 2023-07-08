package com.hainiuxy02;

public class Student03 {
     String name;
     int age;

    public Student03(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("我是Student的构造方法");
    }

    public void show (){
        System.out.println(name+ "..."+age);
    }
}
