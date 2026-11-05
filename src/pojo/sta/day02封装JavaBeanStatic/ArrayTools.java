package pojo.sta.day02封装JavaBeanStatic;

public class ArrayTools {
    public static int getMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double getAverage(int arr[]) {
        double average = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / arr.length;
        return average;
        //数组转字符串

        }
    }
