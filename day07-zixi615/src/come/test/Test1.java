package come.test;

//第1题：
//
//一个小球从高处落下，落地后反弹的高度是原来高度的一半，然后再次落下。请编写程序计算，如果小球的原始高度为100米，那么在第10次落地后，反弹高度是多少？在第10次反弹到达最高点时，经过的总路程是多少？（7分）
public class Test1 {
    public static void main(String[] args) {
        double height = 100;
        double fth = 0;
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += height;
            fth = height / 2;
            height = height / 2;
            sum += fth;
        }
        System.out.println("反弹高度为："+ height);
        System.out.println("第10次反弹到达最高点时，经过的总路程是："+ sum);
    }

}
