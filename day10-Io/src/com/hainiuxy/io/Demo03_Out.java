package com.hainiuxy.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03_Out {
    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("D:\\Users\\admin\\IdeaProjects\\day10-Io\\text.txt")){
            out.write(98);

        }catch (IOException e){
            e.printStackTrace();
        }





    }
}
