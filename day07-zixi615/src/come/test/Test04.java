package come.test;

//第4题：
//
//有一群猴子，摘到若干个桃子，当即吃了一半，还不过瘾，又多吃了一个；
// 第二天又将剩下的桃子吃掉一半，又多吃了一个。以后每天都吃掉前一天剩下的一半零一个。
// 到第10天想再吃时，见只剩下一个桃子了。求第一天共摘了多少？（8分）
public class Test04 {
    public static void main(String[] args) {
        //第十天有1个，第9天有3个，第八天有7个  ——第一天有
        int d1 = 1;
        for (int i = 1; i < 10; i++) {
            d1 = (d1 + 1) * 2;

        }
        System.out.println("第一天共摘了：" + d1 );
    }
}
