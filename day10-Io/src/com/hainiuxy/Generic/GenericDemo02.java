package com.hainiuxy.Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GenericDemo02 {
    public static void main(String[] args) {

      test("abc");
      test(100);
      test(new Object());
        System.out.println("--------------------------------");
        // Collection 方法：   <T> T[] toArray(T[] a) -- 集合转成指定类型的数组
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "abc", "hello", "123");

        String[] arr = new String[list.size()];
        list.toArray(arr);
        for (String s : arr) {
            System.out.println(s);
        }





    }

    // 在方法的声明上单独出现的泛型 -- 在返回值的前面声明
    public static <T> void test(T t) {
        System.out.println(t);
    }


    }


