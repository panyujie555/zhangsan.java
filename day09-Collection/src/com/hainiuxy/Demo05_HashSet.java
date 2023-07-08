package com.hainiuxy;

import java.util.HashSet;
import java.util.Iterator;

public class Demo05_HashSet {
    public static void main(String[] args) {
        //保证元素不重复
        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("javase");
        set.add("java");
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);

        }
        System.out.println("--------------------------------");
        for (String s : set) {
            System.out.println(s);
        }









    }
}
