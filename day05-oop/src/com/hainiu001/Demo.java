package com.hainiu001;

public class Demo {
    public static void main(String[] args) {
        //对象
        Fu f = new Fu();
        f.show();
        ZI z = new ZI();
        z.method();//自己的方法
        z.show();//继承父类的方法
    }
}
