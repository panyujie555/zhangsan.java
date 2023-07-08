package com.hainiuxy.Api2;

import java.time.LocalDateTime;

public class Demo04_LocalDateTime {
    public static void main(String[] args) {
        //获取对象
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime2 = localDateTime.of(1998, 7, 19, 12, 12, 12);
        System.out.println(localDateTime2);
        //获取日期中每个字段的值
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        //将日期对象中的某个字段的值推移指定的时间。
        LocalDateTime localDateTime1 = localDateTime.plusYears(10);
        LocalDateTime localDateTime3 = localDateTime.plusYears(-10);
        LocalDateTime localDateTime4 = localDateTime.minusYears(-10);
        LocalDateTime localDateTime5 = localDateTime.minusYears(10);
        LocalDateTime localDateTime6 = localDateTime2.plusMonths(3);
        System.out.println(localDateTime1);
        System.out.println(localDateTime3);
        System.out.println(localDateTime4);
        System.out.println(localDateTime5);
        System.out.println(localDateTime6);


    }
}
