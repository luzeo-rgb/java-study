public class day23 {
    public static void main(String[] args) {
       int arr[] = {5,44,33,55,22};
       int sum = 0;
       for (int i = 0 ; i < arr.length; i++){
           if (arr[i] % 2 == 0){
               sum += arr[i];
           }
       }
       System.out.println("偶数和为: " + sum);
    }
}
