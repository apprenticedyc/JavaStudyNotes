package com.dyc.extend.exercise;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("王冰冰",18);
        System.out.println(person.say());
        Person student = new Student("邓裕澄",100,9,100);
        System.out.println(student.say());

    }
}


