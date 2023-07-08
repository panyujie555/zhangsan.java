package com.hainiuxy.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//这是张三的Java
public class Demo01_Copy {
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();
        FileInputStream in = new FileInputStream("C:\\Users\\admin\\Desktop\\照片\\lqpic.jpg");

        FileOutputStream out = new FileOutputStream("..\\day10-Io\\bb.jpg");
        byte[] bytes = new byte[8192];
        int len;
        while ((len = in.read(bytes)) != -1) {
            out.write(bytes, 0, len);
        }
        in.close();
        out.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }


}
