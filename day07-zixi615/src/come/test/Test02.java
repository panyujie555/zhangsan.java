package come.test;

import static jdk.nashorn.internal.objects.NativeMath.max;
import static jdk.nashorn.internal.objects.NativeMath.min;

//第2题：
//在某次考试中，10位同学的成绩如下：
//double[] score = {77.1, 88.1, 76.1, 56.1, 87.1, 98.1, 55.1, 94.1, 39.1, 96.1};
//请编写程序，计算本次考试这些同学的最高分、最低分和平均分。（7分）
public class Test02 {
    public static void main(String[] args) {
        double[] score = {77.1, 88.1, 76.1, 56.1, 87.1, 98.1, 55.1, 94.1, 39.1, 96.1};
        double sum = score[0];
        double max = score[0];
        double min = score[0];
        for (int i = 1; i < score.length; i++) {
            sum += score[i];
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }
        double avg = sum / score.length;
        System.out.println("这些同学的最高分为：" + max);
        System.out.println("这些同学的最低分为：" + min);
        System.out.println("这些同学的平均分为：" + avg);
    }
}
