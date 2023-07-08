package com.hainiuxy.Test;
//4、小牛收集到部分水浒英雄的卡片，我们以List集合中存储字符串数据来表示，
// 如下：请编写程序，开启3条线程，每条线程的任务都是从集合中取出（需要从集合中移除）第一张英雄卡片，每次取卡需要耗时0.1秒，直到取完为止。
//要求程序可以正常执行，并且在多次执行的过程中不会出现异常情况。

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test4GetHeroCards implements Runnable {
    //定义一个获取英雄卡的方法，加锁保证线程安全
    public static List<String> Getherocards = Collections.synchronizedList(new LinkedList<>());

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("及时雨宋江");
        list.add("玉麒麟卢俊义");
        list.add("智多星吴用");
        list.add("入云龙公孙胜");
        list.add("大刀关胜");
        list.add("豹子头林冲");
        list.add("霹雳火秦明");
        list.add("双鞭呼延灼");
        list.add("小李广花荣");
        list.add("小旋风柴进");
        list.add("扑天雕李应");
        list.add("美髯公朱仝");
        list.add("花和尚鲁智深");
        list.add("行者武松");
        //开启三条线程
        Test4GetHeroCards example = new Test4GetHeroCards();
        Thread thread1 = new Thread(example,"线程A");
        Thread thread2 = new Thread(example,"线程B");
        Thread thread3 = new Thread(example,"线程C");
        thread1.start();
        thread2.start();
        thread3.start();
        //将list中的元素放进英雄卡池
        Getherocards.addAll(list);
    }

    @Override
    public void run() {
        while (Getherocards.size()!= 0) {
            synchronized (Getherocards) {
                if (Getherocards.size()!= 0) {
                    String s = Getherocards.remove(0);
                    System.out.println( Thread.currentThread().getName() + "获得英雄" + s);
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
