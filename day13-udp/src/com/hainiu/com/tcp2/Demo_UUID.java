package com.hainiu.com.tcp2;

import java.util.UUID;

public class Demo_UUID {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String s = UUID.randomUUID().toString().replaceAll("-", "");
            System.out.println(s);
        }
    }

}
