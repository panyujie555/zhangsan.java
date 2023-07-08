package com.hainiu.xy.test;

import java.util.Scanner;

//一.编写一个Java程序，使用循环结构生成一个菱形图案，要求用户输入菱形的行数。
//菱形图案的每一行由空格和星号（*）组成，其中空格用于对齐星号。
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数:");
        int han = sc.nextInt();
        // 上半部分
        for (int i = 1; i <= han; i++) {
            // 打印空格
            for (int j = 1; j <= han - i; j++) {
                System.out.print(" ");
            }
            // 打印星号
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 下半部分
        for (int i = han - 1; i >= 1; i--) {
            // 打印空格
            for (int j = 1; j <= han - i; j++) {
                System.out.print(" ");
            }
            // 打印星号
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
