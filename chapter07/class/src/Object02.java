/**
 * @author DYC666
 * @version JDK1.17
 */
public class Object02 {
    public static void main(String[] args) {
        //创建一个对象
        //类名 + 对象名 = new 构造方法名
        Car car1= new Car();
        //cat1不是真正的对象,成为对象名或者(对象引用)类似于一个"指针"存放在栈内存中指向真正的对象
        //真正的对象是new Car() 通过new创建的对象空间(数据)
        //对象属性有默认值,规则参照数组默认值规则
        //int 0，short 0, byte 0, long 0, float 0.0,double 0.0，char \u0000，boolean false，String null
        System.out.println(car1.color+"\n"+car1.name+"\n"+car1.price+"\n" +car1.master+"\n"+car1.ischecked+"\n");
    }

}
class Car {
    String name;
    double price;
    String color;
    String[] master;
    boolean ischecked;
    //属性可以是基本数据类型,也可以是引用数据类型:
    //比如其他的对象或者数组
}