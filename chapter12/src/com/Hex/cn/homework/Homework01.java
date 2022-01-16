package com.Hex.cn.homework;

/**
 * @author Hex
 * @version 17
 */
public class Homework01 {
    public static void main(String[] args) {
        EcmfDef.cal(78, 0);
    }
}

class EcmfDef {
    public static double cal(int n1, int n2) {
        double res = 0;
        try {
            res =  n1 / n2;
        } catch (Exception e) {
            System.out.println("发生了除0错误,请重新传入");
        }
        return res;
    }
}