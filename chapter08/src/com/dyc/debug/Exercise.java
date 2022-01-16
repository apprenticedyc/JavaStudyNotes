package com.dyc.debug;
//debug对象创建过程,加深对调试的理解
public class Exercise {
    public static void main(String[] args) {
        Person katy = new Person("katy",18);
        System.out.println(katy);
    }
}


class Person{
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}