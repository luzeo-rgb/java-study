public class day21 {
    static void main(String[] args) {
        int[] array1 = {11, 22, 33, 44, 55, 66};
        int sum = Getnumber(array1);
        System.out.println(sum);

    }

    static int Getnumber(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];

            }

        }
        return sum;
    }
}