package recursion;
//起点为（0，0），终点为（4， 4）
public class Demo03 {
    public static void main(String[] args) {
        int ans =fun(0,0);
        System.out.println(ans);

    }
    public static int fun(int x, int y){
        //到达边缘。只剩下一种路线
        if (x ==4||y ==4){
            return 1;
        } // 在每个点都可以向右或者向下走一格
        return fun(x+1, y) + fun(x, y+1);
    }
}
