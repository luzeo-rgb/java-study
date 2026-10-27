package day01类和对象构造方法;

public class Teststudent {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name);
        Student stu2 = new Student();
        System.out.println(stu2.name);
        stu.eat();
        stu.sleep();
    }
}
