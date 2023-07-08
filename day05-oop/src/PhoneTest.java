public class PhoneTest {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();
        //赋值
        p.brand = "零蛋牌手机";
        p.price =18888;
        // 打印赋值后的成员变量
        System.out.println(p.brand+"..."+p.price);
        // 调用成员方法
        p.call("潘爹");
        p.sendMessage();
    }
}
