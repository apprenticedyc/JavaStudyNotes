public class MethodDetail02 {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}
//跨类调用方法A类调用B类方法;需要通过对象名调用
class A {
    public void m1() {
        //创建B类对象,然后再调用方法
        B b =new B();
        b.hi();
    }
}
class B{
    public void hi() {
        System.out.println("B类中的hi()被执行");
    }
}