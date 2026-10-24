public class PhoneTest {
    static void main(String[] args) {
        phone1(args);

    }
    static void phone1(String[] args) {
        phone p1 = new phone();
        p1.brand = "华为";
        p1.color = "黑色";
        p1.price = 3000;
        System.out.println("品牌是:"+ "------" + p1.brand + "------" + "颜色是:"+ p1.color + "------" + "价格是:"+ p1.price);
        phone p2=new phone();
        p2.brand = "小米";
        p2.color = "白色";
        p2.price = 2000;
        System.out.println("品牌是:"+ p2.brand + "------" + "颜色是:"+ p2.color + "------" + "价格是:"+ p2.price);
        Student stu2 = new Student();
        System.out.println("姓名是:"+ stu2.name + "------" + "年龄是:"+ stu2.age);
        p1.call();
        p1.SendMessage();
        }

    }
