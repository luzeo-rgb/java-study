import java.util.Random;

public class day29 {
    static void main(String[] args) {
        Random random = new Random();
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
            System.out.print(arr[i]);
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        System.out.println("最大值是：" + max);
        }
    }
}
