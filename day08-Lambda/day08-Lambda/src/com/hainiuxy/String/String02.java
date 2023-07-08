package com.hainiuxy.String;

import java.util.Scanner;

//3、字符串遍历 -- 键盘录入一段文本，统计文本中有多少英文字母？
public class String02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段文本：");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            //获取每个字符
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z'||c >='A'&&c<='Z') {
                count++;

            }

        }
        System.out.println(count);
    }
}
