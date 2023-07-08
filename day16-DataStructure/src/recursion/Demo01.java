package recursion;

import java.util.Arrays;

/**
 * 递归算法:**把一个大型复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解**
 * 典型的案例，例如斐波纳契数列（Fibonacci Sequence）
 */

public class Demo01 {
    public static void main(String[] args) {
//        System.out.println(febonacci(15));
//        System.out.println(febonacci2(20));
        System.out.println(febonacci3(20));
    }
    //递归实现
    public static int febonacci(int n) {
        // 出口
        if (n == 1 || n == 2) {
            return 1;
        }
        return febonacci(n - 1) + febonacci(n - 2);
    }
    //动态规划实现   f(n) = f(n-1) + f(n-2)
    public static int febonacci2(int n){
        if (n == 1 || n == 2) {
            return 1;
        }
        // 将数列的每一项存入数组
        int [] arr =new int[n];
        //前两项已知
        arr[0] =1;
        arr[1] =1;
        //从第三项开始
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] +arr[i-2];
        }
        //数组的最后一项
        return arr[n-1];
    }
    public static  int febonacci3(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        // 与当前项有关系的最后一项
        int last = 1;
        // 最后一项的下一个
        int nextToLast = 1;
        // 答案项目
        int answer = 1;
        // 从第三项开始循环计算
        for (int i = 3; i <= n; i++) {
            // f(n) = f(n-1) + f(n-2)
            answer = last + nextToLast;
            // 再计算下一项时
            last = nextToLast;
            // 最后一项的下一个
            nextToLast = answer;
        }
        return answer;

    }


}

