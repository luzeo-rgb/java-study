import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean oushu = number % 2 == 0;
        if (oushu){
            number = number / 2;
            System.out.println("这个数是偶数，所以这个数除以2=" + number);
        } else {
            number = number * 3 + 1;
            System.out.println("这个数是奇数，所以这个数乘以3再加1=" + number);

            }
        }
    }


