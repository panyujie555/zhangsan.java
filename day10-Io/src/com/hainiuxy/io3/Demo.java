package com.hainiuxy.io3;

import java.io.*;
import java.util.ArrayList;

public class Demo {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //创建序列化对象流
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Users\\admin\\IdeaProjects\\day10-Io\\text.txt"));
//        ArrayList<Student> arrayList = new ArrayList<Student>();
//        //2 创建多个学生对象
//        Student s1 = new Student("龙傲天", 18);
//        Student s2 = new Student("李四", 19);
//        Student s3 = new Student("王五", 20);
//        //3.将学生对象添加到集合中
//        arrayList.add(s1);
//        arrayList.add(s2);
//        arrayList.add(s3);
//        //4.将集合对象序列化到文件中
//        oos.writeObject(arrayList);
//        oos.close();
//        反序列化
        //5.创建反序列化流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Users\\admin\\IdeaProjects\\day10-Io\\text.txt"));
//6.将文件中的对象数据,读取到内存中
        Object obj = ois.readObject();
        ArrayList<Student> arrayList = new ArrayList<Student>();
        ois.close();
        for (Student student : arrayList) System.out.println(student.getName() + "," + student.getAge());

    }

}
