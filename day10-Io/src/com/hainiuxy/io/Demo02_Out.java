package com.hainiuxy.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02_Out {
    public static void main(String[] args) {
        // 声明输出
        FileOutputStream out = null;
        try {
            // 创建流对象
            out = new FileOutputStream("D:\\Users\\admin\\IdeaProjects\\day10-Io\\text.txt");
            // 写数据
            out.write(97);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 不管有没有异常 都会执行 除非JVM退出
            // 通常用于资源的释放操作
            // 如果流创建成功了 才关闭
            if (out != null) {
                try {
                    // close方法本身有异常 单独try
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
