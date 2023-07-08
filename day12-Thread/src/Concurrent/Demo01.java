package Concurrent;
//在1.8中，ConcurrentHashMap底层数据结构不再采用segment数组，也不再采用分段锁。而是采用 数组+链表+红黑树来实现，锁也从分段锁提升成了节点锁，粒度更细。使用CAS+synchronized来保证线程安全
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

//如果需要线程安全的高度并发实现，则建议使用ConcurrentHashMap代替Hashtable。
public class Demo01 {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();
        Thread t1 =new Thread(()->{
            for (int i = 0; i <= 10; i++) {
                map.put(String.valueOf(i),String.valueOf(i));
            }
        });
        Thread t2 =new Thread(()->{
            for (int i = 11; i <= 20; i++) {
                map.put(String.valueOf(i),String.valueOf(i));
            }
        });
        t1.start();
        t2.start();
        Thread.sleep(1000);
        for (int i = 1; i <=20 ; i++) {
            System.out.println(i+"");

        }

    }
}
