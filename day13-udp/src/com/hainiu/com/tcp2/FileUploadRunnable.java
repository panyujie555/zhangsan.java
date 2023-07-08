package com.hainiu.com.tcp2;

import javax.naming.Name;
import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class FileUploadRunnable implements Runnable {
    private Socket socket;

    public FileUploadRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // 接收连接 -- 返回Socket对象
        FileOutputStream out = null;
        try {
            // 获取输入流 读客户发送的文件数据
            // 开输出流 指向本地文件 -- 放到当前模块下
            InputStream in  = socket.getInputStream();
            // 服务端 文件名称固定，造成文件只有一个
            String name = UUID.randomUUID().toString().replaceAll("-", "");
            out = new FileOutputStream("D:\\Users\\admin\\IdeaProjects\\day13-udp\\src\\com\\hainiu\\com\\"+ name+".jpg");


            // 读写操作
            byte[] buffer = new byte[8192];
            int len;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);

            }

            // 获取输出流想客户端写出反馈
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("文件传输成功");
            bw.newLine();
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            if (out!= null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //断开连接
            if (socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
//        serverSocket.close();


    }
}
