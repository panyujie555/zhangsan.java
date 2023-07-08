package loop;

import java.io.IOException;
import java.util.Scanner;

//7、
//
//张三学校教学楼的电梯前排了很多人，他的前面有n个人在等电梯。
// 电梯每次可以乘坐12人，每次上下需要的时间为4分钟（上需要2分钟，下需要2分钟）。
// 假设最初电梯在1层，请帮助张三计算还需要多少分钟才能乘电梯到达楼上。
public class text7 {
    public static void main(String[] args) throws IOException {
        System.out.println(" 请说出张三前面有几个人：");
        Scanner scan = new Scanner(System.in);
        long n =scan.nextLong();
        long wtime = n/12*4;
        System.out.println(wtime + 2);
       }
    }


