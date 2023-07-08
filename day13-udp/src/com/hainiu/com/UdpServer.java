package com.hainiu.com;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {
    public static void main(String[] args) throws Exception {
        // 创建接收端Socket对象 -- 绑定指定端口启动
        int port = 10086;
        DatagramSocket socket = new DatagramSocket(port);
       while (true) {
           // 接收数据 -- 使用包裹接收
           byte[] bytes = new byte[1024];
           DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
           socket.receive(packet);
           // 解析包裹
           // 获取发送主机
           String hostAddress = packet.getAddress().getHostAddress();
           // 获取缓冲区数据
           byte[] data = packet.getData();
           //获取数据长度
           int length = packet.getLength();
           String str =new String(data,0,length);
           System.out.println(str);
           System.out.println(hostAddress);

       }
//        socket.close();

    }
}
