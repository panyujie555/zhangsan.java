package come.test;

import java.lang.reflect.Array;
import java.util.Arrays;

//第3题：（8分）
//
//现有如下两个数组，元素如下：
// 数组a：{11, 33, 55, 77}
// 数组b：{22, 44, 66, 88}
//请编写程序，将两个数组合并为一个数组c；要求包含a、b数组的所有元素即可，无需排序。
//即结果为：{11, 33, 55, 77, 22, 44, 66, 88}
public class Test03 {
    public static void main(String[] args) {
        //定义一个数组a
        int[] a = new int[]{11, 33, 55, 77};
        //定义一个数组b
        int[] b = new int[]{22, 44, 66, 88};
        //定义数组c的长度
        int[] c = new int[a.length + b.length];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        System.out.println(Arrays.toString(c));
    }
}
