import java.util.Scanner;

public class Demo03 {
    //随机输入一个数字看数组里的位置
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = s.nextInt();
        int[] arr ={2,5,8,9,4,5,6,7,8,};
        for (int i = 0; i <arr.length-1 ; i++) {
            if (num==arr[i]){
                System.out.println(i);
            }

        }

    }
}
