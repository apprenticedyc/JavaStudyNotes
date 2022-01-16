package codeblockdetail;

public class Codeblock02 {

    //构造器的最前面其实隐含了super()和调用本类普通代码块

    public static void main(String[] args) {
        A_ a_ = new A_();
    }
}

class A_ extends B_ {

    {
        System.out.println("子类代码块被调用");
    }

    public A_() {
        //隐藏内容:
        //(1)super();默认调用父类无参构造器,如果没有的话需要显示调用并且传入对应参数
        //(2)调用本类的普通代码块
        System.out.println("A_构造器被调用");
        System.out.println("ok");
    }
}

class B_ {
    {
        System.out.println("父类代码块被调用");
    }

    public B_() {
        //隐藏内容:
        //(1)super();默认调用object类,但其实没什么卵用
        //(2)调用本类的普通代码块
        System.out.println("B_构造器被调用");
    }
}
//输出:
// 父类代码块被调用
//B_构造器被调用
//子类代码块被调用
//A_构造器被调用
//ok