package com.hainiuxy.Test;

//1、古人有很多描述桃花的诗句。
//// 白居易在《大林寺桃花》中说：人间四月芳菲尽，山寺桃花始盛开；
//// 崔护在《题都城南庄》中说：人面不知何处去，桃花依旧笑春风；
//// 王维在《桃源行》中说：渔舟逐水爱山春，两岸桃花夹古津...
//// 春来遍是桃花水，不辨仙源何处寻；唐寅在《桃花庵歌》中也描述：
//// 桃花坞里桃花庵，桃花庵里桃花仙。桃花仙人种桃树，又摘桃花换酒钱...
//请编写程序统计，上面的文本中，桃花一词一共出现的了多少次？
public class Test1 {
    public static void main(String[] args) {
        String str = "古人有很多描述桃花的诗句。\n" +
                "//// 白居易在《大林寺桃花》中说：人间四月芳菲尽，山寺桃花始盛开；\n" +
                "//// 崔护在《题都城南庄》中说：人面不知何处去，桃花依旧笑春风；\n" +
                "//// 王维在《桃源行》中说：渔舟逐水爱山春，两岸桃花夹古津...\n" +
                "//// 春来遍是桃花水，不辨仙源何处寻；唐寅在《桃花庵歌》中也描述：\n" +
                "//// 桃花坞里桃花庵，桃花庵里桃花仙。桃花仙人种桃树，又摘桃花换酒钱...";
        String key = "桃花";
        int count =search(str,key);
        System.out.println(count);

    }

    public static int search(String str, String key) {
        //计数器
        int count = 0;
        //查找一次
        int index;
        while ((index = str.indexOf(key)) != -1) {
            count++;

            str = str.substring(index + key.length());
        }
        return count;
    }
}
