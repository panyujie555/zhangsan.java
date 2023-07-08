package com.hainiu.com.tcp;

import com.sun.security.ntlm.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//文件上传服务端
public class FileUploadServer  {
    public static void main(String[] args) throws IOException {
        int port=6666;
        ServerSocket serverSocket = new ServerSocket(port);
        // 接收连接 -- 返回Socket对象
        Socket socket = serverSocket.accept();
        // 获取输入流读取客户端发送的文件数据
        BufferedInputStream in = new BufferedInputStream(socket.getInputStream());
        // 创建指向本地文件的输出流，将文件保存到本地
        BufferedOutputStream out =new BufferedOutputStream(new FileOutputStream("..\\day13-udp\\src\\123.jpg"));
        // 读写操作
        byte[] buffer = new byte[8192];
        int len;
        while ((len = in.read(buffer)) != -1) {
            out.write(buffer, 0, len);
            out.flush();
        }
        // 结束读取
        socket.shutdownInput();
        // 获取输出流想客户端写出反馈
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("文件传输成功");
        bw.newLine();
        //释放资源
        bw.close();
        out.close();
        socket.close();
        serverSocket.close();
    }
}