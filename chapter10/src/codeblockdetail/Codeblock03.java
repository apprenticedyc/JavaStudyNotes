package codeblockdetail;

public class Codeblock03 {
    public static void main(String[] args) {
        BBBB bbbb = new BBBB();
    }

    //1.先进行类加载
    //(1)先加载父类(追到顶级父类)
    // 父类静态属性初始化(可能会调用静态方法)和静态代码块的执行,二者执行顺序按照类中定义顺序
    //(2)再加载子类
    //子类静态属性初始化(可能会调用静态方法)和静态代码块的执行,二者执行顺序按照类中定义顺序


    //2.再创建对象
    //先从子类构造器开始
    //(1)执行子类构造器super();调用父类无参构造器
    //具体:并执行父类普通代码块和父类普通属性初始化,优先级看定义顺序

    //(2)父类构造器的其他语句

    //(3)执行子类代码块和子类普通属性初始化

    //(4)执行子类构造器中的其他语句
}


class BBBB extends AAAA{
    {
        System.out.println("子类普通代码块");
    }

    static {
        System.out.println("子类静态代码块");
    }
    public BBBB() {
        System.out.println("子类构造器被调用");
    }
}

class AAAA {
    {
        System.out.println("父类普通代码块");
    }

    static {
        System.out.println("父类静态代码块");
    }
    public AAAA() {
        System.out.println("父类构造器被调用");
    }
}

