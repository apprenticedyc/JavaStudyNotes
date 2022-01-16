package innnerclass;

public class InnerClass01 {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.m1();
        System.out.println("调用了m1方法的outer01 hashcode"+outer01);
    }
}

class Outer01 {
    private int n1 = 100;

    private void m2() {
        System.out.println("外部类方法m2被调用");
    }

    public void m1() {
        //1.局部内部类是定义在外部类的局部位置,通常在方法中
        //(2)局部内部类不能用访问修饰符修饰{ 因为他是一个局部变量 },但是可以用final修饰
        //(3)作用域:仅仅在定义它的方法或代码块中,如下面这个类只能在m1方法中使用,相当于一个局部变量
        final class Inner01 {
            private int n1=200;
            public void f1() {
                //(1)局部内部类可以直接访问局部外部类的所有成员,包括私有的,如下所示.
                //******如果外部类和内部类的成员重名,默认遵循就近原则
                System.out.println("内部类n1= " + n1);
                //******如果要访问外部类的成员则只要使用(外部类名.this.成员)去访问
                //######  Outer02.this  实际上是外部类的一个对象,谁在调用m1,谁就是这个对象
                System.out.println("外部类n1= "+Outer01.this.n1);
                m2();
                //证明:
                System.out.println("Outer01.this hashcode = "+Outer01.this);
            }
        }
        //外部类在[方法中] 可以创建Inner01对象,然后调用方法即可,如下
            new Inner01().f1();
    }

}

