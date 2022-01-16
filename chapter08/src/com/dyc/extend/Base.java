package com.dyc.extend;

public class Base {
    String name;
    public Base(String name){
        System.out.println("父类有参构造器被调用");
    }

    public Base() {
        System.out.println("父类无参构造器被调用");
    }
}
