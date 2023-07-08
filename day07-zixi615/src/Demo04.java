import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = s.nextLine();
        int zimucount = 0;
        int shuzicount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                zimucount++;
            } else if (Character.isDigit(ch)) {
                shuzicount++;
            }


        }
        System.out.println("该字符串中英文字母出现了 " + zimucount + " 次，数字出现了 " + shuzicount + " 次。");
    }
}
