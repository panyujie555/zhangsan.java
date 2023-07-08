package loop;
//13、（扩展）1 2 3 4 四个数据，从中选择3个数字 组成一个三位数，要求选择的数字不重复。这样的三位数有多少个？

public class text13 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if (i != j && i != k && j != k) {
                    count++;
                    System.out.print(i * 100 + j * 10 + k+" ");
                }
            }
        }
        System.out.println();
    }
        System.out.println(count);

}
}
