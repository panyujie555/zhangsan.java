import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class taxt {
    //斐波那契数列 1 1 2 3 5 8 13 21
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第n项：");
        int n = sc.nextInt();
        //存储每个月兔子对数
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        System.out.println(arr[n - 2]);
    }
}
