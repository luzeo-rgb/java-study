import javax.lang.model.util.ElementScanner6;
import javax.swing.text.DefaultStyledDocument;
import java.util.Scanner;

public class daya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入饿了么价格：");
        double elm = sc.nextDouble();
        System.out.println("请输入美单价格：");
        double meidan = sc.nextDouble();
         elm = elm * 0.9;
         System.out.println("饿了么价格为：" + elm);
        //美单满30减10
        if (meidan >= 30) {
            meidan = meidan - 10;
            System.out.println("美单价格为：" + meidan);
        }
            if(meidan > elm){
                System.out.println("饿了么更便宜");
            }else{
                System.out.println("美单更便宜");
            }
        }

        }

