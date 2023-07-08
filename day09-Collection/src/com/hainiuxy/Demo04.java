package com.hainiuxy;

import java.util.Stack;

public class Demo04 {
    public static void main(String[] args) {
        //        Vector 数组实现的列表 线程安全  效率低  被ArrayList取代

//        Stack 实现栈数据结构  数据存储特点符合 后进先出(LIFO表) 的特点

        Stack<String> stack = new Stack<String>();
        //压栈
        stack.push("我");
        stack.push("爱");
        stack.push("你");
        // 弹栈
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
