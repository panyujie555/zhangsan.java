package com.hainiuxy;

import javafx.scene.control.DatePicker;

import java.util.HashMap;
import java.util.Scanner;



// 4、Map
//    历届世界杯举办时间和冠军国家如下：
//    1930 乌拉圭
//    1934 意大利
//    1938 意大利
//    1950 乌拉圭
//    1954 西德
//    1958 巴西
//    1962 巴西
//    1966 苏格兰
//    1970 巴西
//    1974 西德
//    1978 阿根廷
//    1982 意大利
//    1986 阿根廷
//    1990 西德
//    1994 巴西
//    1998 法国
//    2002 巴西
//    2006 意大利
//    2010 西班牙
//    2014 德国
//    2018 法国
//    2022 阿根廷
//
//    请将这些数据以年份做键，国家名称做值，存储到Map集合中，并实现查找效果：
//    输入年份，可以获取该年份的冠军国家
//    输入国家，可以获取该国家的冠军的年份
//    例如：
//        请输入年份：2018
//        输出：法国
//        请输入年份：2019
//        输出：没有举办世界杯
//
//        请输入国家：阿根廷
//        输出：获得冠军的年份为 1978  1986  2022
//        请输入国家：中国
//        输出：中国没有获得过世界杯冠军
public class Demo14_sjb {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1930, "乌拉圭");
        map.put(1934, "意大利");
        map.put(1938, "意大利");
        map.put(1950, "乌拉圭");
        map.put(1954, "西德");
        map.put(1958, "巴西");
        map.put(1962, "巴西");
        map.put(1966, "苏格兰");
        map.put(1970, "巴西");
        map.put(1974, "西德");
        map.put(1978, "阿根廷");
        map.put(1982, "意大利");
        map.put(1986, "阿根廷");
        map.put(1990, "西德");
        map.put(1994, "巴西");
        map.put(1998, "法国");
        map.put(2002, "巴西");
        map.put(2006, "意大利");
        map.put(2010, "西班牙");
        map.put(2014, "德国");
        map.put(2018, "法国");
        map.put(2022, "阿根廷");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        Integer year = Integer.valueOf(sc.nextLine());
        if (map.containsKey(year)) {
            String value = map.get(year);
            System.out.println(year + "年的世界杯冠军是：" + value);
        }else {
            System.out.println(year+"没有举办世界杯");
        }
        System.out.println("------------------------");
        System.out.println("请输入国家名称：");
        String country = sc.nextLine();
        if (map.containsValue(country)) {
            System.out.println(country+"获得冠军的年份是:"+year);
            // 不能通过值找键
            map.forEach((k,v)->{
                if (v.equals(country)){
                    System.out.println(k);
                }
            });

        }else {
            System.out.println(country + "没有取得过世界杯冠军");

        }
        }
    }



