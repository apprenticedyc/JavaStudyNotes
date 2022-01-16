package innnerclass;

public class MemeberInnerClass {
    public static void main(String[] args) {
        Outer03 outer03 = new Outer03();
        outer03.t1();

        //外部其它类.使用成员内部类的两种方式:
        Outer03.Inner03 inner03 = outer03.new Inner03();
        //第二方式 在外部类中，编写一个方法，可以返回 Inner08对象
        Outer03.Inner03 inner04 = outer03.getInner03();
    }
}

class Outer03 {
    private int n1 = 10;
    public String name = "tommy";

    //成员内部类
    //成员内部类也可以直接访问外部类的所有成员包括私有的
    //如果外部类和内部类的成员重名了,会遵循就近原则
    //可以通过 外部类名.this.属性来访问外部类成员
    //成员内部类作用域在Outer03中,外部类的成员方法可以调用 调用方式:创建成员内部类的对象,然后再使用相关方法
    //因为是成员,所以可以加访问修饰符
    public class Inner03 {
        public void say() {
            System.out.println("成员内部类被调用");
        }
    }

    public void t1() {
        new Inner03().say();
    }


    public Inner03 getInner03() {
        return new Inner03();
    }

}



