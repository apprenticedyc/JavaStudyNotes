package com.dyc.poly.polyarr;

public class Teacher extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher(int age, String name, double salary) {
        super(age, name);
        this.salary = salary;
    }

    //重写父类say方法

    @Override
    public String say() {
        return super.say()+salary;
    }

    //子类特有方法teach
    public void teach(){
        System.out.println("老师" +getName()+ "正在受精");
    }
}
