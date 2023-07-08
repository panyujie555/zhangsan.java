package com.hainiuxy.Api;

import java.util.Scanner;

//4、模拟用户登录
public class LogIn {
    public static void main(String[] args) {
        String adminname = "panyujie";
        String word = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入用户名：");
            String usename = sc.nextLine();
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            if (usename.equals(adminname) && password.equals(word)) {
                System.out.println("恭喜您，登录成功,欢迎" + usename);
                break;
            }else{
                    System.out.println("密码错误，您还有" + (4 - i)+"次机会");
                }

            }


        }


    }

