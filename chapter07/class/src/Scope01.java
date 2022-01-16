public class Scope01 {
    public static void main(String[] args) {
        People p1 = new People();
        Test t1 = new Test();
        t1.test01();
        t1.test02(p1);
    }
}

//属性(全局变量)可以被本类使用,或其他类使用(通过对象调用)
//对象调用可以new一个对象也可以通过参数传入对象名使用
//局部变量:只能在本类中对应的方法中使用

//全局变量可以加修饰符,局部变量不行
class Test {
    //第一种跨类访问对象属性
    public void test01() {
        People p1 = new People();
        System.out.println(p1.name);
    }
//第二种跨类访问对象属性
    public void test02(People p) {
        System.out.println(p.name);
    }
}

class People {
    String name = "Andy";

}