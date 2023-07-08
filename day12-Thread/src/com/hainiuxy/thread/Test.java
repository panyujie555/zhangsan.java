package com.hainiuxy.thread;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // 阻塞队列创建时必须指定容量
        ArrayBlockingQueue<Object> queue = new ArrayBlockingQueue<>(1);
        new Thread(new Cosumer(queue)).start();
        new Thread(new Producer(queue)).start();
    }
}
