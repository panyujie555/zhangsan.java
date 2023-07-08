package com.hainiuxy.io;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Users\\admin\\IdeaProjects\\day10-Io\\src\\com\\hainiuxy\\io\\text.txt");
        System.out.println(file.createNewFile());
    }
}
