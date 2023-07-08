package com.hainiu.xy.test;

import javax.sound.sampled.Line;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//三.请编写一个程序，要求实现以下功能：
//1、创建一个HashSet集合，并通过键盘录入的方式向集合中添加一些字符串元素，录入数据时以字符串end作为结束标记。
//2、统计集合中每个字符串的长度，并将字符串作为键，长度作为值，存储在一个HashMap集合中。
//3、遍历输出HashMap集合中的键值对。
public class Test03 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        HashMap<String, Integer> map = new HashMap();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请添加一些字符串元素,以字符串end作为结束标记:");
            String str = scanner.nextLine();
            if (str.endsWith("end")) {
                break;

            }
            map.put(str, str.length());
        }
        System.out.println(map);
        map.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });


    }
}
