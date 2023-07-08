package Atomic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo04 {
//    public static void main(String[] args) throws IOException {

//        Properties properties = new Properties();
//        properties.setProperty("name", "Tom");
//        properties.setProperty("age", "23");
//        properties.setProperty("address", "beijing");
//        properties.setProperty("tel", "12345678");
//
//        // 写到流中
//        FileOutputStream out = new FileOutputStream("D:\\Users\\admin\\IdeaProjects\\day12-Thread\\resources\\123.properties");
//        // 注释信息的中文 会以 unicode 编码方式展示
//        properties.store(out, "this is tom's massage");
//
//        out.close();

//    }

    public static void main(String[] args) throws IOException {


            Properties properties = new Properties();
            FileInputStream stream = new FileInputStream("D:\\Users\\admin\\IdeaProjects\\day12-Thread\\resources\\123.properties");
            properties.load(stream);

            properties.forEach((k, v) -> System.out.println(k + "=" + v));
            stream.close();

        }
    }
