public class Constructor {
    public static void main(String[] args) {
        //当我们new一个对象时,直接通过构造器指定(初始化)名字和年龄
Person1 p1=new Person1("smith",80);
        System.out.println(p1.age);
        System.out.println(p1.name);
    }
}

class Person1 {
    String name;
    int age;

        //构造器没有返回值也不能写void
    public Person1(String pName, int pAge) {
        //构造方法方法名和类名一致
        //(String pName, int pAge)是构造器形参列表规则和成员方法一致
        System.out.println("构造器被成功调用");
        name = pName;
        age = pAge;
    }
}
