package com.hainiuxy.Api2;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo06_Regex {
    public static void main(String[] args) {

        // 将正则表达式编译 获取 Pattern 对象
        Pattern pattern = Pattern.compile("a*b"); // b  ab aab aaab

        // 获取解释和匹配字符串的匹配器
        Matcher matcher = pattern.matcher("aabc"); // b ab aab

        boolean matches = matcher.matches();
        System.out.println(matches);


//        public boolean find()
//            尝试查找与模式匹配的输入序列的下一个子序列
//        public String group()
//            返回上一个匹配项匹配的输入子序列
        boolean b = matcher.find();

        System.out.println(b);
        String s = matcher.group();
        System.out.println(s);

        String str = "张三的电话号码是：13877778888，" +
                "李四的电话号码是：13966669999，" +
                "王五的电话号码是：18898765432。";
        Pattern pattern1 = Pattern.compile("1[3|5-9]\\d{9}");
       Matcher matcher2 = pattern1.matcher(str);
        //循环查找
        while (matcher2.find()) {
            String s1 = matcher2.group();
            System.out.println(s1);

        }
    }
}
