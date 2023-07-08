package com.hainiuxy.test;

import java.util.HashMap;
import java.util.Map;

public class test3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Tom", "java");
        map.put("Jerry", "mysql");
        map.put("Lucy", "hadoop");
        map.put("Lily", "oracle");
        map.put("Jack", "linux");
        map.put("Rose", "oracle");
        map.put("John", "oracle");
//        System.out.println(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String name = entry.getKey();
            String subject = entry.getValue();
            if (name.startsWith("J")) {
                System.out.println(name + "=" + subject);
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String name = entry.getKey();
            String subject = entry.getValue();
            if (subject.equals("oracle")){
                System.out.println(name);
            }
        }
    }

}
