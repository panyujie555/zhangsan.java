package com.hainiuxy.io3;

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        read();
//        write();

    }

//反序列化

public static void read() throws IOException, ClassNotFoundException {
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Users\\admin\\IdeaProjects\\day10-Io\\text.txt"));
    Object obj = ois.readObject();
    Student s = (Student) obj;
    System.out.println(s.getName()+","+s.getAge());
    ois.close();
}
// 序列化
public static void write() throws IOException {
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Users\\admin\\IdeaProjects\\day10-Io\\text.txt"));
    Student s = new Student("佟丽娅",30);
    oos.writeObject(s);
    oos.close();
}
}