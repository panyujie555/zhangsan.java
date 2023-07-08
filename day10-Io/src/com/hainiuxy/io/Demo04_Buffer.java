package com.hainiuxy.io;

import java.io.*;

public class Demo04_Buffer {
    public static void main(String[] args) throws IOException {
        //字节缓冲输出流：BufferedOutputStream(OutputStream out)

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Users\\admin\\IdeaProjects\\day10-Io\\text.txt"));
        // 写数据
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());
        // 释放资源
        bos.close();

        // 字节缓冲输入流：BufferedInputStream(InputStream in)
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Users\\admin\\IdeaProjects\\day10-Io\\text.txt"));

        // 一次读取一个字节数据
        /*
		int by;
		while ((by = bis.read()) != -1) {
			System.out.print((char) by);
		}
        */

        // 一次读取一个字节数组数据
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }

        // 释放资源
        bis.close();
    }
}
