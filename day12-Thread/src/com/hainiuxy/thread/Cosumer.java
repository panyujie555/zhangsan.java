package com.hainiuxy.thread;

import java.util.concurrent.ArrayBlockingQueue;

public class Cosumer implements Runnable {
    private ArrayBlockingQueue<Object> queue;


    public Cosumer(ArrayBlockingQueue<Object> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            Object data = null;
            try {
                data = queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费一个产品" + data + "目前队列中剩余产品:" + queue.size());
        }
    }
}
