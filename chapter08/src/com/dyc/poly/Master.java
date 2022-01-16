package com.dyc.poly;

public class Master {
    private String name;


    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//没有用多态时
//    主人给小狗 喂食 骨头
//    public void feed(Dog dog, Bone bone) {
//        System.out.println("主人 " + name + " 给 " + dog.name + " 吃 " + bone.name);
//
//    } //主人给小猫 喂食 鱼
//
//    public void feed(Cat cat, Fish fish) {
//        System.out.println("主人 " + name + " 给 " + cat.name + " 吃 " + fish.name);
//    }


    //使用多态机制可以统一管理主人喂食物
    //animal编译类型是Animal,可以指向(接受)Animal子类的对象
    //food编译类型是Food,可以指向(接受)FOod子类的对象
    //总结:以父类为编译类型的对象引用可以指向(接受)子类对象
    public void feed(Animal animal, Food food) {
        System.out.println("主人 " + name + " 给 " + animal.name + " 吃 " + food.name);
    }

}
