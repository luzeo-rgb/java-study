import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Getnumber = sc.nextInt();
        System.out.println("奖励你：" );
        if (Getnumber < 0 || Getnumber > 100) {
            System.out.println("成绩不合法");
        } else if (Getnumber >= 95) {
            System.out.println("一辆自行车");
        }else if (Getnumber >= 80) {
            System.out.println("大黄蜂");
        }else if (Getnumber <= 80) {
            System.out.println("皮带炒肉拌面");

        }

    }
}
