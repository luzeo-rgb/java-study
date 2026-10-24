import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Random;
import java.util.Scanner;

public class day10 {
    static void main(String[] args) {
        GuessNumber();
    }
    public static void GuessNumber() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int Inputnumber = r.nextInt(100) + 1;
        int count = 0;
        while (true) {
            System.out.println("请输入：");
            int guess = sc.nextInt();
            count++;
            if (guess >Inputnumber) {
                System.out.println("太大了");
            } else if (guess < Inputnumber) {
                System.out.println("太小了");
            } else {
                System.out.println("恭喜你，猜对了");
                // 输出猜测次数（循环的次数）
                System.out.println("你猜了" + count + "次");
                break;

            }
        }
    }
}
