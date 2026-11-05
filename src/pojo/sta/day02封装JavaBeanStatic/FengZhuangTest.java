package pojo.sta.day02封装JavaBeanStatic;

public class FengZhuangTest {
    public static void main(String[] args) {
        FengZhuang f1 = new FengZhuang(18, "张三", 90, 80);
        System.out.println("姓名是：" + f1.name + "，年龄是：" + f1.age + "，数学成绩是：" + f1.mathScore + "，语文成绩是：" + f1.chineseScore);
        System.out.println("总分是：" + f1.totalscore());
        System.out.println("平均值是：" + f1.averagscore());
    }
}
