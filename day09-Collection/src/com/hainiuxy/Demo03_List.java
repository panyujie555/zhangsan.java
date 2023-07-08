package com.hainiuxy;

import java.util.ArrayList;

public class Demo03_List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hello");
        list.add("hi");
        list.add("haha");
        list.add("heihei");
//        ArrayList<String> list2 = new ArrayList<>(list);
//        System.out.println(list2);
        //指定索引位置添加
//        list.add(2,"data");
//        System.out.println(list);
        //指定索引位置删除
//        list.remove(2);
//        System.out.println(list);
//        //指定索引位置修改
//        list.set(2,"data2");
//        System.out.println(list);
//        //获取指定索引位置的数据
//        System.out.println(list.get(2));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        System.out.println("-----------");
        for (String s : list) {
            System.out.println(s);
        }
        // 集合对象提供的forEach方法，方法的参数是一个函数式接口
        // 该方法已经获取到集合中的每个元素，将这些元素传递给了Consumer接口的accept方法，
        // 而accept方法 需要我们实现。
        list.forEach(s -> System.out.println(s));


    }

}
