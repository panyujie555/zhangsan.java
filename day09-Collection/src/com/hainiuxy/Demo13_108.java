package com.hainiuxy;

import java.util.LinkedList;

// * 1-108 编号，卡片拿在手中，拿起一张扔掉，拿起一张放到下面，反复这个操作，直到剩余一张，剩下谁？
//         *
//         * LinkedList 方便操作头尾元素
public class Demo13_108 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <=108; i++) {
            list.add(i);
        }
//        System.out.println(list);
        while (list.size()>1){
            // 扔掉一张
            list.removeFirst();
            // 拿起一张放下面  删除头元素 添加到尾部
            list.addLast(list.removeFirst());
    }
        System.out.println(list.getFirst());
}
}
