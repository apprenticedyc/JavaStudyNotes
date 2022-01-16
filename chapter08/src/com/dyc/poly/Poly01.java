package com.dyc.poly;

public class Poly01 {
    public static void main(String[] args) {
         Master andy = new Master("我");
        Dog nyotengu = new Dog("女天狗");
        Bone dick = new Bone("几把~");
        andy.feed(nyotengu,dick);
        Cat honoka = new Cat("奶果");
        Fish dick2 = new Fish("几把~");
        andy.feed(honoka,dick2);
        //传统方法每个对象都要写一次feed,因为传进feed的形参列表不同,代码复用性不高,不利于维护
        //解决方案:多态
        //用了多态只要指定feed的形参列表是父类可以接收所有的子类对象(多态特点:运行类型变为子类),不用按照子类的形参再写一遍feed
    }
}
