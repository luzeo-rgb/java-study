package pojo.sta;

public class static1 {
    private String name;
    private int age;

    public static1() {
    }
    public static1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        for (int i = 0; i < 100; i++) {
            this.age = age;

        }

    }
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
}