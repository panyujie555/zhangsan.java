package com.hainiuxy.Generic2;

public class GenericInterImpl<T> implements GenericInter<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
