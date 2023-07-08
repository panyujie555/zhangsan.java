package recursion;
// 青蛙跳台阶  1-2级   30级多少种跳法
public class Demo02 {
    public static void main(String[] args) {
        int n =5;
        int way = qwjump(n);
        System.out.println("青蛙跳上"+n+"级台阶的方法数为："+way);
    }
    public static int qwjump(int n){
        if (n<=0){
            return n;
        }
        int[] arr=new int[n+1];
        arr[1]=1;
        arr[2]=2;
        for (int i = 3; i <=n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];

    }
}
