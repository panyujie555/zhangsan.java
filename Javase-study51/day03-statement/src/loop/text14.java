package loop;
//14、（扩展）20元，买可乐，3元一瓶，一个空瓶子能退1元，请问能买多少瓶？？ 不允许赊账。
public class text14 {
    public static void main(String[] args) {
        int money =20;
        int coco =3;
        int sy =0;
        int sum = 0;
        while (money >= coco){
           int kl= money / coco;
           sum+=kl;
           int sym = money % coco;
           money = sym + kl;
        }
        System.out.println(sum);
    }
}
