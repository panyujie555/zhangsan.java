import java.util.Scanner;

public class Demo03_Scanner {
    public static void main(String[] args) {
        // 不使用优惠
        double money1 = 24+8+3;
        //pan判断打折后价格
        money1 = (money1 >= 30 ? money1:money1*0.8);
        //使用优惠价格
        double money2=16+8+3;
        //判断那种花费最少
        double money =money1<money2 ? money1: money2;
        System.out.println(money);

    }
}
