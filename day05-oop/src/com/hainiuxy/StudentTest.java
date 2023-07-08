package com.hainiuxy;

public class StudentTest {

//       创建对象的格式:
//               类名 对象名 = new 类名();
//      调用成员变量的格式:
//               对象名.变量名
//       调用成员方法的格式:
//               对象名.方法名();
public static void main(String[] args) {
    Student stu = new Student();
    //默认初始化值
    System.out.println(stu.name);//null
    System.out.println(stu.age);// 0

    stu.name="王零蛋";
    stu.age =25;

    System.out.println(stu.name);
    System.out.println(stu.age);

    stu.study();
}
}
