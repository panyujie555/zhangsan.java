package com.hainiuxy.thread1;

public class Ticktwindow implements Runnable {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {


                // 判断票是否卖光
                if (ticket <= 0) {
                    break;
                }
                //模拟售票执行的时间
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在售出第" + ticket + "张票");
                ticket--;
            }
        }

    }
}
