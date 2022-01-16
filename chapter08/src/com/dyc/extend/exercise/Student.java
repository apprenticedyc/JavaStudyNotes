package com.dyc.extend.exercise;

/**
 * @author DYC666
 */
public class Student extends Person{
   private int id;
   private int score;

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public String say(){
        return super.say()+"id= "+id+"score= "+score;
        //体现super好处代码复用
    }

}
