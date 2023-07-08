package com.hainiu.xy.test;

import javafx.beans.binding.When;

//四.	假设有一个银行账户，初始余额为1000元。
// 现在有两个人同时通过多线程方式从这个账户中取款，每次取款金额为100元。
// 要求编写Java多线程代码，模拟这个过程并确保线程安全，保证每次取款操作正确执行，即账户余额不会出现负值。
public class Test04 implements Runnable {
    private static int account = 1000;

    @Override
    public void run() {
        int money = 100;
        while (true) {
            synchronized (this) {
                if (money <= account) {
                    account -= money;
                    System.out.println(Thread.currentThread().getName() + "取出" + money + "元," + " 账户剩余:" + account + "元");
                }
                if ( account<=0) {
                    break;
                }
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
