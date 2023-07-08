package Singelenon;
//懒汉式  双重检查锁
public class DoubleCheckedSingleton {
    // 1、私有构造方法 不能让别人创建对象
    private DoubleCheckedSingleton(){

    }
    // 2、声明一个自己的对象
    private static DoubleCheckedSingleton instace = null;
    // 3、对外提供这个唯一的对象
    public static DoubleCheckedSingleton getInstance() {
        // 线程安全问题 只在第一次创建对象时出现
        // 判断对象是否为空
        if (instace==null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (instace == null) {
                    instace = new DoubleCheckedSingleton();
                }
            }
        }
        return instace;
    }

}
