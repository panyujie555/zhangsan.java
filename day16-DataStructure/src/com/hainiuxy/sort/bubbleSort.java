package com.hainiuxy.sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

//冒泡排序
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        // 外循环控制需要多少轮的比较
        for (int i = 0; i < arr.length; i++) {
            // 内循环控制每轮比较中的交换过程
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 如果前面的元素大于后面的
                if (arr[j] > arr[j + 1]) {
                    //交换
                   swap(arr,j,j+1);
                }
            }
        }
    }
    public static void swap(int []arr,int i,int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
}