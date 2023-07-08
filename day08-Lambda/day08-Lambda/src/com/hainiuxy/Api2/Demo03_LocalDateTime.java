package com.hainiuxy.Api2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//3、JDK8新增日期类
//    LocalDateTime
//        获取对象 -- now（当前系统时间）  of（指定时间）  parse(解析字符串得到时间)
//        获取每个日期字段 -- getXxx();
//        推移时间 plusXxx()
//        格式化 -- DateTimeFormatter   format方法
public class Demo03_LocalDateTime {
    public static void main(String[] args) {
        //获取对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //日期格式化类获取对象
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //格式化字符串
        String s = formatter.format(now);
        System.out.println(s);
        System.out.println("----------" );
        //把字符串解析成对象
        //规范格式化
        String s1 = "2023年6月17日 20:38:50";
        LocalDateTime dateTime = LocalDateTime.parse(s1, DateTimeFormatter.ofPattern("yyyy年M月dd日 HH:mm:ss"));
        System.out.println(dateTime);


    }


}
