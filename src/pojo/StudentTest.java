package pojo;

public class StudentTest {
   public static void main(String[] args) {
        Student S1 = new Student();//无参构造方法
        S1.setName("张三");
        S1.setAge(18);
        S1.setSex("男");
        System.out.println("姓名：" + S1.getName() + "，年龄：" + S1.getAge() + "，性别：" + S1.getSex());
        Student S2 = new Student("李四", 19, "女");
        System.out.println("姓名是：" + S2.getName() + "，年龄是：" + S2.getAge() + "，性别是：" + S2.getSex());
    }
}
