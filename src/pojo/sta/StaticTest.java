package pojo.sta;

public class StaticTest {
    public static void main(String[] args) {
        static1 s1 = new static1();
        s1.setName("娟娟");
        s1.setAge(18);
        System.out.println(s1.getName() + s1.getAge());
        static1 s2 = new static1("东东", 20);
        System.out.println(s2.getName() + s2.getAge());
    }
}