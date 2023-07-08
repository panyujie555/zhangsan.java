package com.hainiu.com.tcp2;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FileUploadClient01 {
    public static void main(String[] args) throws IOException {
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        int port = 6666;
        Socket socket = new Socket(ip, port);

        // 读文件
        FileInputStream in = new FileInputStream("C:\\Users\\admin\\Desktop\\照片\\潘\\王岭东.jpg");
        // 写到网络
        try (OutputStream out = socket.getOutputStream()) {

            byte[] bytes = new byte[8192];
            int len;
            while ((len = in.read(bytes)) != -1) {
                out.write(bytes, 0, len);
            }
        }
        // 文件传输完毕 给服务器一个结束标记
        socket.shutdownOutput();

        // 读反馈
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = reader.readLine();
        System.out.println(s);

        // 释放资源
        in.close(); // 指向文件的输入流
        socket.close(); // 网络管道 断开连接
    }

}
