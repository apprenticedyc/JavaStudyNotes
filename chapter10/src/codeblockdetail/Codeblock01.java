package codeblockdetail;

public class Codeblock01 {
    public static void main(String[] args) {
        A a = new A();
    }
}


class A {
    //创建一个对象,在一个类中的调用顺序
    //优先级一:
    //静态属性初始化和静态代码块调用优先级相同
    //如果有多个静态代码块和多个静态变量初始化,则按照他们的定义顺序调用


    //优先级二:
    //普通属性初始化和普通代码块调用优先级一样
    //如果有多个静态代码块和多个静态变量初始化,则按照他们的定义顺序调用

    //优先级三:
    //调用构造器
    {
        System.out.println("普通代码块被调用");
    }

    public static int n1 = getN1();
    public int n2 = getN2();


    static {
        System.out.println("静态代码块被调用");
    }


    public A() {
        System.out.println("构造器被调用");
    }

    public static int getN1() {
        System.out.println("静态属性N1初始化");
        return n1;
    }

    public int getN2() {
        System.out.println("普通属性N2初始化");
        return n2;
    }

    //输出结果:
    //静态属性N1初始化
    //静态代码块被调用
    //普通代码块被调用
    //普通属性N2初始化
    //构造器被调用

}