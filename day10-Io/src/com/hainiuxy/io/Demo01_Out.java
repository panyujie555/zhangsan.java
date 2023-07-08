package com.hainiuxy.io;

import java.io.FileOutputStream;
import java.io.IOException;

//字节输出流 写出数据
public class Demo01_Out {
    public static void main(String[] args) throws IOException {

        // 创建字节输出流对象指向文件
        // 1、文件所在的目录必须存在
        // 2、如果文件不存在，会自动创建；如果文件存在，那么覆盖写入；
        // 3、如果需要追加写入，使用 FileOutputStream(String name, boolean append) 构造方法 第二个参数传递 true
        // 4、流对象一定要指向文件，不能指向目录
        // public FileOutputStream(String name, boolean append)
        FileOutputStream out = new FileOutputStream("D:\\Users\\admin\\IdeaProjects\\day10-Io\\text.txt");
        //写出数据
        out.write(97);
        out.write(98);
        // public void write(byte b[]) -- 写出一个字节数组
        byte[] bytes =new byte[]{65,66,67,68,69};
        out.write(bytes);
        // public void write(byte b[], int off, int len) -- 写出字节数组的一部分
        out.write(bytes,0,3);
        out.write("hello".getBytes());
        out.write("\r\n".getBytes());
        out.write("world".getBytes());
        //释放资源
        out.close();



    }
}
