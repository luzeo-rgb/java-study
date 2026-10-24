public class day26 {
    static void main(String[] args ) {
        int arr[] = {1, 2, 3, 4, 5};
        int arr2[] = {102, 103, 104, 105, 106};
        reverseArray(arr2);
    }
    static void reverseArray(int arr[]) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
