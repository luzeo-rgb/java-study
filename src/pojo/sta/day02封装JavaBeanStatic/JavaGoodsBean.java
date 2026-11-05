package pojo.sta.day02封装JavaBeanStatic;

public class JavaGoodsBean {
    private String name;
    private String sex;
    private int age;
    private double height;
    private double weight;
    private String phone;
    public JavaGoodsBean() {
    }
    public JavaGoodsBean(String name, String sex, int age, double height, double weight, String phone) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.phone = phone;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex(){
        return sex;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }
}
