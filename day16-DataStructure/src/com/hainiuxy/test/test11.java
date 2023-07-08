package com.hainiuxy.test;

///1、有如下数组：int[] arr = new int[]{51, 7, 66, 2, 96, 88, 48, 76, 46, 26};
//// 请将数组中的最小值与数组的第一个元素交换，最大值与最后一个元素交换，并遍历数组元素进行输出，
public class test11 {
    public static void main(String[] args) {
        int[] arr = new int[]{51, 7, 66, 2, 96, 88, 48, 76, 46, 26};
        int minindex = 0;
        int maxindex = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[minindex]) {
                minindex = i;
            }
            if (arr[i] > arr[maxindex]) {
                maxindex = i;
            }
        }
        if (minindex != 0) {
            int temp = arr[0];
            arr[0] = arr[minindex];
            arr[minindex] = temp;
        }
        if (maxindex != arr.length-1) {
            int temp = arr[arr.length-1];
            arr[arr.length-1] =arr[maxindex];
            arr[maxindex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

