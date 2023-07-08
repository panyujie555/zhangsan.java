package com.hainiu.xy.test;

import java.util.Arrays;
import java.util.Random;

//二.请随机生成10个 1-100（包含边界）的随机数，存入数组中，并将数组的最小值挪到最前面，
// 最大值挪到最后面（即最小值与数组中的第一个元素交换，最大值与最后一个元素交换），
// 将挪动前和挪动后的数组分别遍历输出。
public class Test02 {
    public static void main(String[] args) {
        int[] array = getrandom(10, 1, 100);
        System.out.println("挪动前的随机数组为:"+ Arrays.toString(array));
//        /    获取最大值与最小值的索引
        int minindex = 0;
        int maxindex = 0;
        //遍历索引
        for (int i = 1; i < array.length ; i++) {
            if (array[i] < array[minindex]) {
                minindex = i;
            }
            if (array[i] > array[maxindex]) {
                maxindex = i;
            }
        }
        if (maxindex != array.length - 1) {
            int temp = array[array.length - 1];
            array[array.length - 1] = array[maxindex];
            array[maxindex] = temp;
        }
        if (minindex != 0) {
            int temp = array[0];
            array[0] = array[minindex];
            array[minindex] = temp;
        }
        //挪动后的数组为
        System.out.println("挪动后的随机数组为:"+Arrays.toString(array));

    }

    //定义一个获取10个随机数组的方法
    public static int[] getrandom(int length, int min, int max) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
}
