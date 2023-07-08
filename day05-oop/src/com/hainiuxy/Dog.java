package com.hainiuxy;

public class Dog extends Pet{
    public Dog() {
    }

    public Dog(String name, String type) {
        //将参数交给夫类初始化
        super(name, type);
    }
}
