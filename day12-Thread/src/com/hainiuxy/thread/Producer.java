package com.hainiuxy.thread;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Producer implements Runnable{
    //有界队列
    private ArrayBlockingQueue<Object>queue;

    public Producer(ArrayBlockingQueue<Object> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            try {
                queue.put("产品："+i);
                System.out.println("生产一个产品，目前队列中剩余产品：" + queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

