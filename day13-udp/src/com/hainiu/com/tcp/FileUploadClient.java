package com.hainiu.com.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
//文件上传客户端
public class FileUploadClient {
    public static void main(String[] args) throws IOException {
        int port=6666;
        InetAddress address = InetAddress.getByName("127.0.0.1");
        Socket socket = new Socket(address,port);
        // 创建输入流读取文件
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\admin\\Desktop\\照片\\潘\\王岭东.jpg"));

        // 获取输出流将数据写到网络
        BufferedOutputStream out= new BufferedOutputStream(socket.getOutputStream());
        // 读写操作
        byte[] bytes = new byte[8192];
        int len;
        while ((len = in.read(bytes))!= -1) {
            out.write(bytes, 0, len);
            out.flush();
        }
        // 写出一个结束标记
        socket.shutdownOutput();
        // 获取输入流读取服务端的反馈
        BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);
        // 释放资源
        br.close();
        in.close();
        socket.close();
    }
}
