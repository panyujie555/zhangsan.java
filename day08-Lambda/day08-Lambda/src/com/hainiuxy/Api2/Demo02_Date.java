package com.hainiuxy.Api2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

///2、Date类 与 字符串的互换
//    格式化
//    解析
public class Demo02_Date {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);//Sat Jun 17 20:06:48 CST 2023
        long time = date.getTime();
        System.out.println(time);

        date.setTime(date.getTime() + 24L * 60 * 60 * 1000);
        System.out.println(date);
        System.out.println("---");
        //日期对象和字符串之间的转换  日期对象--字符串 格式化format    字符串--日期对象 解析parse
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(date);
        System.out.println(s);

        //         字符串--日期对象 解析parse
        String str = "2023-06-18 20:10:15";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date1 = sdf2.parse(str);

        System.out.println(date1);


    }

}
