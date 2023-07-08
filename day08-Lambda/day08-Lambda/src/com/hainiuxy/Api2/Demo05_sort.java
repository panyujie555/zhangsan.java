package com.hainiuxy.Api2;

import java.util.Arrays;

/**
 * "11 101 88 22 77 33 44 55"，请将其中的数据按照从小到大的顺序排列，组成一个新的字符串，仍然使用空格分割。
 */
public class Demo05_sort {
    public static void main(String[] args) {
        String str = "11 101 88 22 77 33 44  55";
        //拆分
        String[] strArr = str.split("\\s+");
        //字符串数组默认排序顺序是 自然顺序
        int[] arr = new int[strArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        //整数数组排序
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        //再拼回字符串
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
