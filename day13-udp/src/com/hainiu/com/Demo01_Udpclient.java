package com.hainiu.com;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo01_Udpclient {
    public static void main(String[] args) throws Exception {
        //创建UDP协议的发送端socket对象
        DatagramSocket socket = new DatagramSocket();
        String str ="123456";
        byte[] bytes = str.getBytes();
        InetAddress addr= InetAddress.getByName("127.0.0.1");
        int port = 10086;
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length,addr,port);
        //发送
        socket.send(packet);
        //释放资源
        socket.close();
    }
}
