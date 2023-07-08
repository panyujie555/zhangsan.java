package com.hainiuxy.Api;

public class Demo01_Object {
    public static void main(String[] args) {
        Object o = new Object();
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);
        System.out.println(s1.equals(s2));
        Student s3 = new Student("李四", 19);
        Student s4 = new Student("李四", 19);

        System.out.println(s3.equals(s4));
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s1);
        System.out.println(s1.toString());
        int age =10;
        System.out.println("我的年龄是："+age);
        System.out.println("对象是："+new Object());

    }

}
