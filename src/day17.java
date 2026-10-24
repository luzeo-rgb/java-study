import java.util.Random;
import java.util.Scanner;

public class day17 {


    static void main(String[] args) {
        guessNumber();
    }
        public static void guessNumber() {
            System.out.println("请输入一个1到100的数字");
            Random random = new Random();

                int r = random.nextInt(100) + 1;
                Scanner scanner = new Scanner(System.in);
            while (true) {
                int guessnumber = scanner.nextInt();
                if (guessnumber > r){
                    System.out.println("太大了");
                } else if (guessnumber < r) {
                System.out.println("太小了");
                } else {
                    System.out.println("恭喜你，猜对了");
                break;
            }
        }
        }}