package pojo.sta.day02封装JavaBeanStatic;

public class FengZhuang {
    String name;
    int age;
    double mathScore;
    double chineseScore;
    double totalscore;
    double averagscore;
    public FengZhuang (int age , String name, double mathScore, double chineseScore){
       this.name = name;
       this.age = age;
       this.mathScore = mathScore;
       this.chineseScore = chineseScore;
    }
    public double totalscore(){
        return mathScore + chineseScore;
    }
    public double averagscore(){
        return (mathScore + chineseScore) / 2;
    }
}
