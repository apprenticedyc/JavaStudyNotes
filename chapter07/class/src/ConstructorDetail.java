public class ConstructorDetail {
    public static void main(String[] args) {
        Person2 wife1 = new Person2("liuyan", 30);//使用第一个构造器
        Person2 wife2 = new Person2("liutao");//使用第二个构造器
        Person2 wife3;
        wife3 =new Person2("yangmi");
        Dog dog = new Dog();

    }
}

//一个类可以有多个不同的构造器,即构造器重载
class Person2 {
    String name;
    int age;

    //第一个构造器
    public Person2(String pName, int pAge) {
        System.out.println("构造器被成功调用");
        name = pName;
        age = pAge;
    }

    //第二个构造器,只指定人名
    //两个构造器名和类名一定要相同,否则视为成员方法
    //构造器是完成对象初始化,并不是创建对象
    //构造器调用是系统创建对象时自动调用不能主动调用
    //如果程序员没有定义构造器,系统会自动给类生成一个无参构造器(也叫默认构造器)

    public Person2(String pName) {
        name = pName;
    }
    /*用javap反编译可显示默认构造器Dog();*/

}
class Dog{
    public Dog(String name$) {

    }
    //一旦定义了自己的构造器,默认的构造器就被覆盖了,!!!就不能再使用默认构造器了!!!
    //除非显示的定义一下即Dog(){}
    Dog(){}
}