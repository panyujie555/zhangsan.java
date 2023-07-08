package Atomic;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Demo02 {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(3);
        new Thread(() -> {
            try {
                sem.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"获取许可证，开始执行");
            try {
                Thread.sleep(new Random().nextInt(1000 ));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"运行完毕，归还许可证");
            sem.release();
        }).start();
        for (int i = 0; i < 100; i++) {
            new Thread().start();

        }

    }
}
