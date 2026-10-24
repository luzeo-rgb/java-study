public class day13 {
    static void main(String[] args) {
        int sum = 0;
        for (int number = 1; number <= 100; number++) {
            if (number % 2 == 0) {
             sum += number;

            }

        }
        System.out.println("偶数和为：" + sum);
    }
}