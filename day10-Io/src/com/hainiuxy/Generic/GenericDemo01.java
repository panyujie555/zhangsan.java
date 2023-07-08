package com.hainiuxy.Generic;

///**
// * @author HaiNiu
// * @description 泛型类使用  创建对象时明确数据类型(对象类型)
// */
public class GenericDemo01 {
    public static void main(String[] args) {
       Generic<String> g1 = new Generic<String>();
       g1.setT("hello");
        System.out.println(g1.getT());
        Generic<Integer> g2 = new Generic<Integer>();
        g2.setT(123);
        System.out.println(g2.getT());
        Generic<Boolean> g3 = new Generic<Boolean>();
        g3.setT(true);
        System.out.println(g3.getT());

    }
}
