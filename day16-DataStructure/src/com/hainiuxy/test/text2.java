package com.hainiuxy.test;

import com.sun.xml.internal.bind.v2.model.core.ID;

import javax.naming.Name;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//| 学号       | 姓名  | 年龄 |
//| ---------- | ----- | ---- |
//| 2023050501 | Tom   | 20   |
//| 2023050502 | Jerry | 19   |
//| 2023050503 | Jack  | 21   |
//| 2023050504 | Rose  | 18   |
//| 2023050505 | John  | 20   |
//请定义list集合，将以上每条信息以学生对象的方式存入集合中。并定义方法，实现对于输入的学号，判断该学号的学生是否存在。如果存在请获取该学生的所有信息，如果不存在，给出提示。
//
//
public class text2 {
    public static void main(String[] args) {
        //创建list集合，将学生对象存入集合
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("2023050501", "Tom", 20);
        Student student2 = new Student("2023050502", "Jerry", 19);
        Student student3 = new Student("2023050503", "Jack", 21);
        Student student4 = new Student("2023050504", "Rose", 18);
        Student student5 = new Student("2023050505", "John", 20);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号:");
        String studentid = sc.nextLine();
        Student result = check(studentid, studentList);
        if (result != null) {
            System.out.println("学生信息:");
            System.out.println("学号:" + result.getId()+ ",姓名:" +result.getName()+ ",年龄:" + result.getAge());
        } else {
            System.out.println("没有学号为" + studentid + "的学生");
        }
    }


    //定义一个检查学号的方法 check
    public static Student check(String id, List<Student> studentList) {
        for (Student student : studentList) {
            if (id.equals(student.getId())) {
                return student;
            }
        }
        return null;
    }
}
