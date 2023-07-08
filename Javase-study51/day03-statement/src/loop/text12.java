package loop;
//12、打印99乘法表
public class text12 {
    public static void main(String[] args) {
        for (int line = 1;line <=9;line++){
            for (int i =1; i <= line;i++){
                System.out.print(i + "*"+line+"="+ i*line + "\t"  );
            }
            System.out.println();
        }
    }
}
