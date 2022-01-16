package homework.homework11;

public class Teacher extends Person {
    private int work_age;

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }


    public Teacher(int age, String name, int work_age) {
        super(age, name);
        this.work_age = work_age;

    }

    public void teach (){

        System.out.println("我会好好教书");
    }
    @Override
    public String play() {
        return "张飞爱玩象棋";
    }


}
