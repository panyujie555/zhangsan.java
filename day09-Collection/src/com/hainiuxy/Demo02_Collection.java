package com.hainiuxy;

import java.util.ArrayList;
import java.util.Iterator;

// 获取此集合中元素的迭代器
public class Demo02_Collection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hello");
        list.add("hi");
        list.add("haha");
        list.add("heihei");

        // 遍历，通过集合对象获取迭代器
        Iterator<String> it = list.iterator();
        // boolean hasNext(); -- 判断是否有下一个元素
        // E next(); -- 获取下一个元素
        while (it.hasNext()) {
            String s1 = it.next();
//            String s2 = it.next();
            System.out.println(s1);
//            System.out.println(s2);

            System.out.println("--------------------------------");
            //fou-each增强for循环
            for (String s : list) {
                System.out.println(s);


                System.out.println("----------------");
                int[] arr = new int[]{1, 2, 3, 4, 5, 6};
                for (int i : arr) {
                    System.out.println(i);

                }

            }


        }


    }


}




