package com.dyc.extend;

//输入ctrl+h可以显示类的继承关系

import java.util.Arrays;

public class Sub extends Base {
    public Sub() {
        super("邓裕澄");
        System.out.println("子类Sub()构造器被调用");
    }//无参构造器

    public Sub(String name) {
        super(); //'super()' 调用必须是构造器主体中的第一条语句

        //super()和this都只能放在构造器的第一行,因此这两个方法不能共存在一个构造器中
        System.out.println("子类Sub(String name)构造器被调用");

    }

    public static void main(String[] args) {
        System.out.println("");
    }
}
