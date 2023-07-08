package com.hainiu001;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("零蛋");
        s.setAge(25);
        s.show();
        Student s2 = new Student("李四",24);
        s2.show();
    }
}
