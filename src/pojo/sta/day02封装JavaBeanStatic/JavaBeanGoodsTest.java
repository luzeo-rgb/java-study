package pojo.sta.day02封装JavaBeanStatic;

public class JavaBeanGoodsTest {
    public static void main(String[] args) {
        JavaGoodsBean in1 = new JavaGoodsBean("张三", "男", 18, 1.75, 75, "12345678901");
        System.out.println(in1.getName());
        System.out.println(in1.getSex());
        System.out.println(in1.getAge());
        System.out.println(in1.getHeight());
        System.out.println(in1.getWeight());
        System.out.println(in1.getPhone());
        JavaGoodsBean in2 = new JavaGoodsBean();
        in2.setName("李四");
        System.out.println(in2.getName());
        in2.setSex("女");
        System.out.println(in2.getSex());
    }
}
