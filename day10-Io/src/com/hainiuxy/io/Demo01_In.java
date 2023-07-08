package com.hainiuxy.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01_In {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("D:\\Users\\admin\\IdeaProjects\\day10-Io\\text.txt");
//      / 读取一个字节 返回值表示读取到的字节值 如果到达末尾 返回-1
        int by;
        while ((by = in.read()) != -1) { // 读取 赋值 比较
            System.out.println((char) by);
            // 定义字节数组读取
            byte[] bytes = new byte[8192]; // 一般情况下1024的整数倍
            int len;
            while ((len = in.read(bytes)) != -1) {
                String s = new String(bytes, 0, len);
                System.out.println(s);
            }
//            int len = in.read(bytes); // 本次读取到的有效字节个数
//            System.out.println(len);
//
//            for (byte aByte : bytes) {
//                System.out.println(aByte);

        }
             in.close();
        }
}

