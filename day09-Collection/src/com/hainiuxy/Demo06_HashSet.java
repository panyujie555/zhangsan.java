package com.hainiuxy;

import java.util.HashSet;

public class Demo06_HashSet {
    public static void main(String[] args) {


        // 存储学生对象
        HashSet<Student> set=new HashSet<Student>();

        Student s1 = new Student("貂蝉", 17);
        Student s2 = new Student("杨玉环", 18);
        Student s3 = new Student("西施", 18);
        Student s4 = new Student("王昭君", 19);
        Student s5 = new Student("王昭君", 19);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        for (Student stu : set) {
            System.out.println(stu);

        }

    }
}
