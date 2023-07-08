package com.hainiuxy.String;

//5、查询一个字符串中某个关键词出现的次数
public class String03 {
    public static void main(String[] args) {
        String str = "古人有很多描述桃花的诗句。" +
                "白居易在《大林寺桃花》中说：人间四月芳菲尽，山寺桃花始盛开；" +
                "《题都城南庄》中说：人面不知何处去，桃花依旧笑春风；" +
                "王维在《桃源行》中说：渔舟逐水爱山春，两岸桃花夹古津...春来遍是桃花水，不辨仙源何处寻；" +
                "唐寅在《桃花庵歌》中也描述：桃花坞里桃花庵，桃花庵里桃花仙。桃花仙人种桃树，又摘桃花换酒钱";
        int count = 0;
        int index = 0;
        String key ="桃花";
        while ((index = str.indexOf(key, index)) != -1){
            count++;
            index +=key.length();
        }
        System.out.println(count);


    }
}

