package com.Hex.cn.throws_;

import jdk.jshell.spi.ExecutionControl;

/**
 * @author Hex
 * @version 17
 */
// 对于编译异常程序必须处理
// 对于运行异常,程序中如果没有处理,默认就是throws方式处理,比如f2()throws Exception给main
//main再throws Exception给JVM,JVM直接暴力输出异常信息
public class ThrowsDetail {
}

//子类重写父类方法时要么抛出和父类抛出的异常一致,要么为父类抛出异常的子类型
//如下案例所示,NullPointerException是RuntimeException的子类
class Father {
    public void test() throws RuntimeException{
    }
}

class Son extends Father{
    @Override
    public void test() throws NullPointerException {
    }
}