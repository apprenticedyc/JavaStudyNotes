package homework.homework11;

public class Student extends Person{
    private double stu_id;

    public Student(int age, String name, double stu_id) {
        super(age, name);
        this.stu_id = stu_id;
    }

    public double getStu_id() {
        return stu_id;
    }

    public void setStu_id(double stu_id) {
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我会好好学习");
    }

    @Override
    public String play() {
        return "小明爱玩游戏";
    }
}
