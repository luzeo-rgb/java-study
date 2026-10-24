public class day20 {
    static void main(String[] args) {
        int[] array1 = {11,22,33,44,55,66};
        int[] array2 ={77,88,99};
        int sum = sumnumber(array1);
        System.out.println(sum);

    }

    static int sumnumber(int[] array1) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0)
                sum += array1[i];
        }
     return sum;
    }
    }

