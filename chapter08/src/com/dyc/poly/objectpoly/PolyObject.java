package com.dyc.poly.objectpoly;

public class PolyObject {
    public static void main(String[] args) {
        //animal编译类型就是Animal,运行类型就是Dog
        Animal animal = new Dog();
        animal.cry();
        //输出小狗汪汪叫
        // 因为运行时,这时即执行到该行时animal运行类型是Dog,所以cry就是Dog的cry


        animal = new Cat();
        //animal 运行类型变为Cat(指向对象改变)  运行类型只看堆内存中真正的对象是谁
        animal.cry();
        //输出小猫喵喵叫,由此可见一个对象引用可以有多种状态
    }
}
