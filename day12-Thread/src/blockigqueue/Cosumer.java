package blockigqueue;

import com.hainiuxy.thread.Producer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Cosumer implements Runnable {
    private LinkedBlockingQueue<Object> queue;

    public Cosumer(LinkedBlockingQueue<Object> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            try {
                queue.put("产品"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("生产一个产品，目前队列中剩余产品：" + queue.size());
        }

    }
}
