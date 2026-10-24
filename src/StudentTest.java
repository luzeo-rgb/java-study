public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.name = "李四";
        stu.age = 24;
        stu.study();
        stu.eat();


    }
}
