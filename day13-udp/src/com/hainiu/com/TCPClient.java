package com.hainiu.com;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws Exception{
        // 创建客户端Socket对象
        int port =666;
        InetAddress address = InetAddress.getByName("127.0.0.1");
        Socket socket = new Socket(address, port);
        System.out.println("请求建立连接");
        //获取输出流
        OutputStream outputStream = socket.getOutputStream();
        String data = "hello TCP, 你好~~~";
        outputStream.write(data.getBytes());
        //释放资源
        outputStream.close();
        socket.close();
    }
}
