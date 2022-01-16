package single;

/**
 *单例模式:一个类只能有一个对象实例
 */
//饿汉式单例模式:
//只要加载了这个类就会有一个对象实例被创建(类加载时会有静态属性初始化,初始化的同时调用了构造器)很着急,所以叫饿汉式
//饿汉式可能造成创建了对象但是没有使用造成资源浪费,比如在调用该类的其他属性时进行了类加载,那么这个对象实例也随之创建但是没有使用
public class SingleTon01 {
    public static void main(String[] args) {
       Girlfriend instance1= Girlfriend.getInstance();
        System.out.println(instance1);
        Girlfriend instance2= Girlfriend.getInstance();
        System.out.println(instance2);
        System.out.println(instance1.equals(instance2));
        //输出true说明两个是同一个对象
    }
}

class Girlfriend {
    private String name = "哈哈哈";

    private Girlfriend() {
    }//(1)构造器私有化

    private static Girlfriend instance = new Girlfriend();//(2)类的内部创建一个对象

    public static Girlfriend getInstance() {//(3)提供一个公共的静态方法返回instance对象
        return instance;
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
//为什么需要静态方法,因为普通方法就必须创建对象实例才可以调用，这样在其他类中会进行new,而构造器已经私有化了
//无法再调用构造器,也就是无法先创建对象实例再调用方法,所以只能通过类名直接调用静态方法,而静态方法中只能调用静态属性所以内部类也需要static修饰
