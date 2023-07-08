package com.hainiuxy.Api2;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }



    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public void setAge(int age) {//18-40
        if (age>=18&&age<=40){
        this.age = age;
    }else {
            //参数不合法 抛出异常
            throw new IllegalArgumentException("年龄必须在18-40之间");
        }
}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


