public class This01 {
    public static void main(String[] args) {
        Dog9 pupppy = new Dog9("xiaobai", 3);
        System.out.println("puppy hashcode=" + pupppy.hashCode());
        System.out.println(pupppy.name + "\n" + pupppy.age);
        T test = new T();//对应第一个构造器
    }
}

class Dog9 {

    String name;
    int age;

    public Dog9(String name, int age) {
        //根据作用域原则,构造器中的name(age)就是局部变量.两个都是.这样也就没有给属性赋值
        //this只能用在方法中
        //this.name就是当前对象(调用该方法的对象)的属性name 右边的还是局部变量
        //this相当于一个 引用 指向对象本身 保留在
        //总而言之哪个对象调用,this就代表哪个对象
        this.name = name;
        System.out.println("this hashcode=" + this.hashCode());
        this.age = age;
    }

    //输出哈希码
    //this hashcode=1324119927
    //puppy hashcode=1324119927
    //说明this和实例的"地址"是一样的
    Dog9() {
    }
}
class T{
    public T(){

        //用this访问其他构造器
        //!!!this();能且仅能用在构造方法中!!!
        this("Andy",18);
        //如果访问构造器语句不在方法的第一句会报错:
        // 'this()' 调用必须是构造函数主体中的第一条语句

        //所以要把sout放在this语句下面
        System.out.println("第一个构造器");
    }
    public T(String name,int age){
        System.out.println("访问第二个构造器");
    }
}
