package com.hainiuxy.reflect1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

// 越过泛型的编译期检查
//请在泛型声明为String的List集合中 添加一个Integer数据
public class Demo02 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
//        list.add(100);
        // 泛型擦除：泛型是编译期的安全检测机制，防止不匹配的数据类型出现。
        // 在运行期，JVM会对泛型擦除。把数据当成Object类型处理。获取元素时会自动向下转型，因为转换已经是安全的了。

        // 反射获取ArrayList类的add方法 获取时 将参数设置为Object类型
        Class<ArrayList> clazz = (Class<ArrayList>) list.getClass();
        Method method = clazz.getMethod("add", Object.class);
        method.invoke(list,"world");
        method.invoke(list,100);
        method.invoke(list,new Object());

        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}
