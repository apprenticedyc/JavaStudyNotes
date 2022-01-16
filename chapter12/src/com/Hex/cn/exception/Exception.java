package com.Hex.cn.exception;

/**
 * @author Hex
 * @version 17
 */
public class Exception {
    public static void main(String[] args) {
        int n1=1;
        int n2 =0;
        try {
            int res =n1/n2;
        } catch (java.lang.Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            //输出 错误原因:by zero
        }

    }
}
