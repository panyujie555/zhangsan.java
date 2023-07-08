package com.hainiu.com.hashmap;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, User> users = new HashMap<>();
        users.put(1, new User("Tom", 22));
        users.put(2, new User("Jerry", 21));
        users.put(3, new User("John", 23));
        users.put(4, new User("Jack", 20));
        users.put(5, new User("Rose", 24));
        users.put(6, new User("Lily", 25));
        users.put(7, new User("Lucy", 25));
//        System.out.println(users);
        HashMap<Integer, User> hashMap = sortHashMap(users);

        hashMap.forEach((k, v) -> System.out.println(k + "=" + v));

    }

    // 定义方法 按照用户的年龄倒序排序，返回的结果还是HashMap
    public static HashMap<Integer, User> sortHashMap(HashMap<Integer, User> users) {
        // 将 HashMap 中所有的 Entry对象 转换为 List
        ArrayList<Map.Entry<Integer, User>> entries = new ArrayList<>(users.entrySet());
        // 对List集合排序 采用比较器顺序
        Collections.sort(entries,(entry1,entry2)->entry2.getValue().getAge()-entry1.getValue().getAge());
        // LinkedHashMap 是 HashMap 的子类，可以保证迭代顺序
        LinkedHashMap<Integer,User> linkedHashMap = new LinkedHashMap<>();


        // 遍历排序好的 List 集合 将元素都存入 LinkedHashMap
//        entries.forEach(entry -> linkedHashMap.put(entry.getKey(), entry.getValue()));
        for (Map.Entry<Integer, User> entry : entries) {
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        return linkedHashMap;
    }


}

