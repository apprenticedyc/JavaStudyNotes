package single;

/**
 * 懒汉式单例模式
 */
public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);//执行这句时会进行类加载,但是不会连带这创建一个对象

        //只有在显示调用了getInstance 才会new一个对象
        //所以叫懒汉式
        Cat cat1=Cat.getInstance();
        System.out.println(cat1);
        Cat cat2=Cat.getInstance();//再次调用getinstance不会再创建第二个对象,cat1和cat2指向同一个对象
    }
}

class Cat {
    private String name;
    static  int n1;

    private Cat(String name) {//还是先构造器私有化
        System.out.println("构造器被调用");
        this.name = name;
    }

    private static Cat cat;//声明一个对象(默认为null),而不是直接创建一个对象实例


    public static Cat getInstance() {//提供一个getInstance方法来获取对象
        if (cat == null) {
            cat = new Cat("木木");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

}
