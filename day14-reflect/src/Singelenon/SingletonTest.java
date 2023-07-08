package Singelenon;

public class SingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                DoubleCheckedSingleton instance = DoubleCheckedSingleton.getInstance();
                System.out.println(instance);
            }).start();

        }
    }

    }


