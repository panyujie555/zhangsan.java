package com.hainiuxy.reflect1;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.stream.Stream;

//反射
//    读取配置文件 动态创建对象
public class Demo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        /*Student s = new Student();
        s.study();*/


        /*Teacher t = new Teacher();
        t.teach();*/

        // 利用反射动态创建对象 并动态调用方法
        // 读配置信息
        InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("obj.properties");

        Properties properties = new Properties();
        properties.load(stream);

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        // 类名  方法名
        Class<?> clazz = Class.forName(className);

        Object obj = clazz.getDeclaredConstructor().newInstance();

        // 获取方法
        Method method = clazz.getMethod(methodName);

        // 执行
        method.invoke(obj);
    }
}
