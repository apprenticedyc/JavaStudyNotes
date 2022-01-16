package homework;

public class Manager extends Employee{
    private double bonus;
    //经理特有属性bonus,奖金是多少不确定,因此在构造器中不给bonus,也就是创建manager对象时不会给他的bonus
    //要通过set方法给予一个bonus
    public Manager(double salary, String name, int day) {
        super(salary, name, day);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printsalary() {
        System.out.println("经理"+getName()+ "工资是"+ (getBonus()+ getSalsary()*getDay()*1.2));
    }
}
