package com.hainiuxy.io2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.NetworkInterface;

public class ObjectInputStremDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //创建一个反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Users\\admin\\IdeaProjects\\day10-Io\\text.txt"));
        //Object readObject()：从ObjectInputStream读取一个对象
        Object obj = ois.readObject();
        Student s =(Student) obj;
        System.out.println(s.getName()+" ,"+s.getAge());
        ois.close();



    }
}


