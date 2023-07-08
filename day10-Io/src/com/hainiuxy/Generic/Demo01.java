package com.hainiuxy.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HaiNiu
 * @description 泛型类
 *
 * 以集合为例
 *      List 元素可以是任意类型，设置为Object类型
 *
 */
public class Demo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
//        list.add(100);ClassCastException
//        list.add( new Object());
        for (String o : list) {
            System.out.println(o);
            System.out.println(o.length());
        }
}
}

