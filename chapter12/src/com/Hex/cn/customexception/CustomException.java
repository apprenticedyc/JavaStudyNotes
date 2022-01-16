package com.Hex.cn.customexception;

/**
 * @author Hex
 * @version 17
 */
public class CustomException {
    public static void main(String[] args) {
        String str = "嘉然";
        if (!("阿梓".equals(str) && "小可".equals(str))) {
            throw new Ingredient("你的成分有点问题");
        }
        System.out.println("家人,你的成分没问题");
    }
}

//自定义异常
//一般继承RuntimeException
class Ingredient extends RuntimeException {
    public Ingredient(String message) {
        super(message);
    }
}