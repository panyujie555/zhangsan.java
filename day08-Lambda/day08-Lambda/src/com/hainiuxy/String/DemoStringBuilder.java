package com.hainiuxy.String;

import java.util.Scanner;

//6、回文:柳庭风静人眠昼，昼眠人静风庭柳。
//      香汗薄衫凉，凉衫薄汗香。
//      手红冰碗藕，藕碗冰红手。
//      郎笑藕丝长，长丝藕笑郎。
public class DemoStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段文字：");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        String S = sb.toString();

        if (str.equals(S)){
            System.out.println("是回文");
        }else {
            System.out.println("不是回文");
        }



    }

}
