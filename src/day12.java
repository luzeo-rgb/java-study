public class day12 {
    static void main(String[] args) {
        for (int number = 10; number >= 0; number--) {
            System.out.println("剩余" + number + "秒");
            if (number == 0) {
                System.out.println("下课了");
            }

        }

    }}