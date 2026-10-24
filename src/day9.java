public class day9 {
    static void main(String[] args) {
        int count = Getnumber();
        System.out.println("一共对折了" + count + "次");
    }

    static int Getnumber() {


        double heightZF = 184;
        double paperZZ = 0.1;
        int count = 0;
        while (heightZF > paperZZ){
            paperZZ = paperZZ * 2;
            count ++;  // count = count + 1;


        }
        return count ;

    }
}