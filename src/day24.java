public class day24 {
    static void main(String[] args) {
        int [] arr = {44,332,213,14,15};
       int sum = getsum(arr);
       System.out.println("偶数求和是："+sum);
       int max = getmax(arr);
       System.out.println("最大值是："+max);

    }
     public static int getsum(int[] arr) {
      int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
            sum += arr[i];

        }
            }
            return sum;

        }

     public static int getmax(int[] args) {
         int max = args[0];
         for (int i = 0; i < args.length; i++) {
             if (args[i] > max) {
                 max = args[i];
             }
         }
         return max;
     }
    }
