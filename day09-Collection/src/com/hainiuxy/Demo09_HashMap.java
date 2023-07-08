package com.hainiuxy;

import java.util.HashMap;
import java.util.Map;

public class Demo09_HashMap {
    public static void main(String[] args) {
       Map<String,String> map = new HashMap<>();
        // 添加  修改
        // 当键不存在时，添加一对元素，返回null
        // 当键存在时，将值覆盖，将被覆盖的元素返回

        System.out.println(map.put("郭靖", "黄蓉"));
        System.out.println(map.put("杨过", "郭襄"));
        System.out.println(map.put("张无忌", "赵敏"));
        System.out.println(map.put("杨过", "小龙女"));

        System.out.println(map);
    }

}
