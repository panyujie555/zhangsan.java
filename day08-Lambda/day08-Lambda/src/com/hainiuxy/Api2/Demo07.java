package com.hainiuxy.Api2;
// 分组去掉叠词
public class Demo07 {
    public static void main(String[] args) {
        // 现得到如下的字符串：
        String s = "我..我....我.我...我.要.要...要...要..要...要.学..学.学...学.学.编...编.编..编...编...程程..程..程";
        // 请还原出其中的有效信息：我要学编程
        //替换
        String s1 = s.replaceAll("\\.", "");
        System.out.println(s1);
//我我我我我要要要要要要学学学学学编编编编编程程程程   叠词
        String regex ="(.)\\1+";
        String s2 = s1.replaceAll(regex, "$1");
        System.out.println(s2);

    }
}
