package com.dyc.extend.exercise;

public class PC extends Computer{
    private  String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public PC(String CPU, int memory, int disc, String brand) {
        //这里 IDEA 根据继承的规则，自动把构造器的调用写好
        // 这里也体现： 继承设计的基本思想，父类的构造器完成父类属性初始化
        // 子类的构造器完成子类属性初始化

        super(CPU, memory, disc);//父类构造器完成父类属性初始化

        this.brand = brand;//子类构造器完成子类属性初始化

    }
    public void showInfo(){
        System.out.println("信息如下:");
        System.out.println(getdetails()+brand);

    }
}
