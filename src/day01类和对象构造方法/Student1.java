package day01类和对象构造方法;

public class Student1 {
    String name;
    int age;
    public Student1(){
        System.out.println("无参构造方法");
    }
    public Student1(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("有参构造方法");
    }
}