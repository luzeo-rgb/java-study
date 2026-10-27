package day01类和对象构造方法;

public class Student1Test {
    public static void main(String[] args) {
        Student1 stu = new Student1();
        Student1 stu2 = new Student1("张三",18);
        System.out.println(stu2.name + stu2.age);
    }
}

