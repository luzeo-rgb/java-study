import java.util.Scanner;

public class day31 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int arr[] = new int[6];
        int sum = getsum(arr, sc);
        int max = max(arr);
        int min = min(arr);
        double aver = aver(arr, sum, max, min);
        System.out.println("总数是" + sum + "平均值是" + aver);
    }
    public static int getsum(int arr[], Scanner sc) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "个");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
                sum += score;
            } else {
                System.out.println("您输入的有误请重新输入");
                i--;
            }
        }
        return sum;
    }
    public static int max(int arr[] ) {
        int max = arr [0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[0]){
                max = arr[i];
            }

        }
     return max;
    }
    public static int min (int arr[] ){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[0]){
                min = arr[i];

            }
        }
        return min;
    }
    public static double aver(int arr[] , int sum , int max , int min) {
        double aver = ((sum - max - min) / (arr.length - 2));
        return  aver;
    }
    }
