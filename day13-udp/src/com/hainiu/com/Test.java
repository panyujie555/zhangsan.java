package com.hainiu.com;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
//接收数据的线程
        new Thread(() -> {
            DatagramSocket socket = null;
            try {
                socket = new DatagramSocket(10086);
            } catch (SocketException e) {
                e.printStackTrace();
            }
            while (true) {
                byte[] bytes1 = new byte[1024];
                DatagramPacket p = new DatagramPacket(bytes1,bytes1.length);
                try {
                    socket.receive(p);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println();
                System.out.println(p.getAddress().toString().replaceAll("/+","")+"："+new String(bytes1,0,p.getLength()));
            }
// socket.close();
        }).start();

//发送数据
        DatagramSocket socket = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);
        while (true) {
// System.out.print("我：");
            String str = scanner.nextLine();
            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("255.255.255.255");
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, address,10086);
            socket.send(packet);
        }
    }
}
