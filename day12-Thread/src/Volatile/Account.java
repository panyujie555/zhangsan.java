package Volatile;

public class Account {
    //余额100
    private  volatile int num =100;
    public  int showMoney() {
    return num;
    }

    // 存钱
    public void put(int x)  {
        num += x;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "取出"+x+",余额"+num);
    }

    // 取钱
    public void get(int x) {
        num -= x;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "取出" + x + "，余额" + num);
    }

}
