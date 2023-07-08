package com.hainiuxy.String;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行数据：");
        String str = sc.nextLine();
        int count =0;
        for (int i = 0; i <str.length() ; i++) {
            //获取每个字符
            char c = str.charAt(i);
            if(c>='a'&&c<='z'){
                count++;
                if (c>='A'&&c<='Z'){
                    count++;
                }

            }

        }
        System.out.println(count);
    }
}
