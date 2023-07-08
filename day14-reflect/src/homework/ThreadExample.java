package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//4、小牛收集到部分水浒英雄的卡片，我们以List集合中存储字符串数据来表示，如下：
public class ThreadExample implements Runnable{
    private static List<String> heroCards = Collections.synchronizedList(new ArrayList<>());
    public static void main(String[] args) {
//
         Collections.addAll(heroCards,"及时雨宋江", "玉麒麟卢俊义", "智多星吴用", "入云龙公孙胜", "大刀关胜", "豹子头林冲", "霹雳火秦明", "双鞭呼延灼", "小李广花荣", "小旋风柴进", "扑天雕李应", "美髯公朱仝", "花和尚鲁智深", "行者武松");
        ThreadExample example = new ThreadExample();
        //开启三条线程
        Thread thread1 = new Thread(example,"thread1");
        Thread thread2 = new Thread(example,"thread2");
        Thread thread3 = new Thread(example,"thread3");
        thread1.start();
        thread2.start();
        thread3.start();


        }



    @Override
    public void run() {
        while (heroCards.size()!=0){
            synchronized (heroCards) {
                if (heroCards.size()!=0){
                    String s = heroCards.remove(0);
                    System.out.println("线程"+Thread.currentThread().getName()+"获得英雄"+s);

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
