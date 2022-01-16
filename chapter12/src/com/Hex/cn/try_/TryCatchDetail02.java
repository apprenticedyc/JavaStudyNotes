package com.Hex.cn.try_;

/**
 * @author Hex
 * @version 17
 */
public class TryCatchDetail02 {
    public static void main(String[] args) {
        //有多个异常的时候可以有多个catch分别捕获不同的异常(整个包起来再try catch)
        //要求子类异常在前,父类异常在后,比如(Exception 在后, NullPointerException 在前)
        //为什么:如果父类在前,子类都会被捕获.会显示已捕捉到子类异常 'java.lang.NullPointerException'
        //如果发生异常只会匹配一个catch
        //当第一个异常抛出时下面代码不执行,直接跳到catch代码块
        try {
            //一个空指针异常如下:
            Person person = new Person();
            person = null;
            person.getName();
            //一个算数异常如下:
            int n1 = 1, n2 = 0,
                    res = n1 / n2;
        } catch (NullPointerException e) {
            System.out.println("空指针异常" + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }


        //try - finally这种用法相当于没有捕获异常,因此程序会直接崩掉.
        // 应用场景:就是执行一段代码,不管是否发生异常,都必须执行某个业务逻辑
        // 执行完finally过后,程序直接退出,由JVM机输出错误信息

    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }
}