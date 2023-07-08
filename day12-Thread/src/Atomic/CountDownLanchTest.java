package Atomic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CountDownLanchTest {
    public static void main(String[] args) {
        // 定义一个计数器:构造方法中的3表示等待3条线程执行完毕
        CountDownLatch latch = new CountDownLatch(3);
        ArrayList<Integer> list = new ArrayList<Integer>();
        List<Integer> synchronizedList = Collections.synchronizedList(list);

        // 线程4统计上述线程的计算结果
        new Thread(()->{
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int num = 0;
            for (Integer count : synchronizedList) {
                num += count;

            }
            System.out.println(num);
        }).start();
        // 线程1 2 3 分别计算1-100的和
        for (int j = 0; j < 3; j++) {
            new Thread(() -> {
                int num = 0;
                for (int i = 1; i <= 100; i++) {
                    num += i;
                    System.out.println(Thread.currentThread().getName()+"正在累加"+i);
                }
                synchronizedList.add(num);
                // 每条线程做完自己的事情，计数器减
                latch.countDown();
            }).start();
        }


    }
}
