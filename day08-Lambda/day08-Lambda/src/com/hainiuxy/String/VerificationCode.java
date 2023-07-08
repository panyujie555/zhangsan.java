package com.hainiuxy.String;

import java.util.Random;
import java.util.Scanner;

//8、在登录注册页面中，除了用户名和密码外，通常也会包含验证码。
//        验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、灌水等行为。
//        请查看Random、String和StringBuilder相关API，定义方法，获取一个包含4个字符的验证/        每一位字符是随机选择的字母和数字，可包含a-z,A-Z,0-9。
//        请编写程序模拟验证码的判断过程，如果输入正确，给出提示，结束程序。
//        如果输入错误，给出提示，验证码刷新，重新输入，直至正确为止。
public class VerificationCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code =getCode();
        System.out.println( code);
        while (true) {
            System.out.print("请输入验证码：");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase(code)) {
                System.out.println("验证码输入正确！");
                break;
            } else {
                System.out.println("验证码输入错误，请重新输入！");
                code = getCode();
                System.out.println("验证码已刷新：" + code);
            }
        }
    }

    //随机产生一个4个字符的验证码
    public static String getCode() {
        StringBuilder sb = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            sb.append(i);
        }
        for (char i = '0'; i <= '9'; i++) {
            sb.append(i);
//            System.out.println(sb.toString());
        }
        Random random = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(sb.length());
            result += sb.charAt(index);
        }
        return result;
    }

}
