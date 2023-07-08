package loop;

import java.util.Scanner;

///*//6、
////
////某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
////      存期    年利率（%）
////      一年    2.25
////      两年    2.7
////      三年    3.25
////      五年    3.6
////请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
////提示：
////存入金额和存入年限均由键盘录入；
////本息计算方式：本金+本金×年利率×时间*/
public class text6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要存的金额：");
        double money = sc.nextDouble();
        System.out.println("请输入你要存的年限：");
        int year = sc.nextInt();
        if (money < 1000 ){
            System.out.println("对不起，我们银行是1000起存。");
        } else{switch (year){
            case 1:{money = money + money*0.0225*1;
                System.out.println(money);
                break;
            } case 2: {money = money + money*0.027*2;
                System.out.println(money);
                break;
            } case 3:{money= money + money*0.0325*3;
                System.out.println(money);
                break;
            } case 5: {money = money+money*0.036*5;
                System.out.println(money);
                break;
            }
        }

        }
    }
}
