package com.hainiu.xy.test;

public class Threadtest {
    public static void main(String[] args) {
        Test04 test = new Test04();
        Thread thread1 = new Thread(test,"甲");
        Thread thread2 = new Thread(test,"乙");
        thread1.start();
        thread2.start();

    }
}
