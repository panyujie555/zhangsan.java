package Volatile;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        // 一条线程负责监视余额 --
        // 在没使用volatile修饰前，线程可能监测不到余额的变化
        new Thread(()->{
            while (true) {
                if (account.showMoney()<=0){
                    System.out.println("没钱了~~~~~~~~~~~~~~~~");
                }
            }
        }).start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // 开一条线程 不断的取钱
        new Thread(()->{
           while (true) {
               account.get(10);

           }
        }).start();
    }
}
