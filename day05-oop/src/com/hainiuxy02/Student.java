package com.hainiuxy02;

public class Student {
    String name;
    private int age;

    //提供get set 方法
    public void setAge(int a) {
        if (a < 0 || a > 120) {
            System.out.println("您输入的年龄有误");
        }else {
            age = a;
        }
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(name + ","+ age);
    }

}

