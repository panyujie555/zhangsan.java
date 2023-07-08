package com.hainiu.com.tcp2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//文件上传服务端
public class FileUploadServer  {
    public static void main(String[] args) throws IOException {
        int port=6666;
        ServerSocket serverSocket = new ServerSocket(port);
        // 一台服务器响应多个请求
        // 创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                10,
                15,
                30,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(5),//阻塞序列
                Executors.defaultThreadFactory(), //创建线程工厂
                new ThreadPoolExecutor.AbortPolicy());

        // 有一个请求 就建立一次连接
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("建立连接成功");
            // 建立一次连接 就开启一条线程完成数据的传输
            pool.submit(new FileUploadRunnable(socket));
        }
//        serverSocket.close();
    }
}