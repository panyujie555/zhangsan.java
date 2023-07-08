package loop;

import java.util.Random;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要猜的数字：");
            int guessnumer = sc.nextInt();
            if (guessnumer > num){
                System.out.println("猜大了");
            } else if (guessnumer < num ){
                System.out.println("猜小了");
            } else{
                System.out.println("猜对了");
            break;
            }
        }
    }
}

