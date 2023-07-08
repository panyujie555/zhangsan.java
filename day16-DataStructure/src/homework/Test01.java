package homework;

//一.某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。
// 现在算起来，他一共吹熄了236根蜡烛。 请问，他从多少岁开始过生日party的？。
public class Test01 {
    public static void main(String[] args) {
        //假设他的年纪最大不到一百岁,遍历开始过生日的年龄
        for (int i = 0; i < 100; i++) {
            int sum = 0;
            for (int j = i; j < 100; j++) {
                if (sum < 236) {
                    sum += j;
                } else if (sum == 236) {
                    System.out.println("他从" + i + "岁开始过生日");
                    return;
                }else {
                    break;
                }
            }
        }
    }
}
