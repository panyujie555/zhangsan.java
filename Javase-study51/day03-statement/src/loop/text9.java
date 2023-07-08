package loop;

//9、
//
//在数学中，素数也称为质数，是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。如果判断一个数n是否是素数，我们可以用其去除2， 3， 4。。。一直除到n-1，如果发现能够整除，那么该数就不是素数，都不能整除，就可以说明是素数。但是，这样计算的效率并不高，因为如果一个数有除了1和它本身之外的因子，那么这些因子里必然有一个是小于等于其平方根的。所以，我们只需要除到这个数的平方根就可以确认了。
//
//请阅读上面的信息，将100以内的所有素数都打印到控制台上。
public class text9 {
    public static void main(String[] args) {
        for (int num = 2; num < 100; num++) {
            boolean flag = true;
            int chu = 2;
            while (chu * chu <= num) {
                if (num % chu == 0) {
                    flag = false;
                    break;
                }
                chu++;
            }
            if (chu * chu > num){
                System.out.println(num);
            }

        }
    }
}
