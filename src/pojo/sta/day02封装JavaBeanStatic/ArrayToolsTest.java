package pojo.sta.day02封装JavaBeanStatic;

public class ArrayToolsTest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int max = ArrayTools.getMax(arr);
        double   average = ArrayTools.getAverage(arr);
        System.out.println("最大值是: " + max );
        System.out.println("平均值是: " + average );
    }
}
