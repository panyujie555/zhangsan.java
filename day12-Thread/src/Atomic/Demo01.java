package Atomic;
//AtomicInteger 实现原子性，依赖CAS算法，比较并交换。 乐观锁。
import java.util.concurrent.atomic.AtomicInteger;

public class Demo01 {
    // 操作的共享资源
//    private static volatile int num = 0;
    private static AtomicInteger num= new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        // 开启10条线程，每条线程将变量自增1万次
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                for (int j = 0; j < 10000; j++) {
                    num.incrementAndGet();
                    /*
                    synchronized (Demo01.class) {
                        num++;
                    }
                    */
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(num.get());

    }

}
