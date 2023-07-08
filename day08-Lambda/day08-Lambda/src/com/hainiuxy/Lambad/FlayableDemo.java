package com.hainiuxy.Lambad;

public class FlayableDemo {
    public static void main(String[] args) {
        //匿名内部类
        useFlayable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("让我们飞上天，和太阳肩并肩");
            }
        });
//        System.out.println("----");
//        // Lambda方法
//        useFlayable((String s )->{
//            System.out.println(s);
//            System.out.println("让我们飞上天，和太阳肩并肩");
//        });
        // Lambda方法简介法
        useFlayable((String s) -> System.out.println(s));
        System.out.println("让我们飞上天，和太阳肩并肩");

}














       private static void useFlayable(Flyable f){
            f.fly("风和日丽，适合飞行");

        }

}

