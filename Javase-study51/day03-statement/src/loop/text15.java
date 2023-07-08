package loop;

//15、（扩展）有一个容量为10L的空水桶。
//水桶的上面开始往里灌水，同时下面开始往出流水。
//第一分钟灌水的速度是1L/min，第二分钟灌水的速度是2L/min，第三分钟灌水的速度是3L/min，以此类推。
//而流水的速度固定是3L/min。那么请问几分钟之后，水桶里能保持灌满水的状态？
public class text15 {
    public static void main(String[] args) {
        int water = 0;//定义桶中已有的水量开始是0L
        int minute = 0;//定义变量代表分钟数
        while (water < 10) {//循环判断
            minute++;//每次循环给分钟数加1
            water = water + minute - 3;//每分钟计算桶里的水量
            if (water < 0) {
                water = 0;
            }
            System.out.println(minute + "分钟" + water + "L");
        }
        System.out.println(minute + "分钟之后，水桶里能保持满水的状态");
    }
}

