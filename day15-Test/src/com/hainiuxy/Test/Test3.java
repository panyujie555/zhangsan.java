package com.hainiuxy.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

//3、list转map集合
public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Tom", "80", "Jerry", "85", "Jack", "82", "Rose", "90", "John", "88", "Tony", "77");
        TreeMap<String, Integer> map = new TreeMap<>();
        // 利用迭代器遍历list
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            Integer integer = Integer.valueOf(it.next());
            map.put(next, integer);
        }
        map.forEach((k, v) -> {
            System.out.println(k +":"+ v);
        });
    }
}
