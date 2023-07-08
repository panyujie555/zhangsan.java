package com.hainiuxy.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//2、获取两个数组的交集
//请定义一个方法，参数为两个整数数组，返回值也是整数数组，方法实现获取两个数组中元素的交集。返回值应该包含两个数组中的相同元素，元素顺序不限，但每个相同元素只应该包含一个，也就是取交集部分。如果没有交集，返回空数组。
//请利用Java中集合所学知识，完成上述功能。
public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 3, 9};
        int[] arr2 = {3, 5};
        int[] arr = Getintersection(arr1, arr2);
        System.out.println(Arrays.toString(arr));


    }
    //定义一个获取交集的方法Getintersection
    public static int [] Getintersection (int[] arr1, int[] arr2) {
        //分别将数组 arr1 arr2放进一个集合中
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (Integer integer : set1) {
            if (set2.contains(integer)){
                list.add(integer);
            }
        }
        int[] arr =new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
