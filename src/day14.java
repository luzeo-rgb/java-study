public class day14 {
    public static void main(String[] args) {
        int count = 0 ;
        for(int i = 100; i <= 999; i++) {
            int gewei = i % 10;
            int shiwei = i / 10 % 10;
            int baiwei = i / 100;
            if(gewei * gewei * gewei + shiwei * shiwei * shiwei + baiwei * baiwei * baiwei == i) {
                  count++;
                System.out.println("水仙花数：" + i );
            }
        }

        System.out.println();
        System.out.println("水仙花数个数为：" + count);
    }
}
