package interface_;
//接口就是给出一些没有实现的方法,封装到一起,到某个类要是用的时候,再根据具体情况把这些方法写出来
public interface InterfaceA {
    //接口里可以写属性
    public int n1=10;
    //也可以写方法
    //(1)在接口中抽象方法可以省略absract关键字
    public void hi();
    //(2)在JDK8之后,允许有默认实现方法,需要使用default关键字修饰
    default public void hahaha(){
        System.out.println("哈哈哈");
    }
    //(3)在jdk8之后,也允许有静态方法
    static public void cry(){
        System.out.println("哭.....");
    }
}
