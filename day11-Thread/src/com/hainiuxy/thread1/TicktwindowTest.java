package com.hainiuxy.thread1;

public class TicktwindowTest {
    public static void main(String[] args) {
        Ticktwindow window = new Ticktwindow();
        new Thread(window,"窗口一").start();
        new Thread(window,"窗口二").start();
    }
}
