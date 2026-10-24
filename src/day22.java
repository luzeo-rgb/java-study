public class day22 {
    static void main(String[] args) {
        int array1[] = {5, 44, 33, 66, 23};
        int sum = sum(array1);
        System.out.println("最大值为" + sum);

    }
    public static int sum(int[] array) {
        int maxnumber = array[0] ;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxnumber) {
                  maxnumber = array[i];

            }

        }
        return maxnumber;
    }
}
