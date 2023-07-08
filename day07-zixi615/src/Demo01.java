public class Demo01 {
    //一个小球从高处落下，落地后反弹的高度是原来高度的一半，然后再次落下。请编写程序计算，
    // 如果小球的原始高度为100米，那么在第10次落地后，反弹高度是多少？
    // 在第10次反弹到达最高点时，经过的总路程是多少？
    public static void main(String[] args) {
        double height =100;
        double ftgd =0;
        int i=0;
        double sum =0;

//        while(i<10){
//            height = height/2;
//            i++;
//            if (i==10){
//                System.out.println(height);
//                break;
//            }
//        }
        for (i=0;i<10;i++){
            sum += height;
            ftgd=height/2;
            height -=height/2;
            sum+=ftgd;
        }
        System.out.println("经过的总路程："+ sum);


    }
}
