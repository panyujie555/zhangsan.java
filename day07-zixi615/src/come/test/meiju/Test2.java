package come.test.meiju;

public class Test2 {
    enum Color {
        RED,
        GREEN,
        BLUE;
    }

    public static void main(String[] args) {
        //调用values(),values() 返回枚举类中所有的值。
        Color[] arr = Color.values();
        //迭代枚举
        for (Color col : arr) {
            //ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样
            System.out.println(col + " at index" + col.ordinal());
        }
        //使用 valueOf() 返回枚举常量，不存在的会报错 IllegalArgumentExceptio
        System.out.println(Color.valueOf("YELLOW"));
    }
}

