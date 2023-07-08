package blockigqueue;

import java.util.concurrent.LinkedBlockingQueue;

public class Test {
    public static void main(String[] args) {
        LinkedBlockingQueue<Object>queue = new LinkedBlockingQueue<Object>(1);
   new Thread(new Cosumer(queue)).start();
   new Thread(new Producer(queue)).start();

    }
}
