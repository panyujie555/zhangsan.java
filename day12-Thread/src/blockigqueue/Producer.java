package blockigqueue;

import javax.xml.crypto.Data;
import java.util.concurrent.LinkedBlockingQueue;

public class Producer implements Runnable {
    private LinkedBlockingQueue<Object>queue;
    public Producer(LinkedBlockingQueue<Object> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            Object data = null;
            try {
                data=queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费一个产品【" + data + "】，目前队列中剩余产品：" + queue.size());
        }

    }
}
