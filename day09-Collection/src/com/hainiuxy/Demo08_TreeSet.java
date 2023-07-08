package com.hainiuxy;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo08_TreeSet {
    public static void main(String[] args) {
        TreeSet<Teacher> set = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                //o1表示现在要存入的那个元素
                //o2表示已经存入到集合中的元素
                //主要条件
                int result = o1.getAge() - o2.getAge();
                //次要条件
                 result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });
        Teacher t1 = new Teacher("Tom", 20);
        Teacher t2 = new Teacher("Lily", 21);
        Teacher t3 = new Teacher("John", 22);
        Teacher t4 = new Teacher("Lucy", 21);
        Teacher t5 = new Teacher("Jerry", 25);
        Teacher t6 = new Teacher("Jerry", 25);
        set.add(t1);
        set.add(t2);
        set.add(t3);
        set.add(t4);
        set.add(t5);
        set.add(t6);
        //遍历集合
        for (Teacher teacher : set) {
            System.out.println(teacher);


    }
}
}
