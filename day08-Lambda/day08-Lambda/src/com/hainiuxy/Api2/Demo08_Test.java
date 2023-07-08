package com.hainiuxy.Api2;

import java.util.Scanner;

public class Demo08_Test {


    public static void main(String[] args) {

        // 创建学生对象
        Scanner sc = new Scanner(System.in);

        Student stu = new Student();

        System.out.println("请输入姓名");
        String name = sc.nextLine();
        stu.setName(name);

        while (true) {
            System.out.println("请输入年龄");
            String ageStr = sc.nextLine();
            try {
                int age = Integer.parseInt(ageStr); // NumberFormatException
                stu.setAge(age); // 年uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu
                System.out.println(stu);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("年龄必须是整数，请重新输入");
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("年龄必须在18 到 40 之间");
            }
        }

        System.out.println("后续代码");

    }

}


