package com.dyc.poly.polyarr;

public class Student  extends Person   {
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(int age, String name, double score) {
        super(age, name);
        this.score = score;
    }


    //重写父类say方法


    @Override
    public String say() {
        return super.say()+score;
    }

    //学生特有方法study

    public void study(){

        System.out.println(getName()+"正在学习");
    }

}
