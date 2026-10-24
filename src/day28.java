import java.util.Random;

public class day28 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] arr = new int[10];

        System.out.println("产生的随机数是");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.println(arr[i]);
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("最大值是：" + max);
    }
}