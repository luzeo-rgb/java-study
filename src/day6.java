public class day6 {
    public static void main(String[] args) {

    }

    public static int evenSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++)
            if (i % 2 == 0) {
                sum += i;
            }
        return sum;

    }

    //案例二
    public static void printNumber() {

        for (int i = 100; i <= 999; i++) {
            int gewei = i % 10;
            int shiwei = i / 10 % 10;
            int baiwei = i / 100;
            if (gewei * gewei * gewei + shiwei * shiwei * shiwei + baiwei * baiwei * baiwei == i) {
                System.out.println("数仙花数为：" + i);


            }
        }
    }


    }


