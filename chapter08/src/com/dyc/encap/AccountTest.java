
package com.dyc.encap;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AccountTest {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = input.next();
        System.out.println("请输入余额");
        double remainder = input.nextDouble();
        System.out.println("请输入密码");
        String password = input.next();
        A a = new A(name, remainder, password);
        System.out.println(a.info());
    }
}



