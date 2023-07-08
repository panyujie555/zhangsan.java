package com.hainiuxy.test;

public class test44 {
    public static void main(String[] args) {
        Test4 test = new Test4();

        Thread thread1 = new Thread(test, "甲");
        Thread thread2 = new Thread(test, "乙");

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }

