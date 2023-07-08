package com.hainiuxy.test;

import java.util.Random;

public class Test4 implements Runnable {

    //账户余额为5000
    private static int account = 5000;


    //实现Runnnable 接口
    @Override
    public void run() {
        //随机取出100、200、300、400或者500元，定义random方法
        Random random = new Random();
        //定义一个取钱的变量money，
        int money;
        money = random.nextInt(5) * 100 + 100;
        while (true) {
            synchronized (this) {
                if (account >= money) {
                    account -= money;
                    System.out.println(Thread.currentThread().getName() + "取出" + money + "元," + " 账户剩余:" + account + "元");
                }
                if (account <= money) {
                    break;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
