public class Demo02 {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1:
                ++num;
            case 2:
                ++num;
            case 3:
                ++num;
            default:
                ++num;
                break;

        }

        System.out.println(num);

    }
}
