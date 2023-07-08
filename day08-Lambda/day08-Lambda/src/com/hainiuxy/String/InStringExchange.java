package com.hainiuxy.String;
//7、int和String互换练习
public class InStringExchange {
    public static void main(String[] args) {
        // 将int类型转换为String类型
        int a=25;
        String str = String.valueOf(a);
        System.out.println("int转为String后的结果为：" + str);
        // 将String类型转换为int类型
        String str1 = "25";
        int b = Integer.parseInt(str1);
        System.out.println("String转为int后的结果为：" + b);
    }

}
