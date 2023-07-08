package com.hainiuxy.Generic;

public class Generic<T> {
    // 在类中就把 T 类型 当成 Object 类型使用即可
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;

    }
}


