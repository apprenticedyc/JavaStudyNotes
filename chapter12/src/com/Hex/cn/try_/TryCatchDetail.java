package com.Hex.cn.try_;

/**
 * @author Hex
 * @version 17
 */
public class TryCatchDetail {
    public static void main(String[] args) {

        //try catch快捷键:ctrl + alt + t
        try {
            String str = "一二三";
            int a = Integer.parseInt(str);//此处抛出一个异常
            //如果异常发生了,则异常后面的代码不会执行,直接进入catch块
            //如果异常没有发生,则顺序执行try代码块,不会进入到catch
            System.out.println("数字"+a);//发生异常这句就不会执行了
        } catch (NumberFormatException e) {
            System.out.println("异常信息="+e.getMessage());
            System.out.println("程序继续");
            //如果希望不管是否发生异常,都执行某段代码,就写入finally代码块中
        }finally {
            System.out.println("finally代码块被执行");
        }
    }
}
