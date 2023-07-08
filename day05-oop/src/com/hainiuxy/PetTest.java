package com.hainiuxy;

import javax.xml.namespace.QName;

public class PetTest {
    public static void main(String[] args) {
        Dog d1 =new Dog();
        d1.name="大黄";
        d1.type="土狗";
        System.out.println(d1.getName());
        System.out.println(d1.getType());
        d1.drink();
        d1.eat();
        Dog d2 =new Dog("小黑","藏獒");


    }
}
