package loop;
//需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫米。请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
public class text10 {
    public static void main(String[] args) {
        double zf = 8844430;
        double paper = 0.1;
        int count = 0;
        while (paper <= zf) {
            paper *= 2;
            count++;
            System.out.println(paper);
        }
        System.out.println(count);
    }
}
