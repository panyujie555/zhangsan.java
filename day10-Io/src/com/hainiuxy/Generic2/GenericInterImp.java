package com.hainiuxy.Generic2;

public class GenericInterImp implements GenericInter<String> {

    @Override
    public void show(String s) {
        System.out.println(s);
    }
}