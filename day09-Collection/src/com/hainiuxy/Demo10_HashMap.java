package com.hainiuxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo10_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("张无忌", "赵敏");
        map.put("蒙古小王子", "赵敏");
        // 通过键找值  map.keySet();
        // 获取所有的键
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }
        System.out.println("---------------");
        // 获取所有的键值对映射关系
        // 遍历得到每一个键值对映射关系  map.entrySet();
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }


    }
}
