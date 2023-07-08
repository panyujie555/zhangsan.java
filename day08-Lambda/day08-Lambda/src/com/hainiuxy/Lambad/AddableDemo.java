package com.hainiuxy.Lambad;

import com.sun.org.apache.xerces.internal.impl.dv.XSSimpleType;

public class AddableDemo {
    public static void main(String[] args) {
        //Lambda表达式

        useAddable((int a, int b) -> {
            return a + b;
        });
    }

    private static void useAddable(Addable add) {
        int sum = add.add(20, 60);
        System.out.println(sum);
    }
}
